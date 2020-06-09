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

package data

trait TestXml {

  val CC007A = <CC007A>
    <SynIdeMES1>UNOC</SynIdeMES1>
    <SynVerNumMES2>3</SynVerNumMES2>
    <MesSenMES3>LOCAL-eori</MesSenMES3>
    <MesRecMES6>NCTS</MesRecMES6>
    <DatOfPreMES9>20200204</DatOfPreMES9>
    <TimOfPreMES10>1302</TimOfPreMES10>
    <IntConRefMES11>WE202002046</IntConRefMES11>
    <AppRefMES14>NCTS</AppRefMES14>
    <TesIndMES18>0</TesIndMES18>
    <MesIdeMES19>1</MesIdeMES19>
    <MesTypMES20>GB007A</MesTypMES20>
    <HEAHEA>
      <DocNumHEA5>99IT9876AB88901209</DocNumHEA5>
      <CusSubPlaHEA66>EXAMPLE1</CusSubPlaHEA66>
      <ArrNotPlaHEA60>NW16XE</ArrNotPlaHEA60>
      <ArrNotPlaHEA60LNG>EN</ArrNotPlaHEA60LNG>
      <ArrAgrLocOfGooHEA63LNG>EN</ArrAgrLocOfGooHEA63LNG>
      <SimProFlaHEA132>0</SimProFlaHEA132>
      <ArrNotDatHEA141>20200204</ArrNotDatHEA141>
    </HEAHEA>
    <TRADESTRD>
      <NamTRD7>EXAMPLE2</NamTRD7>
      <StrAndNumTRD22>Baker Street</StrAndNumTRD22>
      <PosCodTRD23>NW16XE</PosCodTRD23>
      <CitTRD24>London</CitTRD24>
      <CouTRD25>GB</CouTRD25>
      <NADLNGRD>EN</NADLNGRD>
      <TINTRD59>EXAMPLE3</TINTRD59>
    </TRADESTRD>
    <CUSOFFPREOFFRES>
      <RefNumRES1>GB000128</RefNumRES1>
    </CUSOFFPREOFFRES>
  </CC007A>

  val InvalidCC007A = <CC007A>
    <SynIdeMES1>UNOC</SynIdeMES1>
    <SynVerNumMES2>3</SynVerNumMES2>
    <MesSenMES3>LOCAL-eori</MesSenMES3>
    <MesRecMES6>NCTS</MesRecMES6>
    <DatOfPreMES9>20200204</DatOfPreMES9>
    <TimOfPreMES10>1302</TimOfPreMES10>
    <IntConRefMES11>WE202002046</IntConRefMES11>
    <AppRefMES14>NCTS</AppRefMES14>
    <TesIndMES18>0</TesIndMES18>
    <MesIdeMES19>1</MesIdeMES19>
    <MesTypMES20>GB007A</MesTypMES20>
    <HEAHEA>
      <DocNumHEA5>99IT9876AB88901209</DocNumHEA5>
      <CusSubPlaHEA66>EXAMPLE1</CusSubPlaHEA66>
      <ArrNotPlaHEA60>NW16XE</ArrNotPlaHEA60>
      <ArrNotPlaHEA60LNG>EN</ArrNotPlaHEA60LNG>
      <ArrAgrLocOfGooHEA63LNG>EN</ArrAgrLocOfGooHEA63LNG>
      <SimProFlaHEA132>0</SimProFlaHEA132>
      <ArrNotDatHEA141>20200204</ArrNotDatHEA141>
    </HEAHEA>
    <CUSOFFPREOFFRES>
      <RefNumRES1>GB000128</RefNumRES1>
    </CUSOFFPREOFFRES>
  </CC007A>

