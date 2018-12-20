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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://spotlightsuite.com/auth/login')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_SpotLight  Login/input_Email_undefined-Email-un'))

WebUI.sendKeys(findTestObject('Page_SpotLight  Login/input_Email_undefined-Email-un'), findTestData('login spotlight').getValue(
        1, 1))

WebUI.click(findTestObject('Page_SpotLight  Login/input_Password_undefined-Passw'))

WebUI.sendKeys(findTestObject('Page_SpotLight  Login/input_Password_undefined-Passw'), findTestData('login spotlight').getValue(
        2, 1))

WebUI.click(findTestObject('Page_SpotLight  Login/input_Forgot my password_Butto'))

