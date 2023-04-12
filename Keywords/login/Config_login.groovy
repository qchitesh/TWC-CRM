package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable


public class Config_login {
	@Keyword
	public static void userLogin() 
	{
		WebUI.openBrowser('')
		
		WebUI.maximizeWindow()
		
		WebUI.navigateToUrl('https://dev-config.thewellnesscorner.com/')
		
		WebUI.setText(findTestObject('Configure_Panel_/Login_'), 'admin')
		
		WebUI.setText(findTestObject('Configure_Panel_/Password_'), 'Truworth@!@#')
		
		WebUI.click(findTestObject('Configure_Panel_/Log_IN'))
		
		WebUI.setText(findTestObject('Configure_Panel_/Search_Client'), 'Client20')
		
		WebUI.click(findTestObject('Configure_Panel_/Search_Button'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Configure_Panel_/Edit_Client'))
		
		if(WebUI.verifyElementPresent(findTestObject('Configure_Panel_/Verify_Client_Edit'), 3))
		{
			System.out.println("Test case pass")
		}
		
		else
		{
			System.out.println("Test case fail")
			assert false
		}
		
	}
}