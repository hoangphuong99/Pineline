package samples
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class CreateUserSteps {

	@Given("I navigate to Automation Website")
	def I_navigate_to_Automation_Website() {

		WebUI.navigateToUrl(GlobalVariable.urlShoppingCart)
		WebUI.maximizeWindow()
	}

	@Then("I verify the Sign in button")
	def I_verify_the_Sign_in_button() {
		WebUI.verifyElementPresent(findTestObject('CreateNewUser/button_SignIn'), GlobalVariable.waitPresentTimeout)
	}

	@When("I click to Sign in button")
	def I_click_to_Sign_in_button() {

		WebUI.click(findTestObject('CreateNewUser/button_SignIn'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CreateNewUser/label_Email'), 50)
	}

	@Then("I verify the email field and create an account section")
	def I_verify_the_email_field_and_create_an_account_section() {

		createUser.CreateNewUser.VerifyCreateAccountSection()
	}

	@When("I input email and click create an account")
	def I_input_email_and_click_create_an_account() {
		WebUI.setText(findTestObject('CreateNewUser/input_Email'), GlobalVariable.inputEmail)

		WebUI.click(findTestObject('CreateNewUser/button_CreateAccount'))
	}

	@Then("I verify the your personal information display")
	def I_verify_the_your_personal_information_display() {
		createUser.CreateNewUser.VerifyYourPersonalInformatin()
	}


	@When("I input all information of required and click Register button")
	def I_input_all_information_of_required_and_click_Register_button() {
		createUser.CreateNewUser.InputInfor(findTestData('createUser').getValue(1, 1), findTestData('createUser').getValue(
				2, 1), findTestData('createUser').getValue(3, 1), findTestData('createUser').getValue(4, 1), findTestData('createUser').getValue(
				5, 1), findTestData('createUser').getValue(6, 1), findTestData('createUser').getValue(7, 1), findTestData('createUser').getValue(
				8, 1))

		WebUI.click(findTestObject('CreateNewUser/Register/button_Register'))
	}

	@Then("I verify create an account successful")
	def I_verify_create_an_account_successful() {
		WebUI.verifyTextPresent('Welcome to your account. Here you can manage all of your personal information and orders.', false)
	}
}