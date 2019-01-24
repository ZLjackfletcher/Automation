<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>verify message</name>
   <tag></tag>
   <elementGuidId>153dc744-03f0-41b0-b9ee-7b65a3c1f2ed</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\&quot;subject\&quot;: \&quot;${emailSubject}\&quot;}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic WlZOd1MxOEZtZ2FKSGphOg==</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://mailosaur.com/api/messages/search?server=${server}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'ZVNwS18FmgaJHja'</defaultValue>
      <description></description>
      <id>7d8c6cbf-d31d-475b-a038-f25906c3523e</id>
      <masked>false</masked>
      <name>apikey</name>
   </variables>
   <variables>
      <defaultValue>'xxskbi3w'</defaultValue>
      <description></description>
      <id>64b96327-d4d5-42f9-87d0-3c26a24fce43</id>
      <masked>false</masked>
      <name>server</name>
   </variables>
   <variables>
      <defaultValue>'Your Perfect Audi e-tron'</defaultValue>
      <description></description>
      <id>1e8c32dd-d9a1-468e-8246-be7f00f1c105</id>
      <masked>false</masked>
      <name>emailSubject</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyElementPropertyValue(response, 'items[0].from[0].email', 'noreply@spotlightsuite.com')

WS.verifyElementPropertyValue(response, 'items[0].to[0].email', 'zlqa.xxskbi3w@mailosaur.io')

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