  val CC044A =
    <CC044A>
      <SynIdeMES1>tval</SynIdeMES1>
      <SynVerNumMES2>1</SynVerNumMES2>
      <MesSenMES3>111111</MesSenMES3>
      <!--Optional:-->
      <SenIdeCodQuaMES4>1111</SenIdeCodQuaMES4>
      <MesRecMES6>111111</MesRecMES6>
      <!--Optional:-->
      <RecIdeCodQuaMES7>1111</RecIdeCodQuaMES7>
      <DatOfPreMES9>20001001</DatOfPreMES9>
      <TimOfPreMES10>1111</TimOfPreMES10>
      <IntConRefMES11>111111</IntConRefMES11>
      <!--Optional:-->
      <RecRefMES12>111111</RecRefMES12>
      <!--Optional:-->
      <RecRefQuaMES13>to</RecRefQuaMES13>
      <!--Optional:-->
      <AppRefMES14>token</AppRefMES14>
      <!--Optional:-->
      <PriMES15>t</PriMES15>
      <!--Optional:-->
      <AckReqMES16>1</AckReqMES16>
      <!--Optional:-->
      <ComAgrIdMES17>token</ComAgrIdMES17>
      <!--Optional:-->
      <TesIndMES18>1</TesIndMES18>
      <MesIdeMES19>token</MesIdeMES19>
      <MesTypMES20>token</MesTypMES20>
      <!--Optional:-->
      <ComAccRefMES21>token</ComAccRefMES21>
      <!--Optional:-->
      <MesSeqNumMES22>11</MesSeqNumMES22>
      <!--Optional:-->
      <FirAndLasTraMES23>t</FirAndLasTraMES23>
      <HEAHEA>
        <DocNumHEA5>token</DocNumHEA5>
        <!--Optional:-->
        <IdeOfMeaOfTraAtDHEA78>token</IdeOfMeaOfTraAtDHEA78>
        <!--Optional:-->
        <IdeOfMeaOfTraAtDHEA78LNG>to</IdeOfMeaOfTraAtDHEA78LNG>
        <!--Optional:-->
        <NatOfMeaOfTraAtDHEA80>to</NatOfMeaOfTraAtDHEA80>
        <TotNumOfIteHEA305>11</TotNumOfIteHEA305>
        <!--Optional:-->
        <TotNumOfPacHEA306>11</TotNumOfPacHEA306>
        <TotGroMasHEA307>1.0</TotGroMasHEA307>
      </HEAHEA>
      <TRADESTRD>
        <!--Optional:-->
        <NamTRD7>token</NamTRD7>
        <!--Optional:-->
        <StrAndNumTRD22>token</StrAndNumTRD22>
        <!--Optional:-->
        <PosCodTRD23>token</PosCodTRD23>
        <!--Optional:-->
        <CitTRD24>token</CitTRD24>
        <!--Optional:-->
        <CouTRD25>to</CouTRD25>
        <!--Optional:-->
        <NADLNGRD>to</NADLNGRD>
        <!--Optional:-->
        <TINTRD59>token</TINTRD59>
      </TRADESTRD>
      <CUSOFFPREOFFRES>
        <RefNumRES1>tokenval</RefNumRES1>
      </CUSOFFPREOFFRES>
      <UNLREMREM>
        <!--Optional:-->
        <StaOfTheSeaOKREM19>1</StaOfTheSeaOKREM19>
        <!--Optional:-->
        <UnlRemREM53>token</UnlRemREM53>
        <!--Optional:-->
        <UnlRemREM53LNG>to</UnlRemREM53LNG>
        <ConREM65>1</ConREM65>
        <UnlComREM66>1</UnlComREM66>
        <UnlDatREM67>11010110</UnlDatREM67>
      </UNLREMREM>
      <!--0 to 9 repetitions:-->
      <RESOFCON534>
        <!--Optional:-->
        <DesTOC2>token</DesTOC2>
        <!--Optional:-->
        <DesTOC2LNG>to</DesTOC2LNG>
        <ConInd424>to</ConInd424>
        <!--Optional:-->
        <PoiToTheAttTOC5>token</PoiToTheAttTOC5>
        <!--Optional:-->
        <CorValTOC4>token</CorValTOC4>
      </RESOFCON534>
      <!--Optional:-->
      <SEAINFSLI>
        <SeaNumSLI2>tval</SeaNumSLI2>
        <!--0 to 9999 repetitions:-->
        <SEAIDSID>
          <SeaIdeSID1>token</SeaIdeSID1>
          <!--Optional:-->
          <SeaIdeSID1LNG>to</SeaIdeSID1LNG>
        </SEAIDSID>
      </SEAINFSLI>
      <!--0 to 9999 repetitions:-->
      <GOOITEGDS>
        <IteNumGDS7>1</IteNumGDS7>
        <!--Optional:-->
        <ComCodTarCodGDS10>token</ComCodTarCodGDS10>
        <!--Optional:-->
        <GooDesGDS23>token</GooDesGDS23>
        <!--Optional:-->
        <GooDesGDS23LNG>to</GooDesGDS23LNG>
        <!--Optional:-->
        <GroMasGDS46>1.0</GroMasGDS46>
        <!--Optional:-->
        <NetMasGDS48>1.0</NetMasGDS48>
        <!--0 to 99 repetitions:-->
        <PRODOCDC2>
          <DocTypDC21>tval</DocTypDC21>
          <!--Optional:-->
          <DocRefDC23>token</DocRefDC23>
          <!--Optional:-->
          <DocRefDCLNG>to</DocRefDCLNG>
          <!--Optional:-->
          <ComOfInfDC25>token</ComOfInfDC25>
          <!--Optional:-->
          <ComOfInfDC25LNG>to</ComOfInfDC25LNG>
        </PRODOCDC2>
        <!--0 to 199 repetitions:-->
        <RESOFCONROC>
          <!--Optional:-->
          <DesROC2>token</DesROC2>
          <!--Optional:-->
          <DesROC2LNG>to</DesROC2LNG>
          <ConIndROC1>to</ConIndROC1>
          <!--Optional:-->
          <PoiToTheAttROC51>token</PoiToTheAttROC51>
        </RESOFCONROC>
        <!--0 to 99 repetitions:-->
        <CONNR2>
          <ConNumNR21>token</ConNumNR21>
        </CONNR2>
        <!--0 to 99 repetitions:-->
        <PACGS2>
          <!--Optional:-->
          <MarNumOfPacGS21>token</MarNumOfPacGS21>
          <!--Optional:-->
          <MarNumOfPacGS21LNG>to</MarNumOfPacGS21LNG>
          <KinOfPacGS23>val</KinOfPacGS23>
          <!--Optional:-->
          <NumOfPacGS24>token</NumOfPacGS24>
          <!--Optional:-->
          <NumOfPieGS25>token</NumOfPieGS25>
        </PACGS2>
        <!--0 to 9 repetitions:-->
        <SGICODSD2>
          <!--Optional:-->
          <SenGooCodSD22>1</SenGooCodSD22>
          <!--Optional:-->
          <SenQuaSD23>1.0</SenQuaSD23>
        </SGICODSD2>
      </GOOITEGDS>
    </CC044A>

