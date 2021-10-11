package createUser
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.sun.org.apache.bcel.internal.generic.Select
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


public class CreateNewUser {

	@Keyword
	public static void VerifyCreateAccountSection() {
		WebUI.delay(1)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CreateNewUser/label_Email'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CreateNewUser/label_Email'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CreateNewUser/button_CreateAccount'), GlobalVariable.waitPresentTimeout)
	}

	@Keyword
	public static void VerifyYourPersonalInformatin() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/CreateNewUser/label_Title'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CreateNewUser/label_Title'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CreateNewUser/label_FName'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CreateNewUser/label_LName'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CreateNewUser/label_Mail'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CreateNewUser/label_Pass'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CreateNewUser/label_Date'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CreateNewUser/section_YourAddress'), GlobalVariable.waitPresentTimeout)
	}

	@Keyword
	public static void InputInfor(String firstName,String lastName,String password,String address,String city,String state,String code,String Phone) {

		WebUI.waitForElementVisible(findTestObject('Object Repository/CreateNewUser/Register/input_FName'), GlobalVariable.waitPresentTimeout)
		WebUI.setText(findTestObject('Object Repository/CreateNewUser/Register/input_FName'), firstName)
		WebUI.setText(findTestObject('Object Repository/CreateNewUser/Register/input_LName'), lastName)
		WebUI.setText(findTestObject('Object Repository/CreateNewUser/Register/input_Pass'), password)

		WebUI.setText(findTestObject('Object Repository/CreateNewUser/Register/input_FirstName'), firstName)
		WebUI.setText(findTestObject('Object Repository/CreateNewUser/Register/input_LastName'), lastName)
		WebUI.setText(findTestObject('Object Repository/CreateNewUser/Register/input_Address'), address)
		WebUI.setText(findTestObject('Object Repository/CreateNewUser/Register/input_City'), city)

		WebUI.selectOptionByValue(findTestObject('Object Repository/CreateNewUser/Register/select_State'), state, true)
		WebUI.setText(findTestObject('Object Repository/CreateNewUser/Register/input_Code'), code)

		WebUI.setText(findTestObject('Object Repository/CreateNewUser/Register/input_Mobile'), Phone)
	}
}