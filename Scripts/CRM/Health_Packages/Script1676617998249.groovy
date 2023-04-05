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
import java.awt.AWTException as AWTException
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver

CustomKeywords.'login.Login_CRM.userLogin'()

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/CRM_Login/Open_Slider'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('CRM_/Health_Packages/Health_Package'))

WebUI.click(findTestObject('CRM_/Health_Packages/Create_Pacake'))

if (WebUI.verifyElementPresent(findTestObject('CRM_/Health_Packages/Title_Verify'), 5)) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.setText(findTestObject('CRM_/Health_Packages/Enter_name'), 'ThinkPositive')

WebUI.setText(findTestObject('CRM_/Health_Packages/Enter_Code'), '0088')

WebUI.click(findTestObject('CRM_/Health_Packages/Enter_Gender'))

WebUI.click(findTestObject('CRM_/Health_Packages/Gender_Male'))

WebUI.setText(findTestObject('CRM_/Health_Packages/Enter_Age'), '25')

WebUI.click(findTestObject('CRM_/Health_Packages/Risk_Catagoery'))

WebUI.click(findTestObject('CRM_/Health_Packages/Select_Risk'))

WebUI.setText(findTestObject('CRM_/Health_Packages/Fasting_required'), '6 hr')

WebUI.setText(findTestObject('CRM_/Health_Packages/Enter_Time'), '11:30 AM')

WebUI.setText(findTestObject('CRM_/Health_Packages/Parameter'), '18')

WebUI.setText(findTestObject('CRM_/Health_Packages/MRP_'), '1999')

WebUI.setText(findTestObject('CRM_/Health_Packages/Selling_Price'), '1599')

WebUI.setText(findTestObject('CRM_/Health_Packages/Corporate_Price'), '1299')

WebUI.setText(findTestObject('CRM_/Health_Packages/Platinum_Price'), '999')

WebUI.click(findTestObject('CRM_/Health_Packages/Home_Collection'))

WebUI.scrollToElement(findTestObject('CRM_/Health_Packages/Time_Slot'), 5)

WebUI.delay(10)

WebUI.setText(findTestObject('CRM_/Health_Packages/Time_Slot'), 'Before 10AM')

WebUI.setText(findTestObject('CRM_/Health_Packages/Appointment_End_Time'), '2 days before')

WebUI.click(findTestObject('CRM_/Health_Packages/Retail_Button'))

WebUI.setText(findTestObject('CRM_/Health_Packages/Test_Package'), 'Truworth_Test')

Robot robot = new Robot()

Thread.sleep(2000)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.setText(findTestObject('CRM_/Health_Packages/Total_Parameter'), '22')

WebUI.setText(findTestObject('CRM_/Health_Packages/Sub_Child'), 'TruSoft')

WebUI.setText(findTestObject('CRM_/Health_Packages/Description'), 'Please come 30 min before appointment time')

if (WebUI.verifyElementClickable(findTestObject('CRM_/Health_Packages/Submit_Button'))) {
    System.out.println('Test case pass')
} else {
    System.out.println('Test case fail')

    assert false
}

WebUI.click(findTestObject('Object Repository/CRM_/Health_Packages/Submit_Button'))

WebUI.closeBrowser()

