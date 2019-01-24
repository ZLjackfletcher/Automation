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

WebUI.waitForElementClickable(findTestObject('Shutter buttons/Camera Configurations/Page_SpotLight  Shutter/header_Camera Configurations'), 
    0)

WebUI.click(findTestObject('Shutter buttons/Camera Configurations/Page_SpotLight  Shutter/header_Camera Configurations'))

WebUI.click(findTestObject('Shutter buttons/Camera Configurations/Page_SpotLight  Shutter/input_Name_name'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Shutter buttons/Camera Configurations/Page_SpotLight  Shutter/input_Name_name'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Shutter buttons/Camera Configurations/Page_SpotLight  Shutter/input_Name_name'), Keys.chord(
        Keys.DELETE))

WebUI.setText(findTestObject('Shutter buttons/Camera Configurations/Page_SpotLight  Shutter/input_Name_name'), 'Test')

WebUI.doubleClick(findTestObject('Shutter buttons/Camera Configurations/Page_SpotLight  Shutter/a_Save Camera'))

