package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddUser2Course_023;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddUser2CourseTests_023 {
  
	private WebDriver driver;	
	private String baseUrl;
	private LoginPOM loginPOM;
    private AddUser2Course_023 addCourse;
	private static Properties properties;
	private ScreenShot screenShot;
	
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		addCourse = new AddUser2Course_023(driver);
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
	public void validLoginTest() throws Exception {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@1234");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(1000);
		screenShot.captureScreenShot("ELTC023_Homepage");
	}
		
	@Test(priority = 2)
	public void addUser2CourseTest()throws Exception{
		addCourse.clickAdminLink();
		addCourse.clickAddUsers2CourseLink();
		addCourse.selectUserListValue();
		System.out.println("Selected User list value");
		addCourse.selectCourseListValue();
		System.out.println("Selected course List value");
		addCourse.clickadd2CourseBtn();
		System.out.println("Clicked on add button");
		Thread.sleep(2000);
		screenShot.captureScreenShot("ELTC023_AddedUser2Course");
	}
	@Test(priority = 3)
	public void assertResult23() {
	String Expected = "The selected users are subscribed to the selected course";
	String Actual = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	Assert.assertEquals(Actual,Expected);
	System.out.println("Actual is: " +Actual+ " Expected is: "+Expected);
	}
	
}
