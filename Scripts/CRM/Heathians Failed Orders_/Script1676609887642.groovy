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

WebUI.click(findTestObject('CRM_/Healthians_/Healthians_'))

WebUI.click(findTestObject('CRM_/Healthians_Failed_Orders/Failed_Orders'))

WebUI.click(findTestObject('CRM_/Healthians_Failed_Orders/Eye_Icon'))

//if (WebUI.getText(findTestObject('CRM_/Healthians_Failed_Orders/Text_Verify'))) {
//    System.out.println('Test case pass')
//} else {
//    'Test case fail'
//    assert false
//}
WebUI.click(findTestObject('Object Repository/CRM_/Healthians_Failed_Orders/Reschedule_'))

WebUI.click(findTestObject('CRM_/Healthians_Failed_Orders/Date_Symbol'))

WebUI.click(findTestObject('CRM_/Healthians_Failed_Orders/Year_Symbol'))

WebUI.click(findTestObject('CRM_/Healthians_Failed_Orders/Year_Symbol_2'))

WebUI.click(findTestObject('CRM_/Healthians_Failed_Orders/Date_'))

WebUI.click(findTestObject('CRM_/Healthians_Failed_Orders/Cross_Icon'))

WebUI.back()

WebUI.back()

WebUI.back()

WebUI.closeBrowser()

