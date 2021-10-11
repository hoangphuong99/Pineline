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

WebUI.navigateToUrl(GlobalVariable.urlShoppingCart)

WebUI.verifyElementPresent(findTestObject('CreateNewUser/button_SignIn'), GlobalVariable.waitPresentTimeout)

WebUI.click(findTestObject('CreateNewUser/button_SignIn'))

CustomKeywords.'createUser.CreateNewUser.VerifyCreateAccountSection'()

WebUI.setText(findTestObject('CreateNewUser/input_Email'), GlobalVariable.inputEmail)

WebUI.click(findTestObject('CreateNewUser/button_CreateAccount'))

CustomKeywords.'createUser.CreateNewUser.VerifyYourPersonalInformatin'()

CustomKeywords.'createUser.CreateNewUser.InputInfor'(findTestData('createUser').getValue(1, 1), findTestData('createUser').getValue(
        2, 1), findTestData('createUser').getValue(3, 1), findTestData('createUser').getValue(4, 1), findTestData('createUser').getValue(
        5, 1), findTestData('createUser').getValue(6, 1), findTestData('createUser').getValue(7, 1), findTestData('createUser').getValue(
        8, 1))

WebUI.click(findTestObject('CreateNewUser/Register/button_Register'))

WebUI.verifyTextPresent('Welcome to your account. Here you can manage all of your personal information and orders.', false)

WebUI.closeBrowser()

