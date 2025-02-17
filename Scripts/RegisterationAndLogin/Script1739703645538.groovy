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

// Generate a random email
int randomNum = ((Math.random() * 100000) as int) 
String uniqueEmail = "testuser" + randomNum + "@outlook.com"

// Start test
WebUI.openBrowser('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_First Name_firstname'), 'Sabry')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Last Name_lastname'), 'Mohsen')


WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Email_email'), uniqueEmail)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Password_password'), 'Test_123')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    'Test_123')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/span_Create an Account'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Account/div_Thank you for registering with Main Website Store'), 5)

WebUI.click(findTestObject('Object Repository/Page_My Account/button_Change'))

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Sign Out'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Sign In'))

// Use the same generated email for login
WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), uniqueEmail)

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'Test_123')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))


WebUI.comment("Generated Email: " + uniqueEmail)

WebUI.closeBrowser()

