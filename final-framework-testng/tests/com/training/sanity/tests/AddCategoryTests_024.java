package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddCategory_024;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddCategoryTests_024 {
  
	private WebDriver driver;	
	private String baseUrl;
	private LoginPOM loginPOM;
	private AddCategory_024 addCategory;
	//private static Properties properties;
	private ScreenShot screenShot;
	
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		addCategory = new AddCategory_024(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}

	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	//Method to login to elearning portal
	@Test(priority = 1)
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		Thread.sleep(1000);
		loginPOM.sendPassword("admin@1234");
		Thread.sleep(1000);
		loginPOM.clickLoginBtn(); 
		Thread.sleep(1000);
		screenShot.captureScreenShot("ELTC024_HomePage");
	}
		
	//Method to add Category
	@Test(priority = 2)
	    public void addCategoryTest() throws Exception {
		addCategory.clickAdminLink();
		addCategory.clickCoursesCategoriesLink();
		addCategory.clickAddCategoryButton();
		System.out.println("Add Category page opened");
		screenShot.captureScreenShot("ELTC024_BeforeAddCategory");
		addCategory.sendCategoryCode("JL");
		addCategory.sendCategoryName("Java Learning");
		addCategory.clickRadioBtn();
		addCategory.clickSubmitBtn();
		System.out.println("Category Added");
		Thread.sleep(2000);
		screenShot.captureScreenShot("ELTC024_AfterAddCategory");
		addCategory.assertResult24_1();
	}
	
}
