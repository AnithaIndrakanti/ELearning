package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;

import com.training.pom.ELTD82POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTD82Test {

	private WebDriver driver;
	private String baseUrl;
	// private StudentLoginELTC_002 StudentLoginELTC_002;
	private ELTD82POM eLTD82POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	// The Chrome browser should open up
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		eLTD82POM = new ELTD82POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		driver.get(baseUrl);
	}

	@AfterClass
	// Chrome driver closes
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test(priority = 1, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginELTD82Test(String userName, String password, String clickTestName, String AddFrame1,
			String passPercent, String question, String AddFramei1, String AddFrameii2, String AddFrameii3, String AddFrameii4, String clickMulChoice2ndQues, String AddFrame1_2ndQuestion1Text, String AddFrame2_2ndQuestion2Text, String AddFrame3_2ndQuestion3Text, String AddFrame4_2ndQuestion4Text) throws InterruptedException {

		// Give username
		eLTD82POM.sendUserName(userName);
		Thread.sleep(1000);
		// Give Password
		eLTD82POM.sendPassword(password);
		Thread.sleep(1000);
		// Click on Login Button
		eLTD82POM.clickLoginBtn();

		// Click on Click Course link
		eLTD82POM.clickCourse();
		Thread.sleep(1000);
		// Click Tests icon
		eLTD82POM.clickTests();
		Thread.sleep(1000);
		// Click button Create new test
		driver.navigate().refresh();
		eLTD82POM.clickCreateaNewTest();
		Thread.sleep(1000);
		// Write something in Test Name
		eLTD82POM.sendTestName(clickTestName);
		Thread.sleep(1000);
		// Click on AdvSettng button
		eLTD82POM.clickAdvSetting();
		Thread.sleep(1000);
		// Click on Frame
		eLTD82POM.Frame();
		Thread.sleep(1000);
		// Write something in Name Desc text box
		eLTD82POM.sendTestNameDesc(AddFrame1);
		Thread.sleep(1000);
		// Click on the frame
		eLTD82POM.Frame2();
		Thread.sleep(1000);
		// Click on Checkbox
		eLTD82POM.clickCheckBox();
		Thread.sleep(1000);
		// Click on date Image
		eLTD82POM.clickDateImage();
		Thread.sleep(1000);
		// Click on Now button
		eLTD82POM.clickNow();
		Thread.sleep(1000);
		// Click on Done button
		eLTD82POM.clickDone();
		Thread.sleep(1000);
		// Give values in Pass %
		eLTD82POM.clickPassPercent(passPercent);
		Thread.sleep(1000);
		// Click on Button Submit Exercise
		eLTD82POM.btnsubmitExercise();
		Thread.sleep(1000);
		// Click on Click Assert
		eLTD82POM.assertResult82_1();
		// Capture screenshot
		screenShot.captureScreenShot("ELTC_082_Exercise Added");
		eLTD82POM.assertResult82_2();
		screenShot.captureScreenShot("ELTC_083_Question");

		// Method to set the question
		// Click on Multiple choice.
		eLTD82POM.clickMultipleChoice();
		// Write something on Questions
		eLTD82POM.sendQuestionText(question);
		Thread.sleep(1000);
		// click on frame.
		eLTD82POM.Framei();
		Thread.sleep(1000);
		// Write textin frame
		eLTD82POM.send1text(AddFramei1);
		Thread.sleep(1000);
		// come out of frmae
		eLTD82POM.Frame1out();
		Thread.sleep(1000);
		// Click on frame2
		eLTD82POM.Framei2();
		Thread.sleep(1000);
		// Write text java in frame2
		eLTD82POM.send2text(AddFrameii2);
		Thread.sleep(1000);
		// come out of frame2
		eLTD82POM.Frame2out();
		Thread.sleep(1000);
		// Click on frame3
		eLTD82POM.Framei3();
		Thread.sleep(1000);
		// Send text C in frame3
		eLTD82POM.send3text(AddFrameii3);
		Thread.sleep(1000);
		// come out of frame3
		eLTD82POM.Frame3out();
		Thread.sleep(1000);
		// Click on frame4
		eLTD82POM.Framei4();
		Thread.sleep(1000);
		// Send text C# in frame4
		eLTD82POM.send4text(AddFrameii4);
		Thread.sleep(1000);
		// come out of frame4
		eLTD82POM.Frame4out();
		Thread.sleep(1000);
		// Clcik on Sub Question button
		eLTD82POM.btnsubQuestion();
		Thread.sleep(1000);
		// check for assert
		eLTD82POM.assertResult82_3();
		// Capture screenshot
		screenShot.captureScreenShot("ELTC_082_3 Questions");

		//MULTIPLE CHOISE 2nd TIME 
		// Click on Multiple choice
		eLTD82POM.MultipleChoice1();
				Thread.sleep(1000);
				//Write something in Multiple choice Question
				eLTD82POM.clickMulChoiceQues2(clickMulChoice2ndQues);
				Thread.sleep(1000);
				//Click on the frame1
				eLTD82POM.Frame1_2ndQuestion1();
				Thread.sleep(1000);
				//Write something in frame
				eLTD82POM.send1Text2ndQuestion(AddFrame1_2ndQuestion1Text);
				Thread.sleep(1000);
				//Come out of frame
				eLTD82POM.Frame2out2ndQuestion();
				Thread.sleep(1000);
				//Click on the frame2
				eLTD82POM.Frame2_2ndQuestion2();
				Thread.sleep(1000);
				//Write something in frame
				eLTD82POM.send2Text2ndQuestion(AddFrame2_2ndQuestion2Text);
				Thread.sleep(1000);
				//Come out of the frame
				eLTD82POM.Frame2out2ndQuestion();
				Thread.sleep(1000);
				//Click on frmae3
				eLTD82POM.Frame3_2ndQuestion3();
				Thread.sleep(1000);
				//Write something in frame
				eLTD82POM.send3Text2ndQuestion(AddFrame3_2ndQuestion3Text);
				Thread.sleep(1000);
				//Come out of frame
				eLTD82POM.Frame3out2ndQuestion();
				Thread.sleep(1000);
				//Write something in frame
				eLTD82POM.Frame4_2ndQuestion4();
				Thread.sleep(1000);
				//Write something in frame
				eLTD82POM.send4Text2ndQuestion(AddFrame4_2ndQuestion4Text);
				Thread.sleep(1000);
				//Come out of frame		
				eLTD82POM.Frame4out2ndQuestion();
				Thread.sleep(1000);
				//Click on Radio button
				eLTD82POM.clickRadioButton();
				Thread.sleep(1000);
				eLTD82POM.clickSub_Ques1();
				Thread.sleep(1000);
				//Check assertions
				eLTD82POM.assertResult82_4();
				Thread.sleep(1000);
		        //Check for the screenshots
				screenShot.captureScreenShot("ELTC_032_2 Questions");
		        //Click on the Preview Icon
				eLTD82POM.clickPreviewIcon();
				Thread.sleep(1000);
				//Click on Start test
				eLTD82POM.clickStartTest();
				Thread.sleep(1000);
				//Click on Selenium radio button
				eLTD82POM.clickSelenium();
				Thread.sleep(1000);
				//Click on next question radio button
				eLTD82POM.clicknextQuesbutton();
				Thread.sleep(1000);
				//Click on Java radio button
				eLTD82POM.clickJava();
				Thread.sleep(1000);
				//Click on End test button
				eLTD82POM.clickEndTest();
				Thread.sleep(1000);
				eLTD82POM.assertResult82_5();
		        //Capture screenshot.
				screenShot.captureScreenShot("ELTC_032_Score for test");
				
	}
}
