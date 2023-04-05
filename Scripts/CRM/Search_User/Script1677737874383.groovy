import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'login.Login_CRM.userLogin'()

WebUI.click(findTestObject('CRM_/CRM_Login/Open_Slider'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('CRM_/Search_User/Search_User'))

WebUI.setText(findTestObject('CRM_/Search_User/Search_Name'), 'hitesh.chandankar@truworth.com')

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Search_User/Search_Icon_Button'))

if (WebUI.verifyTextPresent('Hitesh Chandankar', true)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('CRM_/Search_User/Status_Active'), 5)) {
    System.out.println('User are Active')
} else {
    System.out.println('User not Actived')
}

WebUI.click(findTestObject('CRM_/Search_User/eye_Symbol'))

if (WebUI.verifyElementPresent(findTestObject('CRM_/Search_User/HRA_Status'), 5)) {
    System.out.println('User HRA Fullfill')
} else {
    System.out.println('User HRA Not Fullfill ')
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/CRM_/Search_User/Email_Status'), 5)) {
    System.out.println('User Email verified')
} else {
    System.out.println('User Email not verified')
}

WebUI.closeBrowser()

