package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.ELTD85POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTD85Test {
  
	private WebDriver driver;
	private String baseUrl;
	private ELTD85POM eLTD85POM;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		eLTD85POM = new ELTD85POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test(priority = 1, dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void addUserELTD85Test(String userName, String password,String firstName, String lastName, String email, String phone, String userName1,
			String password1) throws InterruptedException {
		//Steps for Login
		eLTD85POM.sendUserName(userName);
		eLTD85POM.sendPassword(password);
		eLTD85POM.clickLoginBtn();
		screenShot.captureScreenShot("userName");
		
		//Steps for ADD USER
		eLTD85POM.clickAdminLink();
		Thread.sleep(500);
		System.out.println("Administration link clicked");
		eLTD85POM.clickAddUserLink();
		Thread.sleep(500);
		System.out.println("Add User link clicked");
		String firstname10 = eLTD85POM.sendFirstName("manzoor10");
		Thread.sleep(500);
		System.out.println("Firstname entered");
		String lastname10 = eLTD85POM.sendLastName("mehadi10");
		Thread.sleep(500);
		System.out.println("Lastname entered");
		String email10 = eLTD85POM.sendEmail("manzoor10@gmail.com");
		Thread.sleep(500);
		System.out.println("Email entered");
		String phone10= eLTD85POM.sendPhone("9876543210");
		Thread.sleep(500);
		System.out.println("Phone number entered");
		String username11 = eLTD85POM.sendUserName1("manzoor10");
		Thread.sleep(500);
		System.out.println("login name entered");
		eLTD85POM.clickPasswordRadio();
		Thread.sleep(500);
		System.out.println("Radio button selected");
		String password11 = eLTD85POM.sendPassword1("password10");
		Thread.sleep(500);
		System.out.println("password entered");
        eLTD85POM.selectProfile1();
		Thread.sleep(500);
		System.out.println("caret clicked");
		eLTD85POM.selectProfile2();
		Thread.sleep(3000);
		System.out.println("Profile selected");
		screenShot.captureScreenShot("Profile Selected Tc85");
		eLTD85POM.clickSubmit();
		Thread.sleep(1000);
		System.out.println("Submit button clicked");
		

		System.out.println("Database username = ");
		System.out.println("Database login password = ");
		System.out.println("Database firstname = " + firstName);	
		System.out.println("Database lastname = "+lastName);
		System.out.println("Database email ="+email);
		System.out.println("Database phone = "+phone);
		System.out.println("Database username1 = "+userName1);
		System.out.println("Database password ="+password1);
		
		System.out.println("Application username = "+userName);
		System.out.println("Application login password = "+password);
		System.out.println("Application firstname = "+firstname10);
		System.out.println("Application lastname= "+lastname10);
		System.out.println("Application email ="+email10);
		System.out.println("Application phone = "+phone10);
		System.out.println("Application username1 = "+username11);
		System.out.println("Application password1 = "+password11);
		
		
		
		}
		
	}

