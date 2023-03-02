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

WebUI.click(findTestObject('HomePage/Buscar1'))

WebUI.setText(findTestObject('HomePage/Buscar1'), 'vaso')

not_run: WebUI.waitForElementPresent(findTestObject('HomePage/typeAheadLeftNav_hp'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Liverpool es parte de Mi vida/typeAheadLeftNav_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/Buscar en Categorías'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/en_typeAhead'), 0)

WebUI.click(findTestObject('HomePage/en_typeAhead'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/assertplp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