  val InvalidCC044A =
    <CC044A>
      <SynIdeMES1>tval</SynIdeMES1>
      <SynVerNumMES2>1</SynVerNumMES2>
      <MesSenMES3>111111</MesSenMES3>
      <!--Optional:-->
      <SenIdeCodQuaMES4>1111</SenIdeCodQuaMES4>
      <MesRecMES6>111111</MesRecMES6>
      <!--Optional:-->
      <RecIdeCodQuaMES7>1111</RecIdeCodQuaMES7>
      <DatOfPreMES9>111111</DatOfPreMES9>
      <TimOfPreMES10>1111</TimOfPreMES10>
      <IntConRefMES11>111111</IntConRefMES11>
      <!--Optional:-->
      <RecRefMES12>111111</RecRefMES12>
      <!--Optional:-->
      <RecRefQuaMES13>to</RecRefQuaMES13>
      <!--Optional:-->
      <AppRefMES14>token</AppRefMES14>
      <!--Optional:-->
      <PriMES15>t</PriMES15>
      <!--Optional:-->
      <AckReqMES16>1</AckReqMES16>
      <!--Optional:-->
      <ComAgrIdMES17>token</ComAgrIdMES17>
      <!--Optional:-->
      <TesIndMES18>1</TesIndMES18>
      <MesIdeMES19>token</MesIdeMES19>
      <MesTypMES20>token</MesTypMES20>
      <!--Optional:-->
      <ComAccRefMES21>token</ComAccRefMES21>
      <!--Optional:-->
      <MesSeqNumMES22>11</MesSeqNumMES22>
      <!--Optional:-->
      <FirAndLasTraMES23>t</FirAndLasTraMES23>
      <HEAHEA>
        <DocNumHEA5>token</DocNumHEA5>
        <!--Optional:-->
        <IdeOfMeaOfTraAtDHEA78>token</IdeOfMeaOfTraAtDHEA78>
        <!--Optional:-->
        <IdeOfMeaOfTraAtDHEA78LNG>to</IdeOfMeaOfTraAtDHEA78LNG>
        <!--Optional:-->
        <NatOfMeaOfTraAtDHEA80>to</NatOfMeaOfTraAtDHEA80>
        <TotNumOfIteHEA305>11</TotNumOfIteHEA305>
        <!--Optional:-->
        <TotNumOfPacHEA306>11</TotNumOfPacHEA306>
        <TotGroMasHEA307>1.0</TotGroMasHEA307>
      </HEAHEA>
      <TRADESTRD>
        <!--Optional:-->
        <NamTRD7>token</NamTRD7>
        <!--Optional:-->
        <StrAndNumTRD22>token</StrAndNumTRD22>
        <!--Optional:-->
        <PosCodTRD23>token</PosCodTRD23>
        <!--Optional:-->
        <CitTRD24>token</CitTRD24>
        <!--Optional:-->
        <CouTRD25>to</CouTRD25>
        <!--Optional:-->
        <NADLNGRD>to</NADLNGRD>
        <!--Optional:-->
        <TINTRD59>token</TINTRD59>
      </TRADESTRD>
      <CUSOFFPREOFFRES>
        <RefNumRES1>tokenval</RefNumRES1>
      </CUSOFFPREOFFRES>
      <!--0 to 9 repetitions:-->
      <RESOFCON534>
        <!--Optional:-->
        <DesTOC2>token</DesTOC2>
        <!--Optional:-->
        <DesTOC2LNG>to</DesTOC2LNG>
        <ConInd424>to</ConInd424>
        <!--Optional:-->
        <PoiToTheAttTOC5>token</PoiToTheAttTOC5>
        <!--Optional:-->
        <CorValTOC4>token</CorValTOC4>
      </RESOFCON534>
      <!--Optional:-->
      <SEAINFSLI>
        <SeaNumSLI2>tval</SeaNumSLI2>
        <!--0 to 9999 repetitions:-->
        <SEAIDSID>
          <SeaIdeSID1>token</SeaIdeSID1>
          <!--Optional:-->
          <SeaIdeSID1LNG>to</SeaIdeSID1LNG>
        </SEAIDSID>
      </SEAINFSLI>
      <!--0 to 9999 repetitions:-->
      <GOOITEGDS>
        <IteNumGDS7>1</IteNumGDS7>
        <!--Optional:-->
        <ComCodTarCodGDS10>token</ComCodTarCodGDS10>
        <!--Optional:-->
        <GooDesGDS23>token</GooDesGDS23>
        <!--Optional:-->
        <GooDesGDS23LNG>to</GooDesGDS23LNG>
        <!--Optional:-->
        <GroMasGDS46>1.0</GroMasGDS46>
        <!--Optional:-->
        <NetMasGDS48>1.0</NetMasGDS48>
        <!--0 to 99 repetitions:-->
        <PRODOCDC2>
          <DocTypDC21>tval</DocTypDC21>
          <!--Optional:-->
          <DocRefDC23>token</DocRefDC23>
          <!--Optional:-->
          <DocRefDCLNG>to</DocRefDCLNG>
          <!--Optional:-->
          <ComOfInfDC25>token</ComOfInfDC25>
          <!--Optional:-->
          <ComOfInfDC25LNG>to</ComOfInfDC25LNG>
        </PRODOCDC2>
        <!--0 to 199 repetitions:-->
        <RESOFCONROC>
          <!--Optional:-->
          <DesROC2>token</DesROC2>
          <!--Optional:-->
          <DesROC2LNG>to</DesROC2LNG>
          <ConIndROC1>to</ConIndROC1>
          <!--Optional:-->
          <PoiToTheAttROC51>token</PoiToTheAttROC51>
        </RESOFCONROC>
        <!--0 to 99 repetitions:-->
        <CONNR2>
          <ConNumNR21>token</ConNumNR21>
        </CONNR2>
        <!--0 to 99 repetitions:-->
        <PACGS2>
          <!--Optional:-->
          <MarNumOfPacGS21>token</MarNumOfPacGS21>
          <!--Optional:-->
          <MarNumOfPacGS21LNG>to</MarNumOfPacGS21LNG>
          <KinOfPacGS23>val</KinOfPacGS23>
          <!--Optional:-->
          <NumOfPacGS24>token</NumOfPacGS24>
          <!--Optional:-->
          <NumOfPieGS25>token</NumOfPieGS25>
        </PACGS2>
        <!--0 to 9 repetitions:-->
        <SGICODSD2>
          <!--Optional:-->
          <SenGooCodSD22>1</SenGooCodSD22>
          <!--Optional:-->
          <SenQuaSD23>1.0</SenQuaSD23>
        </SGICODSD2>
      </GOOITEGDS>
    </CC044A>


