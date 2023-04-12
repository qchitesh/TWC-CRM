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

WebUI.setText(findTestObject('Configure_Panel_/Login_'), GlobalVariable.Finance)

WebUI.setText(findTestObject('Configure_Panel_/Password_'), 'test@123')

WebUI.click(findTestObject('Configure_Panel_/Log_IN'))

WebUI.click(findTestObject('Configure_Panel_/Finance_User/Eye_Verify_User'))

WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Executive_User/User_Verify'), 2)

WebUI.click(findTestObject('Configure_Panel_/Finance_User/Procced_Finance'))

WebUI.delay(3)

WebUI.click(findTestObject('Configure_Panel_/Finance_User/Yes_To_Procced'))

WebUI.delay(5)

WebUI.back()

WebUI.refresh()

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Finance_User/Reviwed_Status'), 3)) {
    System.out.println('Status Changed')
} else {
    System.out.println('Status Not Change')

    assert false
}

WebUI.closeBrowser()

