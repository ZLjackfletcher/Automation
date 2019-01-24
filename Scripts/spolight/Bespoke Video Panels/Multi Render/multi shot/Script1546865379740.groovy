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

WebUI.waitForElementClickable(findTestObject('Bespoke Video/Multi Render/Page_SpotLight  Bespoke Video/a_Multi Render'), 
    0)

WebUI.click(findTestObject('Bespoke Video/Multi Render/Page_SpotLight  Bespoke Video/a_Multi Render'))

WebUI.click(findTestObject('Bespoke Video/Multi Render/Page_SpotLight  Bespoke Video/div_Current Shot_BatchListItem'))

WebUI.delay(1)

WebUI.click(findTestObject('Bespoke Video/Multi Render/Page_SpotLight  Bespoke Video/button_Add to Cart'))

WebUI.delay(1)

WebUI.click(findTestObject('Bespoke Video/shopping cart/Page_SpotLight  Bespoke Video/a_2'))

WebUI.delay(1)

WebUI.click(findTestObject('Bespoke Video/shopping cart/Page_SpotLight  Bespoke Video/button_Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Bespoke_Brochure/add to cart/Page_SpotLight  Bespoke BROCHURE/div_Page18_SliderContent__Slid'))

