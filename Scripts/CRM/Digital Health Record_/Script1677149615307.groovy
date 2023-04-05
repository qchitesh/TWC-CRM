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

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Digital Health Record/Digital Health Record_'))

WebUI.click(findTestObject('CRM_/Digital Health Record/Convert'))

test = WebUI.setText(findTestObject('CRM_/Digital Health Record/Enter_Value'), '10')

WebUI.verifyElementPresent(findTestObject('Object Repository/CRM_/Digital Health Record/Enter_Value'), 5)

WebUI.setText(findTestObject('CRM_/Digital Health Record/Min_Value'), '1')

WebUI.setText(findTestObject('CRM_/Digital Health Record/Max_value'), '10')

WebUI.setText(findTestObject('CRM_/Digital Health Record/unit_Value'), 'Primary')

WebUI.setText(findTestObject('CRM_/Digital Health Record/Enter-Value_2'), '7')

WebUI.setText(findTestObject('CRM_/Digital Health Record/Min_Value_2'), '0')

WebUI.setText(findTestObject('CRM_/Digital Health Record/Max_Value_2'), '10')

WebUI.setText(findTestObject('CRM_/Digital Health Record/Unit_Value_2'), 'Secoundary')

WebUI.setText(findTestObject('CRM_/Digital Health Record/Set_Value'), 'Positive')

WebUI.setText(findTestObject('CRM_/Digital Health Record/Unit_Value_3'), 'quaternary')

if (WebUI.verifyElementClickable(findTestObject('CRM_/Digital Health Record/save_Button'))) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('CRM_/Digital Health Record/save_Button'))

WebUI.closeBrowser()

