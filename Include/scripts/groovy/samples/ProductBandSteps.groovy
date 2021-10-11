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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

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



class ProductBandSteps {

	@Given("I navigate to Automation Website")
	def I_navigate_to_Automation_Website() {

		WebUI.navigateToUrl(GlobalVariable.urlShoppingCart)
		WebUI.maximizeWindow()
	}


	@When("I navigate to Lazada Website")
	def I_navigate_to_Lazada_Website() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.urlLazada)
		WebUI.maximizeWindow()
	}

	@Then("I verify Home page")
	def I_verify_Home_page() {
		lazada.Lazada.VerifyHomePage()
	}

	//Product band
	@When("I input search box")
	def I_input_search_box() {
		WebUI.setText(findTestObject('Lazada/HomePage/input_Search'), findTestData('ProductBand').getValue(1, 1))
		WebUI.verifyElementPresent(findTestObject('Lazada/ResultPage/input_Product1'), 5)
	}

	@And("I click to the search button")
	def I_click_to_the_search_button() {
		WebUI.click(findTestObject('Lazada/HomePage/button_Search'))
	}

	@Then("I verify result displayed")
	def I_verify_result_displayed() {
		lazada.Lazada.VerifyResultPage()
	}

	@When("I click to First News-Trí Việt band")
	def I_click_to_First_NewsTrí_Việt_band() {
		WebUI.click(findTestObject('Lazada/ResultPage/checkbox_ProductBand'))
	}

	@Then("I verify the result displayed")
	def I_verify_the_result_displayed() {
		WebUI.verifyElementPresent(findTestObject('Lazada/ResultPage/fillter_ProductBand'), 5)
	}

	@When("I click to first product")
	def I_click_to_first_product() {
		WebUI.click(findTestObject('Lazada/ResultPage/firstProductBand'))
	}

	@Then("I verify the product screen display and product band")
	def I_verify_the_product_screen_display_and_product_band() {
		lazada.Lazada.VerifyProductPage()

		WebUI.verifyTextPresent('First News - Trí Việt', false)

	}
	//LazMall
	@When("I input (.*) to search box")
	def I_Input_Co_Hai_Con_Meo_Ngoi_Ben_Cua_So_To_Search_Box(String search) {
		WebUI.setText(findTestObject('Lazada/HomePage/input_Search'),search)
	}

	@Then("I verify search box")
	def I_Verify_Search_Box() {
		WebUI.verifyElementPresent(findTestObject('Lazada/ResultPage/input_Product2'), 5)
	}

	@When("I click to search button")
	def I_Click_To_Search_Button() {
		WebUI.click(findTestObject('Lazada/HomePage/button_Search'))
	}

	@Then("I verify result displayed and product")
	def I_Verify_Result_Displayed_And_Product() {
		List listLazmallTag = WebUI.findWebElements(findTestObject('Object Repository/Lazada/ResultPage/list_LazMall'), 30)
		println(listLazmallTag.size())
		lazada.Lazada.VerifyResultPage()


	}

	//LazMall2
	@Then("I verify product result displayed")
	def I_Verify_Product_Result_Displayed() {
		lazada.Lazada.VerifyResultPage()
	}

	@When("I click LazMall in Dich Vu")
	def I_Click_LazMall_In_Dich_Vu() {
		WebUI.click(findTestObject('Object Repository/Lazada/ResultPage/checkbox_LazMall'))
		lazada.Lazada.VerifyLazMallPage()
	}

	@And("I click to product with lowest price")
	def I_Click_To_Product_With_Lowest_Price() {
		WebUI.click(findTestObject('Object Repository/Lazada/LowestProduct/select_Lowest'))
		WebUI.click(findTestObject('Object Repository/Lazada/LowestProduct/select_Lowest2'))
		WebUI.click(findTestObject('Object Repository/Lazada/LowestProduct/ProductLowest'))
	}

	@Then("I verify product screen displayed")
	def I_Verify_Product_Screen_Displayed() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/LowestProduct/titleProduct'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/LowestProduct/priceProduct'), 5)
	}

	@And("I verify product title")
	def I_Verify_Product_Title() {
		WebUI.verifyTextPresent('Có Hai Con Mèo Ngồi Bên Cửa Sổ', false)

	}



}