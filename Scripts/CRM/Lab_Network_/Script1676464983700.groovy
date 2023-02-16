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
import java.awt.Robot as Robot
import java.awt.AWTException as AWTException
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver

CustomKeywords.'login.Login_CRM.userLogin'()

WebUI.click(findTestObject('Lab_Network/Lab_Network'))

WebUI.click(findTestObject('Lab_Network/Add_Network'))

WebUI.setText(findTestObject('Lab_Network/Lab_Name'), 'PositiveBlood')

WebUI.click(findTestObject('Lab_Network/Submit_Button'))

WebUI.click(findTestObject('Lab_Network/Eye-Symbol_Lab'))

WebUI.click(findTestObject('Lab_Network/Add_Lab'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Lab_Network/Create_Lab'), 'test')

WebUI.delay(3)

Robot r = new Robot()

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)

r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)
r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)
r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)
r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)
r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)
r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)
r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)
r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)
r.keyPress(KeyEvent.VK_DOWN)

r.keyRelease(KeyEvent.VK_DOWN)




WebUI.click(findTestObject('Lab_Network/Lab_DropDown'), 5)
WebUI.click(findTestObject('Lab_Network/Submit_Button_2'))

