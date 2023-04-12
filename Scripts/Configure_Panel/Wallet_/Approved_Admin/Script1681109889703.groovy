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

WebUI.click(findTestObject('Configure_Panel_/Approved_User/Wallet_Request'))

WebUI.click(findTestObject('Configure_Panel_/Approved_User/Eye_Verified'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Poceed'))

WebUI.click(findTestObject('Configure_Panel_/Create_Client_/Yes_Confirmation'))

WebUI.back()

WebUI.refresh()

if(WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Create_Client_/Check_Approved_Status'), 3))
{
	System.out.println("User are Approved")
}
else
{
	System.out.println("User not approved")
	assert false
	
}

WebUI.closeBrowser()