    val CC015B = <CC015B>
    <SynIdeMES1>UNOC</SynIdeMES1>
    <SynVerNumMES2>3</SynVerNumMES2>
    <MesSenMES3>SYST17B-NCTS_EU_EXIT</MesSenMES3>
    <MesRecMES6>NCTS</MesRecMES6>
    <DatOfPreMES9>20190912</DatOfPreMES9>
    <TimOfPreMES10>1222</TimOfPreMES10>
    <IntConRefMES11>WE190912102530</IntConRefMES11>
    <AppRefMES14>NCTS</AppRefMES14>
    <TesIndMES18>0</TesIndMES18>
    <MesIdeMES19>1</MesIdeMES19>
    <MesTypMES20>GB015B</MesTypMES20>
    <HEAHEA>
      <RefNumHEA4>01CTC201909121215</RefNumHEA4>
      <TypOfDecHEA24>T2</TypOfDecHEA24>
      <CouOfDesCodHEA30>IT</CouOfDesCodHEA30>
      <AgrLocOfGooCodHEA38>default</AgrLocOfGooCodHEA38>
      <AgrLocOfGooHEA39>default</AgrLocOfGooHEA39>
      <AgrLocOfGooHEA39LNG>EN</AgrLocOfGooHEA39LNG>
      <AutLocOfGooCodHEA41>default</AutLocOfGooCodHEA41>
      <PlaOfLoaCodHEA46>DOVER</PlaOfLoaCodHEA46>
      <CouOfDisCodHEA55>GB</CouOfDisCodHEA55>
      <CusSubPlaHEA66>default</CusSubPlaHEA66>
      <InlTraModHEA75>20</InlTraModHEA75>
      <IdeOfMeaOfTraAtDHEA78>EU_EXIT</IdeOfMeaOfTraAtDHEA78>
      <IdeOfMeaOfTraAtDHEA78LNG>EN</IdeOfMeaOfTraAtDHEA78LNG>
      <IdeOfMeaOfTraCroHEA85>EU_EXIT</IdeOfMeaOfTraCroHEA85>
      <IdeOfMeaOfTraCroHEA85LNG>EN</IdeOfMeaOfTraCroHEA85LNG>
      <ConIndHEA96>0</ConIndHEA96>
      <DiaLanIndAtDepHEA254>EN</DiaLanIndAtDepHEA254>
      <NCTSAccDocHEA601LNG>EN</NCTSAccDocHEA601LNG>
      <TotNumOfIteHEA305>1</TotNumOfIteHEA305>
      <TotNumOfPacHEA306>1</TotNumOfPacHEA306>
      <TotGroMasHEA307>1000</TotGroMasHEA307>
      <DecDatHEA383>20190912</DecDatHEA383>
      <DecPlaHEA394>DOVER</DecPlaHEA394>
      <DecPlaHEA394LNG>EN</DecPlaHEA394LNG>
    </HEAHEA>
    <TRAPRIPC1>
      <NamPC17>CITY WATCH SHIPPING</NamPC17>
      <StrAndNumPC122>125 Psuedopolis Yard</StrAndNumPC122>
      <PosCodPC123>SS99 1AA</PosCodPC123>
      <CitPC124>Ank-Morpork</CitPC124>
      <CouPC125>GB</CouPC125>
      <NADLNGPC>EN</NADLNGPC>
      <TINPC159>GB652420267000</TINPC159>
    </TRAPRIPC1>
    <TRACONCO1>
      <NamCO17>QUIRM ENGINEERING</NamCO17>
      <StrAndNumCO122>125 Psuedopolis Yard</StrAndNumCO122>
      <PosCodCO123>SS99 1AA</PosCodCO123>
      <CitCO124>Ank-Morpork</CitCO124>
      <CouCO125>GB</CouCO125>
      <TINCO159>GB602070107000</TINCO159>
    </TRACONCO1>
    <TRACONCE1>
      <NamCE17>DROFL POTTERY</NamCE17>
      <StrAndNumCE122>125 Psuedopolis Yard</StrAndNumCE122>
      <PosCodCE123>SS99 1AA</PosCodCE123>
      <CitCE124>Ank-Morpork</CitCE124>
      <CouCE125>GB</CouCE125>
      <NADLNGCE>EN</NADLNGCE>
      <TINCE159>GB658120050000</TINCE159>
    </TRACONCE1>
    <CUSOFFDEPEPT>
      <RefNumEPT1>GB000060</RefNumEPT1>
    </CUSOFFDEPEPT>
    <CUSOFFTRARNS>
      <RefNumRNS1>FR001260</RefNumRNS1>
      <ArrTimTRACUS085>201909160100</ArrTimTRACUS085>
    </CUSOFFTRARNS>
    <CUSOFFDESEST>
      <RefNumEST1>IT021100</RefNumEST1>
    </CUSOFFDESEST>
    <SEAINFSLI>
      <SeaNumSLI2>1</SeaNumSLI2>
      <SEAIDSID>
        <SeaIdeSID1>Seal001</SeaIdeSID1>
        <SeaIdeSID1LNG>EN</SeaIdeSID1LNG>
      </SEAIDSID>
    </SEAINFSLI>
    <GUAGUA>
      <GuaTypGUA1>3</GuaTypGUA1>
      <GUAREFREF>
        <GuaRefNumGRNREF1>default</GuaRefNumGRNREF1>
        <OthGuaRefREF4>EU_EXIT</OthGuaRefREF4>
        <AccCodREF6>test</AccCodREF6>
      </GUAREFREF>
    </GUAGUA>
    <GOOITEGDS>
      <IteNumGDS7>1</IteNumGDS7>
      <ComCodTarCodGDS10>default</ComCodTarCodGDS10>
      <DecTypGDS15>default</DecTypGDS15>
      <GooDesGDS23>Flowers</GooDesGDS23>
      <GooDesGDS23LNG>EN</GooDesGDS23LNG>
      <GroMasGDS46>1000</GroMasGDS46>
      <NetMasGDS48>999</NetMasGDS48>
      <CouOfDesGDS59>ex</CouOfDesGDS59>
      <PREADMREFAR2>
        <PreDocTypAR21>T2</PreDocTypAR21>
        <PreDocRefAR26>EU_EXIT-T2</PreDocRefAR26>
        <PreDocRefLNG>EN</PreDocRefLNG>
        <ComOfInfAR29>default</ComOfInfAR29>
        <ComOfInfAR29LNG>EN</ComOfInfAR29LNG>
      </PREADMREFAR2>
      <PRODOCDC2>
        <DocTypDC21>720</DocTypDC21>
        <DocRefDC23>EU_EXIT</DocRefDC23>
        <DocRefDCLNG>EN</DocRefDCLNG>
        <ComOfInfDC25>default</ComOfInfDC25>
        <ComOfInfDC25LNG>EN</ComOfInfDC25LNG>
      </PRODOCDC2>
      <PACGS2>
        <MarNumOfPacGS21>Bloomingales</MarNumOfPacGS21>
        <MarNumOfPacGS21LNG>EN</MarNumOfPacGS21LNG>
        <KinOfPacGS23>BX</KinOfPacGS23>
        <NumOfPacGS24>1</NumOfPacGS24>
      </PACGS2>
    </GOOITEGDS>
  </CC015B>
}
