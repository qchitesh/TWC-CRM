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

WebUI.click(findTestObject('CRM_/Appointment_Pipeline/Appointement_Pipeline'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_Pipeline/Select_Start_Date'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_Pipeline/Start_Date'))

WebUI.delay(2)

WebUI.click(findTestObject('Appointment_Pipeline/End_Date'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_Pipeline/Submit_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_Pipeline/View_1'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_Pipeline/Assign_Partner'))

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Appointment_Pipeline/Click_Assign_Partner'))

WebUI.click(findTestObject('CRM_/Appointment_Pipeline/TATA 1MG'))

WebUI.setText(findTestObject('CRM_/Appointment_Pipeline/Booking_ID'), 'TATA_100')

WebUI.click(findTestObject('CRM_/Appointment_Pipeline/Submit_'))

WebUI.closeBrowser()

