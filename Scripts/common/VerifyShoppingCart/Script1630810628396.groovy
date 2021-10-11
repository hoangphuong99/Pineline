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

CustomKeywords.'verifyShoppingCart.VerifyShopping.SignIn'()

CustomKeywords.'verifyShoppingCart.VerifyShopping.SignInSucess'(GlobalVariable.mail, GlobalVariable.Pass)

CustomKeywords.'verifyShoppingCart.VerifyShopping.VerifyHomePage'()

WebUI.click(findTestObject('VerifyShoppinCart/HomePage/menu_Women'))

CustomKeywords.'verifyShoppingCart.VerifyShopping.VerifyWomenPage'()

WebUI.click(findTestObject('VerifyShoppinCart/WomenPage/cate_Tops'))

CustomKeywords.'verifyShoppingCart.VerifyShopping.VerifyTopsPage'()

WebUI.click(findTestObject('VerifyShoppinCart/TopsPage/item_Product'))

CustomKeywords.'verifyShoppingCart.VerifyShopping.VerifyProductPage'()

WebUI.click(findTestObject('VerifyShoppinCart/ProductPage/AddToCart'))

CustomKeywords.'verifyShoppingCart.VerifyShopping.VerifyCartPage'()

WebUI.click(findTestObject('VerifyShoppinCart/ProductPage/Proceed'))

CustomKeywords.'verifyShoppingCart.VerifyShopping.VerifyCartSummaryPage'()

WebUI.click(findTestObject('VerifyShoppinCart/button_SignOut'))

WebUI.verifyTextPresent('Your shopping cart is empty.', false)

WebUI.closeBrowser()

