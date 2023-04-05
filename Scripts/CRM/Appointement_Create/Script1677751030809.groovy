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

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/CRM_Login/Open_Slider'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('CRM_/Appointment_/Appointment'))

WebUI.click(findTestObject('CRM_/Appointment_/View_All'))

WebUI.click(findTestObject('CRM_/Appointment_/Create_Appointment_/Create_Appointment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('CRM_/Appointment_/Create_Appointment_/Search_User_'), 'hitesh.chandankar@truworth.com')

WebUI.click(findTestObject('CRM_/Appointment_/Search_Button'))

WebUI.delay(10)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/CRM_/Appointement_Create/Verify_User'), 5)) {
    System.out.println('User is verified')
} else {
    System.out.println('User is not verified')
	assert false
}

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/CRM_/Appointement_Create/Search_Pacakage'), 'covid')

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointement_Create/Select_DropDown_Package'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointement_Create/Self_'))

WebUI.click(findTestObject('CRM_/Appointement_Create/Address_'))

WebUI.click(findTestObject('CRM_/Appointement_Create/Date_'))

WebUI.click(findTestObject('CRM_/Appointement_Create/Select_Date'))

WebUI.click(findTestObject('CRM_/Appointement_Create/Time_'))

WebUI.click(findTestObject('CRM_/Appointement_Create/Select_Time'))

WebUI.click(findTestObject('CRM_/Appointement_Create/Submit'))

if (WebUI.verifyTextPresent('Hitesh Chandankar', true)) 
	{
    System.out.println('User Verified')
} else {
    System.out.println('User not verified')

    assert false
}

WebUI.delay(2)

WebUI.closeBrowser()

