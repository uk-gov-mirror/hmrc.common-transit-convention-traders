package models

import models.ParseError.{AdditionalInfoInvalidCharacters, AdditionalInfoTooLong, AmountStringInvalid, CurrencyCodeInvalid}

import scala.xml.NodeSeq

trait SpecialMention

case class SpecialMentionOther(xml: NodeSeq) extends SpecialMention

case class SpecialMentionGuarantee(additionalInfo: String) extends SpecialMention {
  def toDetails(guaranteeReference: String) : Either[ParseError, SpecialMentionGuaranteeDetails] = {
    if(additionalInfo.length > 18) return Left(AdditionalInfoTooLong("AdditionalInfo is too long"))
    if(additionalInfo.matches("[\\w.]+")) return Left(AdditionalInfoInvalidCharacters("invalid characters in additional info"))

    getCurrencyCode(additionalInfo, guaranteeReference) match {
      case Left(error) => Left(error)
      case Right(currencyOpt) => {
        getAmount(additionalInfo, guaranteeReference, currencyOpt) match {
          case Left(error) => Left(error)
          case Right(amountOpt) => Right(SpecialMentionGuaranteeDetails(amountOpt, currencyOpt, guaranteeReference))
        }
      }
    }
  }

  private def getCurrencyCode(additionalInfo: String, guaranteeReference: String): Either[ParseError, Option[String]] = {
    if(additionalInfo.length > (guaranteeReference.length + 3))
    {
      val currencyStart = additionalInfo.length - guaranteeReference.length - 3
      val currencyEnd = currencyStart + 3
      val currencyCode = additionalInfo.substring(currencyStart, currencyEnd)
      if(currencyCode.matches("[A-Z]{3}"))
      Right(Some(currencyCode))
      else Left(CurrencyCodeInvalid(s"Invalid Currency Code: $currencyCode"))
    }
    else Right(None)
  }

  private def getAmount(additionalInfo: String, guaranteeReference: String, currencyOpt: Option[String]): Either[ParseError, Option[BigDecimal]] = {
    val cutIndex = currencyOpt match {
      case None => additionalInfo.length - guaranteeReference.length
      case Some(code) => additionalInfo.length - code.length - guaranteeReference.length
    }
    val amountString = additionalInfo.substring(0, cutIndex)
    if(amountString.isEmpty)
    {
      Right(None)
    }
    else if(amountString.matches("^[0-9]*\\.[0-9]{2}$")) {
      Right(Some(BigDecimal(amountString)))
    }
    else {
      Left(AmountStringInvalid("Invalid String for amount"))
    }
  }
}


case class SpecialMentionGuaranteeDetails(guaranteeAmount: Option[BigDecimal], currencyCode: Option[String], reference: String) {
  def toSimple: SpecialMentionGuarantee = {
    val amount = guaranteeAmount.getOrElse(BigDecimal(10000.00)).toString()
    val currency = currencyCode.getOrElse("EUR")

    SpecialMentionGuarantee(amount + currency + reference)
  }
}