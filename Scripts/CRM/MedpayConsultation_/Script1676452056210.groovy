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

WebUI.click(findTestObject('MedpayConsultations_/MedpayConsultations'))

WebUI.setText(findTestObject('MedpayConsultations_/Search_Tab_'), 'SPONSORED-117-45243')

WebUI.click(findTestObject('MedpayConsultations_/Serach_Icon'))

if (WebUI.verifyTextPresent('Medpay Appointments', true)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case pass')

    assert false
}

WebUI.click(findTestObject('Object Repository/MedpayConsultations_/View_Option'))

if (WebUI.verifyTextPresent('Medpay Appointment Details', true)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('Object Repository/MedpayConsultations_/Presription_Tab'))

WebUI.click(findTestObject('Object Repository/MedpayConsultations_/Open_Priscription'))

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.delay(5)

WebUI.click(findTestObject('MedpayConsultations_/Cross_PDF_Icon'))

WebUI.delay(5)

WebUI.back()

WebUI.click(findTestObject('MedpayConsultations_/Clear_Arrow'))

WebUI.delay(0)

WebUI.click(findTestObject('MedpayConsultations_/Page_3'))

WebUI.delay(5)

WebUI.setText(findTestObject('MedpayConsultations_/SearchTab_3_Page'), 'SPONSORED-104-94047')


