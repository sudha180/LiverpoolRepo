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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opwaqab.liverpool.com.mx/tienda/home')

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/i_Ms informacin_icon-close close'), 0)

    WebUI.click(findTestObject('Object Repository/i_Ms informacin_icon-close close'))
}

WebUI.click(findTestObject('Object Repository/HomePage/a_Trminos y condiciones_hp'))

WebUI.switchToWindowTitle('Ayuda Liverpool')

termsAndConditions = WebUI.getUrl()
if (termsAndConditions.contains('liverpool.com.mx/ayuda/index.html')) {
	print('url is correct')
} else {
	KeywordUtil.markFailed('url is not correct')
}


WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/h3_Trminos y condiciones_tnc'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/div_Trminos y condiciones_tnc'), 
    0)

