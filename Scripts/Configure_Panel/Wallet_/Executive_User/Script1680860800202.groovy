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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Config_Url)

WebUI.setText(findTestObject('Configure_Panel_/Login_'), GlobalVariable.Executive_User)

WebUI.setText(findTestObject('Configure_Panel_/Password_'), 'test@123')

WebUI.click(findTestObject('Configure_Panel_/Log_IN'))

WebUI.click(findTestObject('Configure_Panel_/Executive_User/Click_Eye'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Executive_User/Title_Verify'), 2)

WebUI.delay(5)

WebUI.click(findTestObject('Configure_Panel_/Executive_User/Config_Wallet_Executive'))

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Configure_Panel_/Create_Client_/Uplode_File'), 'D:\\Hitesh Sanjay Chandankar\\Downloads\\sample-configure-wallet-sheet (3).xlsx')

WebUI.delay(4)

WebUI.click(findTestObject('Configure_Panel_/Executive_User/View_All'))

WebUI.delay(4)

WebUI.click(findTestObject('Configure_Panel_/Executive_User/Cross_Button'))

WebUI.click(findTestObject('Configure_Panel_/Executive_User/Upload_Next'))

WebUI.click(findTestObject('Configure_Panel_/Executive_User/Filter'))

WebUI.click(findTestObject('Configure_Panel_/Executive_User/pending'))

WebUI.click(findTestObject('Configure_Panel_/Executive_User/Apply_Button'))

WebUI.click(findTestObject('Configure_Panel_/Executive_User/Eye_Status_Verify'))

if (WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Executive_User/User_Verify'), 5)) {
    System.out.println('User Verified')
} else {
    System.out.println('User not found')

    assert false
}

WebUI.closeBrowser()

