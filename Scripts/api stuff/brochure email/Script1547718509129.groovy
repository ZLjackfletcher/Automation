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
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import groovy.json.JsonOutput as JsonOutput
	
def response = WS.sendRequest(findTestObject('api/verify message'))

def json = response.getResponseText()

def jsonSlurper = new JsonSlurper()

def respJson = jsonSlurper.parseText(json)

def ID = respJson.items[0].id

def from = respJson.items[0].from[0].email

def to = respJson.items[0].to[0].email

def received = respJson.items[0].received

def image = respJson.items[0]._links[0].href

filename = 'C:/email.txt'
File file = new File(filename)
file.write ("ID: " + ID + ' \n') 
file << ("to: " + to + " \n ")  
file << ("from: " + from + ' \n')
file << ("received: " + received + ' \n') 
file << ("image: " + image + ' \n') 

