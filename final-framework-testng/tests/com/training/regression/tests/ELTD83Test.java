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
import com.training.pom.ELTD83POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTD83Test {
  
	private WebDriver driver;
	private String baseUrl;
	private ELTD83POM eLTD83POM;
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
		eLTD83POM = new ELTD83POM(driver);
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

	@Test(priority = 1, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginELTD81Test(String userName, String password,String firstName, String lastName, String email, String phone, String userName1,
			String password1, String profileSelect2) throws InterruptedException {
		//Steps for Login
		eLTD83POM.sendUserName(userName);
		eLTD83POM.sendPassword(password);
		eLTD83POM.clickLoginBtn();
		screenShot.captureScreenShot("userName");
		
		//Steps for ADD USER
		eLTD83POM.clickAdminLink();
		Thread.sleep(500);
		System.out.println("Administration link clicked");
		eLTD83POM.clickAddUserLink();
		Thread.sleep(500);
		System.out.println("Add User link clicked");
		eLTD83POM.sendFirstName(firstName);
		Thread.sleep(500);
		System.out.println("Firstname entered");
		eLTD83POM.sendLastName(lastName);
		Thread.sleep(500);
		System.out.println("Lastname entered");
		eLTD83POM.sendEmail(email);
		Thread.sleep(500);
		System.out.println("Email entered");
		eLTD83POM.sendPhone(phone);
		Thread.sleep(500);
		System.out.println("Phone number entered");
		eLTD83POM.sendUserName1(userName1);
		Thread.sleep(500);
		System.out.println("login name entered");
		eLTD83POM.clickPasswordRadio();
		Thread.sleep(500);
		System.out.println("Radio button selected");
		eLTD83POM.sendPassword1(password1);
		Thread.sleep(500);
		System.out.println("password entered");
//		eLTD83POM.selectProfile1();
		Thread.sleep(500);
		System.out.println("caret clicked");
		eLTD83POM.selectProfile2(profileSelect2);
		Thread.sleep(3000);
		System.out.println("Profile selected");
		screenShot.captureScreenShot("Profile Selected Tc83");
		eLTD83POM.clickSubmit();
		Thread.sleep(1000);
		System.out.println("Submit button clicked");
		
	}
}
