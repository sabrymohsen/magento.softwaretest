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
import com.kms.katalon.core.testobject.ConditionType
import org.openqa.selenium.WebElement



WebUI.openBrowser('https://magento.softwaretestingboard.com/')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 'example@outlook.com')

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'Test_123')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Home Page/span_Shorts_ui-menu-icon ui-icon ui-icon-carat-1-e'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Home Page/a_Tops'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Jackets'))


List<WebElement> productList = WebUI.findWebElements(findTestObject('Object Repository/Page_Jackets - Tops - Men/Page_Jackets - Tops - Men/div_window.authenticationPopup  autocompleteoff,customerRegisterUrlhttpsmagento.softwaretestingboard.comcustomeraccountcreate,customerForgotPasswordUrlhttpsmagento.softwaretestingboard.comcustomeraccountforgotpassword,ba'), 10)

int i = 2  

// Select the second product using dynamic XPath
TestObject product = new TestObject()
product.addProperty('xpath', ConditionType.EQUALS, "//*[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[" + i + "]")

WebUI.scrollToElement(product, 5)
// Hover over the second product
WebUI.mouseOver(product)

// Select the "Add to Cart" button using dynamic XPath
TestObject addToCartButton = new TestObject()
addToCartButton.addProperty('xpath', ConditionType.EQUALS, "//*[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[" + i + "]/div/div/div[4]/div/div[1]/form/button")

// Click the "Add to Cart" button
WebUI.click(addToCartButton)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/div_M'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/div_Color_option-label-color-93-item-49'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/a_My Cart                    1             _241c1f'))

WebUI.click(findTestObject('Object Repository/Page_Montana Wind Jacket/span_View and Edit Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Shopping Cart/a_Montana Wind Jacket'), 'Montana Wind Jacket')



WebUI.closeBrowser()

