import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.delay(90)

WebUI.waitForElementClickable(findTestObject('manageSettings/Page_SpotLight  Shutter/li_Bespoke VideoSingle Render0'), 0)

WebUI.click(findTestObject('manageSettings/Page_SpotLight  Shutter/li_Bespoke VideoSingle Render0'))

WebUI.delay(1)

WebUI.click(findTestObject('manageSettings/Page_SpotLight  Shutter/viewImage'))

WebUI.delay(1)

title = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(1)

WebUI.takeScreenshot('C:\\screenshots\\test.png')

WebUI.closeWindowIndex(1)

