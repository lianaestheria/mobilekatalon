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

Mobile.startApplication('/Users/lianae/Downloads/ECommerceSAMPLEAndroid-201016-115534.apk', true)

Mobile.tap(findTestObject('Object Repository/testing verify/android.widget.ImageView (1)'), 0)

WebUI.delay(2)

String stock = Mobile.getAttribute(findTestObject('Object Repository/testing verify/android.widget.TextView - 5 item(s) (1)'), 'text', 5)

int int_stock = Integer.parseInt(stock.substring(0,1))

Mobile.tap(findTestObject('Object Repository/testing verify/android.widget.Button - ADD TO CART (1)'), 0)

Mobile.setText(findTestObject('Object Repository/testing verify/android.widget.EditText (1)'), '1', 0)

Mobile.tap(findTestObject('Object Repository/testing verify/android.widget.Button - ADD (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testing verify/android.widget.TextView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testing verify/android.widget.Button - CHECKOUT (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testing verify/android.widget.Button - PROCESS CHECKOUT (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testing verify/android.widget.Button - YES (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testing verify/android.widget.Button - OK (1)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('testing verify/android.widget.ImageView (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/testing verify/android.widget.TextView - 5 item(s) (1)'), int_stock-1+' item(s)')

Mobile.closeApplication()

