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

class VerifyShoppingCartStep {
	@Given("I login success")
	def I_login_success() {

		verifyShoppingCart.VerifyShopping.SignIn()
		verifyShoppingCart.VerifyShopping.SignInSucess(findTestData('SignInShopping').getValue(1, 1), findTestData(
				'SignInShopping').getValue(2, 1))
	}

	@Then("I verify element present on Home page")
	def I_verify_element_present_on_Home_page() {
		verifyShoppingCart.VerifyShopping.VerifyHomePage()
	}

	@When("I click to Woment Item")
	def I_click_to_Woment_Item() {
		WebUI.click(findTestObject('VerifyShoppinCart/HomePage/menu_Women'))
	}
	@Then("I verify Top and Dresses categories")
	def I_verify_Top_and_Dresses_categories() {
		verifyShoppingCart.VerifyShopping.VerifyWomenPage()
	}

	@When("I click to the Top item")
	def I_click_to_the_Top_item() {
		WebUI.click(findTestObject('VerifyShoppinCart/WomenPage/cate_Tops'))
	}

	@Then("I verify TShirts and Blouses categories")
	def I_verify_TShirts_and_Blouses_categories() {
		verifyShoppingCart.VerifyShopping.VerifyTopsPage()
	}

	@When("I click to the product")
	def I_click_to_the_product() {
		WebUI.click(findTestObject('VerifyShoppinCart/TopsPage/item_Product'))
	}

	@Then("I verify product detail display")
	def I_verify_product_detail_display() {
		verifyShoppingCart.VerifyShopping.VerifyProductPage()
	}

	@When("I click add to cart")
	def I_click_add_to_cart() {
		WebUI.click(findTestObject('VerifyShoppinCart/ProductPage/AddToCart'))
	}

	@Then("I verify Cart displayed")
	def I_verify_Cart_displayed() {
		verifyShoppingCart.VerifyShopping.VerifyCartPage()
	}


	@When("I click to Processed")
	def I_click_to_Processed() {
		WebUI.click(findTestObject('VerifyShoppinCart/ProductPage/Proceed'))
	}

	@Then("I verify the screen Shopping Cart Summary display")
	def I_verify_the_screen_Shopping_Cart_Summary_display() {
		verifyShoppingCart.VerifyShopping.VerifyCartSummaryPage()
	}

	@When("I click SignOut")
	def I_click_SignOut() {
		WebUI.click(findTestObject('VerifyShoppinCart/button_SignOut'))
	}

	@Then("I verify message displayed")
	def I_verify_message_displayed() {
		WebUI.verifyTextPresent('Your shopping cart is empty.', false)

		WebUI.closeBrowser()
	}
}