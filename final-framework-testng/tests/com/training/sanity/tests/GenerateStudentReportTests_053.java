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
import com.training.pom.GenerateStudentReport_053;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class GenerateStudentReportTests_053 {
  
	private WebDriver driver;	
	private String baseUrl;
	private LoginPOM loginPOM;
	private GenerateStudentReport_053 generateReport;
	private static Properties properties;
	private ScreenShot screenShot;
	
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		generateReport = new GenerateStudentReport_053(driver);
		baseUrl = properties.getProperty("baseURL");
		
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}

	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
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
		
	@Test(priority = 2)
	    public void editUserDetailTest() throws Exception {
		generateReport.clickReportingTab();
		generateReport.clickFollowStudentsLink();
		generateReport.sendStudentName("Deepa");
		System.out.println("Name Deepa entered");
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
	
	@Test(priority = 3)
    public void completeEditTest() throws Exception {
		Robot robot = new Robot();
		for(int i=0; i<5; i++) {
	      robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	    }
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		System.out.println("PAGE DOWN clicked thrice");
		Thread.sleep(1000);
		generateReport.clickEmailChkBox(); 
		System.out.println("Chkbox clicked");
		Thread.sleep(500); 
		generateReport.clickCorrectTestBtn(); Thread.sleep(500);
		System.out.println("Correct TEST buttn clicked");
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC053_Alert Message_Step9");
		/*
		 * String Expected = "Message sent"; String Actual =
		 * driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		 * Assert.assertTrue(Actual.contains(Expected)); System.out.println("Actual is "
		 * +Actual+ "Expected is  "+Expected);
		 */
		generateReport.clickCourseName(); 
		System.out.println("CourseName clicked");
		Thread.sleep(500);
		Thread.sleep(100); screenShot.captureScreenShot("ELTC053_SS1");
		Thread.sleep(2000);
		screenShot.captureScreenShot("ELTC053_Final step");
	   }
	
	
	@Test(enabled=false) 
	public void assertResult53() { 
	 String Expected = "Message sent"; 
	 String Actual = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
	 Assert.assertTrue(Actual.contains(Expected)); 
	 System.out.println("Actual is " +Actual+ "Expected is  "+Expected);
	 }
	
}

