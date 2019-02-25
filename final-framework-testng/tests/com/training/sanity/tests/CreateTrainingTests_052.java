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
import com.training.pom.CreateTraining_052;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CreateTrainingTests_052 {
  
	private WebDriver driver;	
	private String baseUrl;
	private LoginPOM loginPOM;
	private CreateTraining_052 createTraining;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		createTraining = new CreateTraining_052(driver);
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
		screenShot.captureScreenShot("ELTC055_HomePage");
	}
		
	@Test(priority = 2)
	    public void addCategoryTest() throws Exception {
		createTraining.clickAdminLink();
		createTraining.clickSessionCategoriesListLink();
		createTraining.clickAddCategoryIcon();
		Thread.sleep(1000);
		createTraining.sendCategoryName("TC52_Category1");
		System.out.println("CategoryName entered");
		createTraining.clickAddcategoryBtn();
		System.out.println("Add category btn clicked");
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC052_CategoryAdded");
		String Expected1 = "The category has been added";
		String Actual1 = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		Assert.assertEquals(Actual1,Expected1);
		System.out.println("Actual is: " +Actual1);
		System.out.println("Expected is: "+Expected1);
	}
	
	@Test(priority = 3)
    public void addTrainingPart1Test() throws Exception {
		createTraining.clickSessionListLink();
		System.out.println("Session List Link clickd");
		createTraining.clickAddTraining();
		System.out.println("");
		createTraining.sendSessionName("TC52_Session1");
		System.out.println("session name entered");
		createTraining.clickAdvancedSettingsBtn();
		System.out.println("advncd settngs clicked");
		Thread.sleep(1000);
		createTraining.clickListBoxCaret();
		System.out.println("listbox caret clicked");
		createTraining.selectListBoxValue();
		System.out.println("box value selected");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		createTraining.clickNexStepBtn1();
		System.out.println("next step button clicked");
		Thread.sleep(500);
		
	}
	
	@Test(priority = 4)
    public void addTrainingPart2Test() throws Exception {
		createTraining.clickselectCourse();
		System.out.println("course selected");
		createTraining.clickAddCourseArrow();
		System.out.println("arrow clicked");
		createTraining.clickNextStepBtn2();
		System.out.println("next step btn2 clicked");
		createTraining.sendStudentName("DEEPAREDDY");
		System.out.println("student name entered");
		createTraining.clickStudentNameLink();
		System.out.println("Student name link clicked");
		createTraining.clickFinishSessionCreationBtn();
		System.out.println("finsh button clicked");
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC052_Last Step");
		String Expected1 = "Item added";
		String Actual1 = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(Actual1,Expected1);
		System.out.println("Actual is: " +Actual1+ " Expected is: "+Expected1);
	}
	
}
