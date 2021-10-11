package verifyShoppingCart

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

public class VerifyShopping {
	@Keyword
	def static void SignIn() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.urlShoppingCart)
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('CreateNewUser/button_SignIn'))
	}
	@Keyword
	def static void SignInSucess(String mail,String Pass) {

		WebUI.waitForElementVisible(findTestObject('Object Repository/VerifyShoppinCart/input_Email'), GlobalVariable.waitPresentTimeout)
		WebUI.setText(findTestObject('Object Repository/VerifyShoppinCart/input_Email'), mail)
		WebUI.setText(findTestObject('Object Repository/VerifyShoppinCart/input_Password'), Pass)
		WebUI.click(findTestObject('Object Repository/VerifyShoppinCart/button_SignIn'))
		WebUI.delay(1)
	}

	@Keyword
	def static void VerifyHomePage() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/VerifyShoppinCart/HomePage/menu_Women'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/HomePage/menu_Women'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/HomePage/menu_Dresses'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/HomePage/menu_Tshirt'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/HomePage/menu_Address'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/HomePage/menu_Credit'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/HomePage/menu_Order'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/HomePage/menu_PersonalInfor'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/HomePage/menu_WishList'), GlobalVariable.waitPresentTimeout)
	}

	@Keyword
	def static void VerifyWomenPage() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/VerifyShoppinCart/WomenPage/cate_Tops'), GlobalVariable.waitPresentTimeout)
		//
//				List<WebElement> listSubCategory =  WebUiBuiltInKeywords.findWebElement('Object Repository/VerifyShoppinCart/WomenPage/list_SubCate')
//				println(listSubCategory.size())
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/WomenPage/cate_Tops'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/WomenPage/cate_Dresses'), GlobalVariable.waitPresentTimeout)
	}

	@Keyword
	def static void VerifyTopsPage() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/VerifyShoppinCart/TopsPage/cate_Tshirt'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/TopsPage/cate_Tshirt'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/TopsPage/cate_Blouse'), GlobalVariable.waitPresentTimeout)
	}

	@Keyword
	def static void VerifyProductPage() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/nameProduct'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/nameProduct'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/ProductIamge'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/ProductPrice'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/ProductQuantity'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/ProductSize'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/ProductColor'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/AddToCart'), GlobalVariable.waitPresentTimeout)
	}

	@Keyword
	def static void VerifyCartPage() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/TotalProduct'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/TotalProduct'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/TotalShipping'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/Total'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/CountinueShopping'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ProductPage/Proceed'), GlobalVariable.waitPresentTimeout)
	}

	@Keyword
	def static void VerifyCartSummaryPage() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ShoppingCartSummaryPage/Product'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ShoppingCartSummaryPage/Product'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ShoppingCartSummaryPage/Description'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ShoppingCartSummaryPage/Price'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ShoppingCartSummaryPage/Qty'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ShoppingCartSummaryPage/Avail'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ShoppingCartSummaryPage/Total'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyShoppinCart/ShoppingCartSummaryPage/button_Process'), GlobalVariable.waitPresentTimeout)
	}
}
