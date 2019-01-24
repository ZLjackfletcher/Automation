import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementClickable(findTestObject('Shutter buttons/PRCode Config/Page_SpotLight  Shutter/span_Prcode Configuration'), 
    0)

WebUI.click(findTestObject('Shutter buttons/PRCode Config/Page_SpotLight  Shutter/span_Prcode Configuration'))

WebUI.click(findTestObject('Shutter buttons/PRCode Config/Page_SpotLight  Shutter/input_Current PrCodes_prcodes'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Shutter buttons/PRCode Config/Page_SpotLight  Shutter/input_Current PrCodes_prcodes'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Shutter buttons/PRCode Config/Page_SpotLight  Shutter/input_Current PrCodes_prcodes'), 
    Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Shutter buttons/PRCode Config/Page_SpotLight  Shutter/input_Current PrCodes_prcodes'), '4791EF,MRAO8AJ,MNAV7Q2,MTVEQV0,JSTCFH,JFBCNA,MHFE4HG,JWCRNA,MRAU9JA,MDFO6F3,MLFFVK3,MSLE8F0,MBBO6FH,JSTXZZ,MAIB4UF,GZITZIT,MVBK1T0,MKUHKK3,MEIH5MK,JDORAS,MSMAFV0,MEIKQ9B,JFCCAS,MGMOTC9,MSMEGC3,JAZDZZ,MZBR2WA,JFCINA,MBTA7YH,MMIK3D7,MEIUQ8C,MMADNM2,JAZMAS,MAAUE0A,GY11Y11,JFCUAS,GY10Y10,MBLBB0A,MBLEKN1,MDPF4XG,MGNF4U0,MSNA7L6,MIRS4L6,MFLS8K4,MSVOFA0,MABO6H0,MABR1PA,MTPLB14,MASE6XE,MASGEA0,MCOCC00,MRDK7K1,MVTV9ZX,MASL5SJ,MMJZIY1,F14 Q0B7,MASR5RU,MHIA0N5,MSFS2K0,JCONNA,MBEH4M0,MDAE2MP,MTYP1EX,MHIM6NZ,MLAC5K2,MHAK4Z1,MCPDIW0,MLAKFB7,MREIH2M,MFEU6A0,MLRA1XW,MALGQE0,MBFA0UK,MPAMGP2,MRER1G8,MFVS7G1,GYCSYCS,MTRF5D7,MAUD9WT,MPRSFR9,JRFFPA,JFWIZZ,MEDW7AL,MQUAAQ0,F56     99,MAUSA8S,MLSE9VK,MEMINR7,MZFM0TC,MAED7LS,MBOW1S0,MHSW8ED,MSIBN3N,MAER0P0,MKAE0KA,MSIE3L5,MTSPNT0,JCANNA,JCRBZZ,MSAANU2,MSIH4A3,GYMKYMK,MTSV4AH,MSAD2HA,MKZH6P1,MLCPQQ2,MWABVD0,MVOSQ1D,MKARK8J,MWIN7S1,MVGP5GF,MKZV6W1,MGRTVC1,MMFA9Q1,MGRV5A4,MLTU3HB,MKRS1A0,MINT4N0,MSZU0NA,MINSU0F,JHDLNA,MKSA5C0,MKBV0M5,MKSI3G0,JSBTNA,MGSPG1H,MLUM7HB,MAGM7CA,JBZANA,MDEI3FA,MBAH2EG,MLEAL0L,MDEKGT0,MSSL4B1,MFIT6RC,MSSP05Z,MMOTD84,MLEN1N8,MRADCZ6,MBAV1LD,MZIE4ZC,MHES5J8,MEPH7X9,MFZSF0A')

WebUI.doubleClick(findTestObject('Shutter buttons/PRCode Config/Page_SpotLight  Shutter/a_Apply'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

