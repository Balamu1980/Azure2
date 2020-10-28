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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://inside.intra.local.s.oliver.de/login?sso=0')

WebUI.setText(findTestObject('Object Repository/Page_inside/input_Username__username'), 'krbala')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_inside/input_Password__password'), '7jF3wNtD7KSK8w2nDkm+zw==')

WebUI.click(findTestObject('Object Repository/Page_inside/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Balamurugans Dashboard/button_Edit my quick links_btn btn-transparent'))

WebUI.click(findTestObject('Object Repository/Page_Balamurugans Dashboard/button_Show my profile'))

WebUI.verifyElementPresent(findTestObject('Page_Balamurugans Dashboard/h2_Balamurugan K'), 0)

WebUI.click(findTestObject('Object Repository/Page_Balamurugans Dashboard/button_Close'))

WebUI.closeBrowser()

