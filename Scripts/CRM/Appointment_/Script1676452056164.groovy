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

WebUI.delay(5)

WebUI.click(findTestObject('CRM_/CRM_Login/Open_Slider'), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.click(findTestObject('CRM_/Appointment_/Appointment'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/View_All'))

WebUI.delay(2)

WebUI.setText(findTestObject('CRM_/Appointment_/Serach_Email'), 'hitesh.chandankar@truworth.com')

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Search_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Create_Appointment_/Create_Appointment'))

if (WebUI.verifyTextPresent('Create Appointment', false)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.delay(2)

WebUI.setText(findTestObject('CRM_/Appointment_/Enter_Email'), 'hitesh@gmail.com')

WebUI.delay(2)

if (WebUI.click(findTestObject('CRM_/Appointment_/Search_New_User'))) {
    System.out.println('Test case pass')
}

//else
//{
//	WebUI.delay(15)
//	WebUI.verifyTextPresent("Something went wrong", true)
//	System.out.println("Something went wrong == API not working")
//}
WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Yes_New_User'))

WebUI.delay(2)

WebUI.setText(findTestObject('CRM_/Appointment_/FirstName_NewUser'), 'Hitesh')

WebUI.delay(2)

WebUI.setText(findTestObject('CRM_/Appointment_/LastName_NewUser'), 'Wani')

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Gender_Male'))

WebUI.delay(2)

WebUI.setText(findTestObject('CRM_/Appointment_/Mobile_Number'), '9766338207')

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Date_Birth'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Year_Calender'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Change_Year'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Change_Year'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Change_Year'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_Year'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_Month'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_Date'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Register_Button_NewUser'))

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('CRM_/Appointment_/Verify_Account_Alerdy_Created'), 5)) {
    System.out.println('Test case fail')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.delay(5)

WebUI.click(findTestObject('CRM_/Appointment_/Cross_NewUser'))

WebUI.click(findTestObject('Object Repository/CRM_/Appointment_/Back_Arrow_Dashboard'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('CRM_/Appointment_/User_Verify'))

WebUI.click(findTestObject('CRM_/CRM_Login/Open_Slider'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Appointment'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Advanced_Filter'))

WebUI.delay(5)

WebUI.delay(2)

test = WebUI.getText(findTestObject('CRM_/Appointment_/Title_Adavced_Filter'))

if (test == 'Appointments - Advanced Filters') {
    System.out.println(test)
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('Object Repository/CRM_/Appointment_/Select_Client'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_Client_InDropDown'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Collect_Mode'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Collect_Mode_DropDown'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_Package'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_Package_DropDown'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_Status'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_Status_DropDown'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_StartDate'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_StartDAte_DropDown'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Select_End_Date'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Search_button_Advanced_Filter'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_/Reset_Advanced_Filter'))

WebUI.delay(2)

WebUI.closeBrowser()

