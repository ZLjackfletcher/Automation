<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>token</name>
   <tag></tag>
   <elementGuidId>7720691f-eca4-425b-b3c4-aad032730e7e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;grant_type\&quot;: \&quot;password\&quot;,\n    \&quot;username\&quot;: \&quot;${username}\&quot;,\n    \&quot;password\&quot;: \&quot;${password}\&quot;,\n    \&quot;client_id\&quot;: \&quot;AuthenticationSDK\&quot;,\n    \&quot;client_secret\&quot;: \&quot;nucRPkkvkzMD19JbWzFXbD8kjdBYtmzc4qE10Bv2\&quot;,\n    \&quot;scope\&quot;: \&quot;${spotlightScope}\&quot;\n}&quot;,
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
      <name>Authorization:type</name>
      <type>Main</type>
      <value>OAuth 1.0</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_consumer_key</name>
      <type>Main</type>
      <value>AuthenticationSDK</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_consumer_secret</name>
      <type>Main</type>
      <value>nucRPkkvkzMD19JbWzFXbD8kjdBYtmzc4qE10Bv2</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_signature_method</name>
      <type>Main</type>
      <value>HMAC-SHA1</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_token</name>
      <type>Main</type>
      <value>zlqa.xxskbi3w@mailosaur.io</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_token_secret</name>
      <type>Main</type>
      <value>Z3roL1ght</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${authUrl}/token?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'https://authentication.zlthunder.net/api/v1/'</defaultValue>
      <description></description>
      <id>927c5e89-55c2-4480-b541-bc99e9187c5d</id>
      <masked>false</masked>
      <name>authUrl</name>
   </variables>
   <variables>
      <defaultValue>'SpotlightAPI.stage'</defaultValue>
      <description></description>
      <id>0b9d8586-9c42-419b-9175-f8f3615f8686</id>
      <masked>false</masked>
      <name>spotlightScope</name>
   </variables>
   <variables>
      <defaultValue>'Z3roL1ght'</defaultValue>
      <description></description>
      <id>880b4fb4-4239-4bab-85f8-4d6ba894860d</id>
      <masked>false</masked>
      <name>password</name>
   </variables>
   <variables>
      <defaultValue>'zlqa.xxskbi3w@mailosaur.io'</defaultValue>
      <description></description>
      <id>e380a915-36b1-4bec-a9bb-92bb8425ce7b</id>
      <masked>false</masked>
      <name>username</name>
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
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
