package lazada
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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.eclipse.persistence.jpa.jpql.Assert.AssertException
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


class Lazada {
	@Keyword
	def static void VerifyHomePage() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Lazada/HomePage/menuBar'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/HomePage/menuBar'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/HomePage/menuleft'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/HomePage/input_Search'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/HomePage/button_Search'), GlobalVariable.waitPresentTimeout)
	}

	@Keyword
	def static void VerifyResultPage() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Lazada/ResultPage/menu_Categories'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/ResultPage/menu_Categories'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/ResultPage/menu_Band'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/ResultPage/menu_Service'), GlobalVariable.waitPresentTimeout)
	}

	@Keyword
	def static void VerifyProductPage() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Lazada/Product/titile_ProductBand'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/Product/titile_ProductBand'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Lazada/Product/price_ProductBand'), GlobalVariable.waitPresentTimeout)
		WebUI.verifyTextPresent('First News - Trí Việt', false)
	}
	@Keyword
	def static void VerifyLazMallPage() {

		List listProduct= WebUI.findWebElements(findTestObject('Object Repository/Lazada/ResultPage/list_Product'), 30)
		println(listProduct.size())

		List listLazMall= WebUI.findWebElements(findTestObject('Object Repository/Lazada/ResultPage/list_LazMall'), 30)
		println(listLazMall.size())

		WebUI.verifyEqual(listProduct.size(),listLazMall.size())
	}
}