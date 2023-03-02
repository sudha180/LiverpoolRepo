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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opwaqab.liverpool.com.mx/tienda/home')

WebUI.callTestCase(findTestCase('CommonMethods/clickIniciarSession_Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : 'nsamraj@palnyc.com', ('password') : 'test12345'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SRP/firstProductImage_srp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SRP/secondProductImage_srp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SRP/thirdProductImage_srp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SRP/fourthProductImage_srp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

productName_plp = WebUI.getText(findTestObject('SRP/fifthproductName'))

WebUI.click(findTestObject('SRP/fifthProductImage_srp'))

productNameActual_pdp = WebUI.getText(findTestObject('pdp/productName_pdp'))

productNameActual_pdp == productName_plp

WebUI.click(findTestObject('HomePage/Liverpool Logo2'))

WebUI.scrollToElement(findTestObject('HomePage/catridgeAImage_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/catridgeAImage_hp'), 0)

WebUI.verifyTextPresent(productNameActual_pdp, false)

not_run: WebUI.verifyElementAttributeValue(findTestObject('HomePage/productInRecentlyViewed_hp'), productNameActual_pdp, 
    productName_plp, 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePage/productInRecentlyViewed_hp'), 0)

not_run: WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : productNameActual_pdp], 
    FailureHandling.STOP_ON_FAILURE)

