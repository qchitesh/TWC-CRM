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

WebUI.click(findTestObject('LAB_/Lab_'))

WebUI.click(findTestObject('LAB_/Create_Lab'))

WebUI.setText(findTestObject('LAB_/First_Name'), 'Bloodology')

WebUI.setText(findTestObject('LAB_/PinCode'), '302021')

WebUI.setText(findTestObject('LAB_/NT_Code'), 'Lab007')

WebUI.setText(findTestObject('LAB_/Parent_Code'), '125')

WebUI.click(findTestObject('LAB_/Select_State'))

WebUI.click(findTestObject('LAB_/Select_State_2'))

WebUI.click(findTestObject('LAB_/Select_City'))

WebUI.click(findTestObject('LAB_/Select_City_2'))

WebUI.setText(findTestObject('LAB_/Address_'), 'Assam_07')

WebUI.setText(findTestObject('LAB_/Logititude_'), '12.26')

WebUI.setText(findTestObject('LAB_/Latitude'), '15.56')

WebUI.click(findTestObject('LAB_/Schedule_Date'))

WebUI.click(findTestObject('LAB_/Select_Day_'))

WebUI.click(findTestObject('LAB_/Select_Date'))

WebUI.click(findTestObject('LAB_/Select_Date_2'))

WebUI.click(findTestObject('LAB_/Select_PM'))

WebUI.click(findTestObject('LAB_/Select_PM'))

WebUI.click(findTestObject('LAB_/Click_Ok'))

WebUI.click(findTestObject('LAB_/End_Time'))

WebUI.click(findTestObject('LAB_/Select_End_Time'))

WebUI.click(findTestObject('LAB_/Select_EndTime_2'))

WebUI.click(findTestObject('LAB_/Select_End_AM'))

WebUI.click(findTestObject('LAB_/Ok_End_Button'))

WebUI.click(findTestObject('LAB_/Submit_Button'))

WebUI.click(findTestObject('LAB_/Delete_Button'))

