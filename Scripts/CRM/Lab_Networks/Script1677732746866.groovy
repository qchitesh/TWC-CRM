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

WebUI.click(findTestObject('Lab_Network/Lab_Network'))

WebUI.click(findTestObject('Lab_Network/Add_Network'))

WebUI.setText(findTestObject('Lab_Network/Network_Name'), 'DonteBlood')

WebUI.click(findTestObject('Lab_Network/Submit_Button'))

WebUI.delay(5)

WebUI.click(findTestObject('Lab_Network/Eye-Symbol_Lab'))

WebUI.click(findTestObject('Lab_Network/Add_Lab'))

WebUI.setText(findTestObject('Lab_Network/Lab_Name'), 'new testing lab')

WebUI.click(findTestObject('Lab_Network/Lab_DropDown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Lab_Network/Submit_Button_2'))

WebUI.delay(2)

if(WebUI.verifyTextPresent('New testing lab', true))
{
	System.out.println("Test case pass")
}
else
{
	System.out.println("Test case fail")
	assert false
}
 WebUI.closeBrowser()
