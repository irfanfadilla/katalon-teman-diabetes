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

Mobile.startExistingApplication('com.temandiabetes.android', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Dashboard/rekamanButton'), 0)

Mobile.tap(findTestObject('RekamanPage/DateChangeButton'), 0)

Mobile.tap(findTestObject('RekamanPage/newRekamanGulaDarahButton'), 0)

Mobile.tap(findTestObject('RekamanPage/ManualInputButton'), 0)

Mobile.tap(findTestObject('GulaDarahManualPage/JenisGulaDarahDropdown'), 0)

Mobile.tap(findTestObject('GulaDarahManualPage/android.widget.CheckedTextView - 1-2 Jam Setelah Makan Siang'), 0)

Mobile.tap(findTestObject('GulaDarahManualPage/TimeInputDropdown'), 0)

Mobile.tap(findTestObject('Dashboard/DateConfirmation'), 0)

Mobile.sendKeys(findTestObject('GulaDarahManualPage/GulaDarahJumlahInput'), '123')

Mobile.sendKeys(findTestObject('GulaDarahManualPage/SarapanSebelumnya'), 'Nasi')

Mobile.tap(findTestObject('RekamanPage/DoneConfirmation'), 0)

Mobile.verifyElementText(findTestObject('GulaDarahManualPage/JumlahGulaDarahPopup'), '123 mg/dl')

Mobile.verifyElementText(findTestObject('GulaDarahManualPage/SarapanPopup'), 'Nasi')

Mobile.verifyElementText(findTestObject('GulaDarahManualPage/WaktuPopup'), '1-2 Jam Setelah Makan Siang')

Mobile.tap(findTestObject('GulaDarahManualPage/ConfirmationPopup'), 0)

Mobile.verifyElementText(findTestObject('GulaDarahManualPage/SucessConfrimationPopup'), 'BERHASIL')

Mobile.closeApplication()

