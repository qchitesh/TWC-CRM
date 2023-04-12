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

WebUI.back()

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Create_Client'))

WebUI.delay(2)

int randomemail = (((Math.random() * ((10000 - 100) + 1)) + 100) as int)

def name = 'hitesh'

WebUI.setText(findTestObject('Configure_Panel_/Create_Client_/Client_name'), (name + randomemail) + '@mailinator.com')

WebUI.delay(4)

WebUI.uploadFile(findTestObject('Configure_Panel_/Create_Client_/Select_Image'), 'D:\\Hitesh Sanjay Chandankar\\Downloads\\test.jpg')

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Client_Partner'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Partner_B'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Save_'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

