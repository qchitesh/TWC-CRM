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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.delay(5)

//WebUI.click(findTestObject('CRM_/CRM__/CRM_Login/Page_CRM - The Wellness Corner/button_Log in'))
//
//WebUI.delay(2)
//
//alert = WebUI.getText(findTestObject('CRM_/CRM_Login/Alert_Login'))
//
//WebUI.delay(2)
//
//System.out.println(alert)
//
//alert07 = WebUI.getText(findTestObject('CRM_/CRM_Login/Alert_password'))
//
//System.out.println(alert07)
//
//WebUI.delay(5)
WebUI.setText(findTestObject('CRM_/CRM_Login/Login_'), 'admin')

WebUI.delay(2)

WebUI.setText(findTestObject('CRM_/CRM_Login/Password_'), 'Truworth@!@#')

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/CRM_Login/Submit_Button'))

if (WebUI.verifyElementPresent(findTestObject('CRM_/CRM_Login/Verify_Sussefully_Login'), 5)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.closeBrowser()

