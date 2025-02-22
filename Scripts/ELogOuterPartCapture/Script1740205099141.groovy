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

//WebUI.openBrowser('http://elogmanager.westindia.cloudapp.azure.com/')
//
//WebUI.maximizeWindow()

WebUI.setText(findTestObject('ELogOuterPartObjects/Page_Login Page/input_Welcome_UserData.UserID'), username)

WebUI.setText(findTestObject('ELogOuterPartObjects/Page_Login Page/input_Welcome_UserData.Password'), password)

WebUI.click(findTestObject('ELogOuterPartObjects/Page_Login Page/button_SIGN IN'))

WebUI.click(findTestObject('ELogOuterPartObjects/Page_Home/img'))

WebUI.click(findTestObject('ELogOuterPartObjects/Page_Raw Material/span_Quality Control'))

WebUI.click(findTestObject('ELogOuterPartObjects/Page_Raw Material/span_Human Resources'))

WebUI.click(findTestObject('ELogOuterPartObjects/Page_Raw Material/span_Training Need Identification Record'))

WebUI.click(findTestObject('ELogOuterPartObjects/Page_Training Need Identification Record/input_Search_form-control form-control-sm'))

WebUI.sendKeys(findTestObject(null), 'Magesh')

WebUI.click(findTestObject('ELogOuterPartObjects/Page_Training Need Identification Record/span_Umar'))

WebUI.click(findTestObject('ELogOuterPartObjects/Page_Training Need Identification Record/a_Log Out'))

//WebUI.closeBrowser()

