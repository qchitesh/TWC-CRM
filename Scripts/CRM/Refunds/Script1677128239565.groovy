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

WebUI.click(findTestObject('CRM_/Refunds/Refunds'))

WebUI.click(findTestObject('CRM_/Refunds/Refund Requests'))

WebUI.setText(findTestObject('CRM_/Refunds/Search_Box'), 'TWC-127-58A91P')

WebUI.click(findTestObject('CRM_/Refunds/Search_Button'))

if (WebUI.verifyTextPresent('TWC-127-58A91P', true)) {
    System.out.println('Test case pass')
} else {
    'Test case fail'
    assert false
}

WebUI.click(findTestObject('CRM_/Refunds/View_'))

if (WebUI.verifyElementPresent(findTestObject('CRM_/Refunds/Check_Status'), 5)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case pass')

    assert false
}

WebUI.back()

WebUI.back()

not_run: WebUI.back()

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/CRM_Login/Open_Slider'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Refunds/Refunds'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Refunds/Submit_Request'))

WebUI.setText(findTestObject('CRM_/Refunds/Search_Box'), 'TWC-298-4RBQEP')

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Refunds/Search_Button_2'))

not_run: WebUI.click(findTestObject('CRM_/Refunds/View_'))

not_run: WebUI.delay(5)

not_run: WebUI.scrollToElement(findTestObject('CRM_/Refunds/Refunds_Title'), 5)

WebUI.delay(5)

WebUI.click(findTestObject('CRM_/Refunds/Issue_Refund'))

WebUI.setText(findTestObject('CRM_/Refunds/Amount_Tab'), '300')

WebUI.setText(findTestObject('CRM_/Refunds/Reason_Tab'), 'Personal Resaon')

WebUI.click(findTestObject('CRM_/Refunds/Submit_Button'))

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('CRM_/Refunds/Subnit_Verificatin'), 5)) {
    System.out.println('User amount are already refunded')
}

WebUI.click(findTestObject('CRM_/Refunds/Cancel_Button'))

WebUI.closeBrowser()

