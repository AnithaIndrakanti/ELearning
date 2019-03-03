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
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.ELTD81to85_POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTD81Test {

	private WebDriver driver;
	private String baseUrl;
	private ELTD81to85_POM eLTDPOM;
	// private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	// private GenericMethods genericMethods;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		eLTDPOM = new ELTD81to85_POM(driver);
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
			String password1) throws InterruptedException {
		//Steps for Login
		eLTDPOM.sendUserName(userName);
		eLTDPOM.sendPassword(password);
		eLTDPOM.clickLoginBtn();
		screenShot.captureScreenShot("userName");
		
		//Steps for ADD USER
		eLTDPOM.clickAdminLink();
		Thread.sleep(500);
		System.out.println("Administration link clicked");
		eLTDPOM.clickAddUserLink();
		Thread.sleep(500);
		System.out.println("Add User link clicked");
		eLTDPOM.sendFirstName(firstName);
		Thread.sleep(500);
		System.out.println("Firstname entered");
		eLTDPOM.sendLastName(lastName);
		Thread.sleep(500);
		System.out.println("Lastname entered");
		eLTDPOM.sendEmail(email);
		Thread.sleep(500);
		System.out.println("Email entered");
		eLTDPOM.sendPhone(phone);
		Thread.sleep(500);
		System.out.println("Phone number entered");
		eLTDPOM.sendUserName1(userName1);
		Thread.sleep(500);
		System.out.println("login name entered");
		eLTDPOM.clickPasswordRadio();
		Thread.sleep(500);
		System.out.println("Radio button selected");
		eLTDPOM.sendPassword1(password1);
		Thread.sleep(500);
		System.out.println("password entered");
		eLTDPOM.selectProfile1();
		eLTDPOM.selectProfile2();
		Thread.sleep(500);
		System.out.println("Profile selected");
		eLTDPOM.clickSubmit();
		Thread.sleep(500);
		System.out.println("Submit button clicked");
		
		//Steps for Add Users To Course
		eLTDPOM.clickAdminLink();
		Thread.sleep(500);
		System.out.println("Administration link clicked");
		eLTDPOM.clickAddUsers2CourseLink();
		eLTDPOM.selectUserListValue();
		eLTDPOM.selectCourseListValue();
		eLTDPOM.clickadd2CourseBtn();
	}

}
