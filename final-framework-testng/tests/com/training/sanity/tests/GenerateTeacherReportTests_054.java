package com.training.sanity.tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.GenerateTeacherReport_054;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class GenerateTeacherReportTests_054 {
 
	private WebDriver driver;	
	private String baseUrl;
	private LoginPOM loginPOM;
	private GenerateTeacherReport_054 generateReport;
	private static Properties properties;
	private ScreenShot screenShot;
	
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		generateReport = new GenerateTeacherReport_054(driver);
		baseUrl = properties.getProperty("baseURL");
		
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}

	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	//Method to Login to Homepage using Admin credentials
	@Test(priority = 1)
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		Thread.sleep(500);
		loginPOM.sendPassword("admin@1234");
		Thread.sleep(500);
		loginPOM.clickLoginBtn(); 
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC053_HomePage");
	}
	
	//Method to edit user detail 
	//from clicking on Reporting tab in Step1
	//till clicking on quiz icon in Step7
	@Test(priority = 2)
	    public void editUserDetailTest() throws Exception {
		generateReport.clickReportingTab();
		generateReport.clickFollowTeacherLink();
		generateReport.sendTeacherName("manzoor");
		System.out.println("Teacher name entered");
		Thread.sleep(500);
		generateReport.clickSubmitBtn();
		System.out.println("Submit btn clkd");
		Thread.sleep(500);
		generateReport.clickArrow1();
		System.out.println("Arrow1 clicked");
		Thread.sleep(500);
		generateReport.clickArrow2();
		System.out.println("Arrow2 clicked");
		Thread.sleep(500);
		generateReport.clickQuizIcon();
		System.out.println("Quiz icon clicked");
		Thread.sleep(500);
		
	}
	
	//Method to complete the Edit process 
	//From Step 8 till step10
	@Test(priority = 3)
    public void completeEditTest() throws Exception {
		Robot robot = new Robot();
		for(int i=0; i<5; i++) {
	      robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	    }
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		System.out.println("PAGE DOWN clicked 5times");
		Thread.sleep(1000);
		generateReport.clickEmailChkBox(); 
		System.out.println("Chkbox clicked");
		Thread.sleep(500); 
		generateReport.clickCorrectTestBtn(); Thread.sleep(500);
		System.out.println("Correct TEST buttn clicked");
		Thread.sleep(500);
		generateReport.clickCourseName(); System.out.println("TCcomplete");
		System.out.println("CourseName clicked");
		Thread.sleep(500);
		Thread.sleep(100); screenShot.captureScreenShot("ELTC054_SS1");
		Thread.sleep(2000);
		screenShot.captureScreenShot("ELTC054_SS2");
	   }
	
	
	@Test(priority = 4) 
	public void assertResult54() { 
	 String Expected = "Message sent"; 
	 String Actual = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
	 Assert.assertTrue(Actual.contains(Expected)); 
	 System.out.println("Actual is " +Actual+ "Expected is  "+Expected);
	 }
	
	
}
