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

WebUI.click(findTestObject('Configure_Panel_/Admin_User/Admin_User_'))

WebUI.click(findTestObject('Configure_Panel_/Admin_User/Create_Admin_User'))

WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Admin_User/Verify_Create_User_Name'), 4)

WebUI.setText(findTestObject('Configure_Panel_/Admin_User/Create_User'), 'lokesh78@mailinator.com')

WebUI.click(findTestObject('Configure_Panel_/Admin_User/Search_Button'))

WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Admin_User/User_Alredy_Created'), 2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Configure_Panel_/Admin_User/User_Type'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Configure_Panel_/Admin_User/Finance_User'), 2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Configure_Panel_/Admin_User/Finance_User'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Configure_Panel_/Admin_User/New_Password'), 'test@123', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Configure_Panel_/Admin_User/confirm_Password'), 'test@123', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Configure_Panel_/Admin_User/Save_Button'), FailureHandling.OPTIONAL)

WebUI.back()

WebUI.click(findTestObject('Configure_Panel_/Admin_User/Eye_Symbol'))

WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Admin_User/Verify_Finance_User_Created'), 2)

WebUI.back()

WebUI.click(findTestObject('Configure_Panel_/Admin_User/Filter_'))

WebUI.scrollToElement(findTestObject('Configure_Panel_/Admin_User/Finance_Filter_'), 2)

WebUI.click(findTestObject('Configure_Panel_/Admin_User/Finance_Filter_'))

WebUI.click(findTestObject('Configure_Panel_/Admin_User/Filter_Ok_Button'))

WebUI.delay(2)

WebUI.closeBrowser()

