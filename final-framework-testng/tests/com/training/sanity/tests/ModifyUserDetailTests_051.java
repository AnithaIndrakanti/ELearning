package com.training.sanity.tests;

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
import com.training.pom.LoginPOM;
import com.training.pom.ModifyUserDetails_051;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ModifyUserDetailTests_051 {
	private WebDriver driver;	
	private String baseUrl;
	private LoginPOM loginPOM;
	private ModifyUserDetails_051 modifyDetails;
	private static Properties properties;
	private ScreenShot screenShot;
	
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		modifyDetails = new ModifyUserDetails_051(driver);
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
		Thread.sleep(1000);
		screenShot.captureScreenShot("ELTC024_HomePage");
	}
		
	@Test(priority = 2)
	    public void editUserDetailTest() throws Exception {
		modifyDetails.clickAdminLink();
		modifyDetails.clickUserListLink();
		modifyDetails.sendSearchtext("sunil");
		System.out.println("Sunil entered");
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC051_BeforeUserUpdated");
		modifyDetails.clickSearchBtn();
		System.out.println("Search button clicked");
		Thread.sleep(500);
		modifyDetails.clickEditBtn();
		System.out.println("Edit Sunil button clicked");
		Thread.sleep(500);
		modifyDetails.clearEmail("sunil@gmail.com");
		System.out.println("mail entered");
		Thread.sleep(500);
		modifyDetails.clickInactiveAccBtn();
		System.out.println("Radio button clicked");
		Thread.sleep(500);
		modifyDetails.clickSaveBtn();
		System.out.println("Updates Saved for Sunil");
		Thread.sleep(2000);
		screenShot.captureScreenShot("ELTC051_AfterUserUpdated");
	}
	
	@Test(priority = 3)
	public void assertResult51() {
	String Expected = "User updated";
	String Actual = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
	Assert.assertTrue(Actual.contains(Expected));
	System.out.println("Actual is " +Actual+ "Expected is  "+Expected);
	}
	
}
