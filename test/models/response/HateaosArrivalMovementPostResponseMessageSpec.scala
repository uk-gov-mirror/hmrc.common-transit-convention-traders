/*
 * Copyright 2021 HM Revenue & Customs
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

package models.response

import org.scalatest.{BeforeAndAfterEach, OptionValues}
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers
import org.scalatestplus.mockito.MockitoSugar
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.libs.json.Json

class HateaosArrivalMovementPostResponseMessageSpec extends AnyFreeSpec with Matchers with GuiceOneAppPerSuite with OptionValues with ScalaFutures with MockitoSugar with BeforeAndAfterEach {
  "HateaosArrivalMovementPostResponseMessage" - {
    "must have valid message structure" in {
      val expectedJson = Json.parse(
        """
          |{
          |  "_links": {
          |    "self": {
          |      "href": "/customs/transits/movements/arrivals/1"
          |    }
          |  },
          |  "arrivalId": "1",
          |  "messageType": "IE007",
          |  "body": "<test>default</test>",
          |  "_embedded": {
          |    "notifications": {
          |      "requestId": "/customs/transits/movements/arrivals/1"
          |    }
          |  }
          |}""".stripMargin)

      val result = HateaosArrivalMovementPostResponseMessage(
        "1",
        "IE007",
        <test>default</test>
      )

      expectedJson mustEqual Json.toJson(result)
    }
  }
}
