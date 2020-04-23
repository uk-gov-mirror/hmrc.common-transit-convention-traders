/*
 * Copyright 2020 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers

import connectors.{ArrivalConnector, MessageConnector}
import controllers.actions.AuthAction
import javax.inject.Inject
import models.domain.MovementMessage
import models.domain.MovementMessage.format
import models.request.UnloadingRemarksXSD
import models.response.Message
import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, ControllerComponents}
import services.XmlValidationService
import uk.gov.hmrc.http.HttpErrorFunctions
import uk.gov.hmrc.play.bootstrap.controller.BackendController
import utils.Utils

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}
import scala.xml.NodeSeq

class ArrivalMessagesController @Inject()(cc: ControllerComponents,
                                   authAction: AuthAction,
                                   messageConnector: MessageConnector,
                                   xmlValidationService: XmlValidationService)(implicit ec: ExecutionContext) extends BackendController(cc) with HttpErrorFunctions {

  def createUnloadingPermission(arrivalId: String): Action[NodeSeq] = authAction.async(parse.xml) {
    implicit request =>
      xmlValidationService.validate(request.body.toString, UnloadingRemarksXSD) match {
        case Right(_) =>
          messageConnector.post(request.body.toString, arrivalId).map { response =>
            response.status match {
              case s if is2xx(s) =>
                response.header(LOCATION) match {
                  case Some(locationValue) => Utils.arrivalId(locationValue, fragmentIndex = -2) match {
                    case Success(id) =>
                      Accepted.withHeaders(LOCATION -> s"/customs/transits/movements/arrivals/${Utils.urlEncode(id)}/messages")
                    case Failure(_) =>
                      InternalServerError
                  }
                  case _ =>
                    InternalServerError
                }
              case _ => Status(response.status)
            }
          }
        case Left(_) =>
          Future.successful(BadRequest)
      }
  }

  def getArrivalMessage(arrivalId: String, messageId: String): Action[AnyContent] =
  authAction.async {
    implicit request => {
      messageConnector.get(arrivalId, messageId).map { response =>
        response.status match {
          case s if is2xx(s) => {
            response.header(LOCATION) match {
              case Some(locationValue) => Utils.arrivalId(locationValue) match {
                case Success(id) => {
                  val message = response.json.as[MovementMessage]
                  val responseMessage = Message(s"/movements/arrivals/${Utils.urlEncode(id)}/messages/$messageId", message.date, message.message)
                  Ok(Json.toJson(responseMessage))
                }
                case Failure(_) => InternalServerError
              }
              case _ => InternalServerError
            }
          }
          case _ => Status(response.status)
        }
      }
    }
  }
}