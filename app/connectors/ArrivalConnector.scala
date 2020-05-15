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

package connectors

import uk.gov.hmrc.http.{HeaderCarrier, HttpResponse}
import config.AppConfig
import connectors.util.CustomHttpReader
import javax.inject.Inject
import models.domain.Arrival
import play.api.mvc.Headers
import uk.gov.hmrc.http.logging.Authorization
import uk.gov.hmrc.play.bootstrap.http.HttpClient
import utils.Utils

import scala.concurrent.{ExecutionContext, Future}

class ArrivalConnector @Inject()(http: HttpClient, appConfig: AppConfig) extends BaseConnector {

  val arrivalRoute = "/transit-movements-trader-at-destination/movements/arrivals/"

  def post(message: String, headers: Headers)(implicit headerCarrier: HeaderCarrier, ec: ExecutionContext): Future[HttpResponse] = {
    val url = appConfig.traderAtDestinationUrl + arrivalRoute

    val newHeaders = headerCarrier
      .copy(authorization = Some(Authorization(headers.get("Authorization").getOrElse(""))))
      .withExtraHeaders(requestHeaders(): _*)

    http.POSTString(url, message)(CustomHttpReader, hc = newHeaders, ec = ec)
  }

  def put(message: String, arrivalId: String, headers: Headers)(implicit headerCarrier: HeaderCarrier, ec: ExecutionContext): Future[HttpResponse] = {
    val url = appConfig.traderAtDestinationUrl + arrivalRoute + Utils.urlEncode(arrivalId)

    val newHeaders = headerCarrier
      .copy(authorization = Some(Authorization(headers.get("Authorization").getOrElse(""))))
      .withExtraHeaders(requestHeaders(): _*)

    http.PUTString(url, message)(CustomHttpReader, hc = newHeaders, ec = ec)
  }
}
