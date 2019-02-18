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
import com.training.pom.CreateCourse_022;
import com.training.pom.DeleteCategory_025;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class DeleteCategoryTests_025 {
  
	private WebDriver driver;	
	private String baseUrl;
	private LoginPOM loginPOM;
	private DeleteCategory_025 deleteCategory;
	//private static Properties properties;
	private ScreenShot screenShot;
	
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		deleteCategory = new DeleteCategory_025(driver);
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
		Thread.sleep(1000);
		loginPOM.sendPassword("admin@1234");
		Thread.sleep(1000);
		loginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		screenShot.captureScreenShot("ELTC025_HomePage");
	}
		
	@Test(priority = 2)
	public void deleteCategoryTest() {
		deleteCategory.clickAdminLink();
		deleteCategory.clickCoursesCategoriesLink();
		screenShot.captureScreenShot("ELTC025_BeforeDeleteCategory");
		deleteCategory.clickDeleteCategoryButton();
		System.out.println("Category Deleted");
		screenShot.captureScreenShot("ELTC025_AfterDeleteCategory");
	}
	
	@Test(priority = 3)
	public boolean isElementPresent(WebDriver driver, By by){
		   try{
		      driver.findElement(By.linkText("Category4Deletion1"));
		      return true;
		      
		   }catch(NoSuchElementException e){
		     return false;
		   }
		 	}
	
}
