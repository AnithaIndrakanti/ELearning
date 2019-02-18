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
import com.training.pom.CreateCourse_022;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CreateCourseTests_022 {
	
	private WebDriver driver;	
	private String baseUrl;
	private LoginPOM loginPOM;
	private CreateCourse_022 createCourse;
	private static Properties properties;
	private ScreenShot screenShot;
	
	
	@BeforeClass
	//public void executeIgnoringExceptions.setUpBeforeClass() {
	public void setUpBeforeClass() throws IOException, TimeoutException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		createCourse = new CreateCourse_022(driver);
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
		screenShot.captureScreenShot("ELTC022_Homepage");
	}
		
	@Test(priority = 2)
	public void createCourseTest()throws Exception{
		createCourse.clickAdminLink();
		createCourse.clickCreateCourseLink();
		createCourse.enterTitle("HeyhiCourse");
		createCourse.enterCode("heyic");
		createCourse.teacherBox1();
		createCourse.teacherBox2();
		System.out.println("Clicked on Teacher Listbox");
		createCourse.clickCategoryListbox1();
		createCourse.clickCategoryListbox2();
		System.out.println("Clicked on Category Listbox");
		//createCourse.CourseLang("English");
		createCourse.selectCourseLanguage1();
		createCourse.selectCourseLanguage2();
		System.out.println("Selected Course Language");
		createCourse.clickCreateButton();
		System.out.println("Course created");
		Thread.sleep(2000);
		screenShot.captureScreenShot("ELTC022_CourseCreated");
	}
	@Test(priority=3)
	public void assertResult22() {
	String Expected = "HeyCourse";
	String Actual = driver.findElement(By.xpath("//div[@class='alert alert-success']//a[contains(text(),'HeyhiCourse')]")).getText();
   	Assert.assertEquals(Actual,Expected);
	System.out.println(Actual);
	}
}
