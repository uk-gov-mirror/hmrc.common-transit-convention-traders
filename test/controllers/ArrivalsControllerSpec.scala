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

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{FreeSpec, MustMatchers, OptionValues}
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.http.HeaderNames
import play.api.test.{FakeHeaders, FakeRequest}
import play.api.test.Helpers._

class ArrivalsControllerSpec extends FreeSpec with MustMatchers with GuiceOneAppPerSuite with OptionValues with ScalaFutures {
 "POST /movements/arrivals" - {
   "must return Accepted" in {
     val request = FakeRequest(POST, routes.ArrivalsController.createArrivalNotification().url)
       .withHeaders(FakeHeaders(Seq(HeaderNames.CONTENT_TYPE -> "application/xml")))
     val result = route(app, request).value

     status(result) mustBe ACCEPTED
   }

   "must return BadRequest when Content-Type is JSON" in {
     val request = FakeRequest(POST, routes.ArrivalsController.createArrivalNotification().url)
       .withHeaders(FakeHeaders(Seq(HeaderNames.CONTENT_TYPE -> "application/json")))
     val result = route(app, request).value

     status(result) mustBe BAD_REQUEST
   }

   "must return BadRequest when no Content-Type specified" in {
     val request = FakeRequest(POST, routes.ArrivalsController.createArrivalNotification().url)
     val result = route(app, request).value

     status(result) mustBe BAD_REQUEST
   }
 }
}
