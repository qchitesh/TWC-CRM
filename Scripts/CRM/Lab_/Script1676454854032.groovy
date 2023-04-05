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

WebUI.click(findTestObject('CRM_/CRM_Login/Open_Slider'), FailureHandling.OPTIONAL)

WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.click(findTestObject('CRM_/LAB_/Lab_'))

WebUI.click(findTestObject('CRM_/LAB_/All_Lab'))

WebUI.click(findTestObject('CRM_/LAB_/Create_Lab'))

WebUI.setText(findTestObject('CRM_/LAB_/First_Name'), 'Bloodology')

WebUI.setText(findTestObject('CRM_/LAB_/PinCode'), '302021')

WebUI.setText(findTestObject('CRM_/LAB_/NT_Code'), 'Lab007')

WebUI.setText(findTestObject('CRM_/LAB_/Parent_Code'), '125')

WebUI.delay(5)

WebUI.click(findTestObject('CRM_/LAB_/Select_State'))

WebUI.click(findTestObject('CRM_/LAB_/Select_State_2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CRM_/LAB_/Select_City'))

WebUI.click(findTestObject('CRM_/LAB_/Select_City_2'))

WebUI.setText(findTestObject('CRM_/LAB_/Address_'), 'Assam_07')

WebUI.setText(findTestObject('CRM_/LAB_/Logititude_'), '12.26')

WebUI.setText(findTestObject('CRM_/LAB_/Latitude'), '15.56')

WebUI.click(findTestObject('CRM_/LAB_/Schedule_Date'))

WebUI.click(findTestObject('CRM_/LAB_/Select_Day_'))

WebUI.click(findTestObject('CRM_/LAB_/Select_Date'))

WebUI.click(findTestObject('CRM_/LAB_/Select_Date_2'))

WebUI.click(findTestObject('CRM_/LAB_/Select_PM'))

WebUI.click(findTestObject('CRM_/LAB_/Select_PM'))

WebUI.click(findTestObject('CRM_/LAB_/Click_Ok'))

WebUI.click(findTestObject('CRM_/LAB_/End_Time'))

WebUI.click(findTestObject('CRM_/LAB_/Select_End_Time'))

WebUI.click(findTestObject('CRM_/LAB_/Select_EndTime_2'))

WebUI.click(findTestObject('CRM_/LAB_/Select_End_AM'))

WebUI.click(findTestObject('CRM_/LAB_/Ok_End_Button'))

WebUI.click(findTestObject('CRM_/LAB_/Submit_Button'))

not_run: WebUI.click(findTestObject('CRM_/LAB_/Delete_Button'))

WebUI.closeBrowser()

