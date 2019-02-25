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
import com.training.pom.CreateCareerAndPromotion_055;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CreateCareerAndPromotionTests_055 {

	private WebDriver driver;	
	private String baseUrl;
	private LoginPOM loginPOM;
	private CreateCareerAndPromotion_055 createCareerPromotion;
	private static Properties properties;
	private ScreenShot screenShot;
	
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		createCareerPromotion = new CreateCareerAndPromotion_055(driver);
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
	    public void createCareerTest() throws Exception {
		createCareerPromotion.clickAdminLink();
		createCareerPromotion.clickCareerPromotionLink();
		createCareerPromotion.clickCareersLink();
		createCareerPromotion.clickAddIcon1();
		createCareerPromotion.sendName1("Career TC55_3");
		System.out.println("Name 'Career TC55_3' entered");
		Thread.sleep(500);
		createCareerPromotion.clickAddBtn1();
		System.out.println("Add btn1 clkd");
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC055_CareerAdded");
		String Expected1 = "Item added";
		String Actual1 = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(Actual1,Expected1);
		System.out.println("Actual is: " +Actual1+ " Expected is: "+Expected1);
	}
	
	@Test(priority = 3)
    public void createPromotionTest() throws Exception {
		createCareerPromotion.clickCareerPromotionLink();
		createCareerPromotion.clickPromotionsLink();
		createCareerPromotion.clickAddIcon2();
		createCareerPromotion.sendName2("Promotion TC55_3");
		System.out.println("Name 'Promotion TC55_3' entered");
		Thread.sleep(500);
		createCareerPromotion.clickAddBtn2();
		System.out.println("Add btn2 clckd");
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC055_PromotionAdded");
		String Expected2 = "Item added";
		String Actual2 = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(Actual2,Expected2);
		System.out.println("Actual is: " +Actual2+ " Expected is: "+Expected2);
	}
	
	@Test(priority = 4)
    public void subscribeSessionsTest() throws Exception {
		createCareerPromotion.clicksubscribeIcon();
		System.out.println("Subscribe Icon clicked");
		Thread.sleep(500);
		createCareerPromotion.clickArrow();
		System.out.println("Arrow clicked");
		Thread.sleep(500);
		createCareerPromotion.clickSubscribeSessionBtn();
		System.out.println("BUtton");
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC055_Step15");
	}
	
	}
