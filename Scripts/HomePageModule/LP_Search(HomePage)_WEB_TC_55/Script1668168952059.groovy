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
import com.katalon.sudha.GenerateRandomEmail
WebUI.openBrowser('')

WebUI.navigateToUrl('https://opwaqab.liverpool.com.mx/tienda/home')

WebUI.click(findTestObject('Object Repository/AccountManagement/Iniciar sesin_hp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin en Liverpool/a_Crear cuenta'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

String Mail = CustomKeywords.'com.katalon.sudha.GenerateRandomEmail.getEmail'('testing', 'mailinator.com')

WebUI.setText(findTestObject('Object Repository/AccountManagement/input_Correo electrnico_email_AM'), Mail)

WebUI.setEncryptedText(findTestObject('Object Repository/AccountManagement/input_Contrasea_password_AM'), 'R2dZ4hvJ2ugmSF41W9Lwpw==')

WebUI.click(findTestObject('Object Repository/AccountManagement/button_Crear cuenta'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Object Repository/AccountManagement/user_firstName_AM'), 'sudha')

WebUI.setText(findTestObject('Object Repository/AccountManagement/user_lastName_AM'), 'rani')

WebUI.selectOptionByValue(findTestObject('Object Repository/AccountManagement/select_day_AM'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AccountManagement/select_month_AM'), 
    'Ago', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AccountManagement/select_year_AM'), 
    '2004', true)

WebUI.click(findTestObject('Object Repository/AccountManagement/input_gender_AM'))

WebUI.click(findTestObject('Object Repository/AccountManagement/button_Crear cuenta (1)'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('Object Repository/AccountManagement/span_Hola sudha_AM'), 0)

