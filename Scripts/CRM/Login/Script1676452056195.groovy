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

WebUI.click(findTestObject('CRM_Login/Submit_Button'))

alert = WebUI.getText(findTestObject('CRM_Login/Alert_Login'))

System.out.println(alert)

alert07 = WebUI.getText(findTestObject('CRM_Login/Alert_password'))

System.out.println(alert07)

WebUI.setText(findTestObject('CRM_Login/Login_'), 'admin')

WebUI.delay(2)

WebUI.setText(findTestObject('CRM_Login/Password_'), 'Truworth@!@#')

WebUI.delay(0)

WebUI.click(findTestObject('CRM_Login/Submit_Button'))

if (WebUI.verifyElementPresent(findTestObject('CRM_Login/Verify_Sussefully_Login'), 5)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}



