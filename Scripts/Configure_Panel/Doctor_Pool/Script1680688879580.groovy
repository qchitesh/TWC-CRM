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

CustomKeywords.'login.Config_login.userLogin'()

WebUI.click(findTestObject('Configure_Panel_/Doctor_Pool/Doctor_Pool'))

WebUI.click(findTestObject('Configure_Panel_/Doctor_Pool/Create_Doctor_Pool'))

WebUI.setText(findTestObject('Configure_Panel_/Doctor_Pool/Enter_Doctor_Pool_Name'), 'Dental Care 1')

WebUI.setText(findTestObject('Configure_Panel_/Doctor_Pool/Pool_Discription_'), 'Overall Dental care cover in 3 month subcription.')

WebUI.click(findTestObject('Configure_Panel_/Doctor_Pool/Save'))

WebUI.click(findTestObject('Configure_Panel_/Doctor_Pool/Eye_Icon'))

WebUI.click(findTestObject('Configure_Panel_/Doctor_Pool/Add_Doctor'))

WebUI.setText(findTestObject('Configure_Panel_/Doctor_Pool/Select_Expert_'), 'rohit')

WebUI.click(findTestObject('Configure_Panel_/Doctor_Pool/Select_Specility'))

WebUI.click(findTestObject('Configure_Panel_/Doctor_Pool/Add'))

WebUI.back()

WebUI.closeBrowser()

