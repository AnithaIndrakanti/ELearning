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
	//Steps to login to the elearning site with admin creds
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
		
	//Method to add career
	//Covered TC steps 1-6
	@Test(priority = 2)
	public void createCareerTest() throws Exception {
		createCareerPromotion.clickAdminLink();
		createCareerPromotion.clickCareerPromotionLink();
		createCareerPromotion.clickCareersLink();
		createCareerPromotion.clickAddIcon1();
		createCareerPromotion.sendName1("Career TC55_60");
		System.out.println("Career name entered");
		Thread.sleep(500);
		createCareerPromotion.clickAddBtn1();
		System.out.println("Add btn1 clkd");
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC055_CareerAdded");
		createCareerPromotion.assertResult55_1();
		createCareerPromotion.assertResult55_2();
	}
	
	//Method to add Promotion
	//Covered Tc steps 7-11
	@Test(priority = 3)
    public void createPromotionTest() throws Exception {
		Thread.sleep(2000);
		createCareerPromotion.clickCareerPromotionLink();
		createCareerPromotion.clickPromotionsLink();
		createCareerPromotion.clickAddIcon2();
		createCareerPromotion.sendName2("Promotion TC55_60");
		System.out.println("Promotion name entered");
		Thread.sleep(500);
		createCareerPromotion.clickAddBtn2();
		System.out.println("Add btn2 clckd");
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC055_PromotionAdded");
		createCareerPromotion.assertResult55_3();
		createCareerPromotion.assertResult55_4();
	}
	
	//Method to subscribe sessions to Promotion
	//Covered Tc steps 12-15
	@Test(priority = 4)
    public void subscribeSessionsTest() throws Exception {
		createCareerPromotion.subUsersToClass1();
		System.out.println("Subscribe Icon clicked");
		Thread.sleep(500);
		createCareerPromotion.selectSession();
		System.out.println("session selected");
		Thread.sleep(100);
		createCareerPromotion.clickArrow();
		System.out.println("Arrow clicked");
		Thread.sleep(500);
		createCareerPromotion.clickSubscribeSessionBtn();
		System.out.println("BUtton");
		Thread.sleep(500);
		screenShot.captureScreenShot("ELTC055_Step15");
	}
	
	}
