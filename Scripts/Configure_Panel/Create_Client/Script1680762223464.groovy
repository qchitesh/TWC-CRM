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

CustomKeywords.'login.Config_login.userLogin'()

WebUI.back()

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Create_Client'))

WebUI.delay(2)

int randomemail = (((Math.random() * ((10000 - 100) + 1)) + 100) as int)

def name = 'hitesh'

WebUI.setText(findTestObject('Configure_Panel_/Create_Client_/Client_name'), (name + randomemail) + '@mailinator.com')

WebUI.delay(4)

WebUI.uploadFile(findTestObject('Configure_Panel_/Create_Client_/Select_Image'), 'D:\\Hitesh Sanjay Chandankar\\Downloads\\test.jpg')

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Client_Partner'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Partner_B'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Save_'), FailureHandling.STOP_ON_FAILURE)

//if (WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Create_Client_/Alredy_Client_Created'), 2)) {
//    System.out.println('This user account already created')
//} else {
//    System.out.println('Account succesfully created')
//}
//WebUI.back()
WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Eye_Symbol'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Config_File'))

//WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Sample_File_Downlode'))
WebUI.delay(5)

//FileInputStream file = new FileInputStream("D:\\Hitesh Sanjay Chandankar\\Downloads\\sample-configure-wallet-sheet(7).xlsx")
WebUI.uploadFile(findTestObject('Configure_Panel_/Create_Client_/Uplode_File'), 'D:\\Hitesh Sanjay Chandankar\\Downloads\\sample-configure-wallet-sheet (7).xlsx')

WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Create_Client_/Verify_Sheet_Uplode'), 2)

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/view_All'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Cross_Button'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Next_Button'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Eye_Symbol_User_Added'))

WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Create_Client_/Verify_User_'), 2)

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Change_Status'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/View_List'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Cross_User_list'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Configure_Panel_/Create_Client_/Scroll_To_Title'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Poceed'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Yes_Confirmation'))

WebUI.delay(2)

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Proceed_Approved'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Approved_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Check_Rejected_User'))

WebUI.delay(2)

WebUI.back()

WebUI.delay(5)

WebUI.refresh()

if (WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Create_Client_/Check_Approved_Status'), 3)) {
    System.out.println('User Request Approved')
} else {
    System.out.println('Status not shown correctly')

    assert false
}

WebUI.closeBrowser()

