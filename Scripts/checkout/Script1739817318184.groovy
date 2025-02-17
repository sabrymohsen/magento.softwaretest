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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('https://magento.softwaretestingboard.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 'example2@outlook.com')

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'Test_123')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Home Page/span_Shorts_ui-menu-icon ui-icon ui-icon-carat-1-e'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Home Page/a_Tops'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Jackets'))

List<WebElement> productList = WebUI.findWebElements(findTestObject('Object Repository/Page_Jackets - Tops - Men/div_window.authenticationPopup  autocompleteoff,customerRegisterUrlhttpsmagento.softwaretestingboard.comcustomeraccountcreate,customerForgotPasswordUrlhttpsmagento.softwaretestingboard.comcustomeraccountforgotpassword,ba'), 
    10)

int i = 2

// Select the second product using dynamic XPath
TestObject product = new TestObject()

product.addProperty('xpath', ConditionType.EQUALS, ('//*[@id=\'maincontent\']/div[3]/div[1]/div[3]/ol/li[' + i) + ']')

WebUI.scrollToElement(product, 5)

// Hover over the second product
WebUI.mouseOver(product)

// Select the "Add to Cart" button using dynamic XPath
TestObject addToCartButton = new TestObject()

addToCartButton.addProperty('xpath', ConditionType.EQUALS, ('//*[@id=\'maincontent\']/div[3]/div[1]/div[3]/ol/li[' + i) + 
    ']/div/div/div[4]/div/div[1]/form/button')

// Click the "Add to Cart" button
WebUI.click(addToCartButton)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/div_Color_option-label-color-93-item-49'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/a_My Cart                    1             _241c1f'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/span_View and Edit Cart'))


WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/span_Proceed to Checkout'))

// Check if the user has existing shipping details
boolean isShippingSaved = WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout/Page_Checkout/div_Shipping Address'), 'Shipping Address')

if (!isShippingSaved) {
	// First-time user: Fill in shipping details
	WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/span_Proceed to Checkout'))

	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Company_company'), 'test')
	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 1_street0'), 'shrouk')
	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 2_street1'), 'hodasharawy')
	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 3_street2'), 'valla70')
	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_City_city'), 'cairo')

	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Please select a region, state or pro_d80c8a'),
		'12', true)

	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_ZipPostal Code_postcode'), '11837')

	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Afghanistanland IslandsAlbaniaAlgeri_87ca51'),
		'EG', true)

	WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Phone Number_telephone'), '01022672626')

	WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Next'))
} else {
	// User already has shipping details saved
	WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Next'))
}

// Complete the order
WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Place Order'))

// Verify order success
WebUI.verifyElementText(findTestObject('Object Repository/Page_Success Page/span_Thank you for your purchase'), 'Thank you for your purchase!')
