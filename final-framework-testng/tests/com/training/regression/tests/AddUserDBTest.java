package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dataproviders.AddUserDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.ELTD85POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddUserDBTest {
	private WebDriver driver;
	private String baseUrl;
	private ELTD85POM eLTD85POM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods;

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
		genericMethods = new GenericMethods(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	/*I am using this method to pass values into required fields
	 * Have used "return" in my POM file and am getting the attribute value here
	 *by giving "String attribute = "
	 *Example String appUsername = eLTD85POM.sendUserName("admin"); 
	 */
	@Test(dataProvider = "db-inputs", dataProviderClass = AddUserDataProviders.class)
	public void addUserDBTest(String userName, String password, String firstName, String lastName, String email,
			String phone, String userName1, String password1) throws InterruptedException {

		String appUsername = eLTD85POM.sendUserName("admin");
		String appPassword = eLTD85POM.sendPassword("admin@1234");
		eLTD85POM.clickLoginBtn();
		screenShot.captureScreenShot(userName);

		// Steps for ADD USER
		eLTD85POM.clickAdminLink();
		Thread.sleep(500);
		System.out.println("Administration link clicked");
		eLTD85POM.clickAddUserLink();
		Thread.sleep(500);
		System.out.println("Add User link clicked");
		String appFirstname = eLTD85POM.sendFirstName("Anitha6");
		Thread.sleep(500);
		System.out.println("Firstname entered");
		String appLastname = eLTD85POM.sendLastName("Siddhartha6");
		Thread.sleep(500);
		System.out.println("Lastname entered");
		String appEmail = eLTD85POM.sendEmail("selenium986@gmail.com");
		Thread.sleep(500);
		System.out.println("Email entered");
		String appPhone = eLTD85POM.sendPhone("9876543210");
		Thread.sleep(500);
		System.out.println("Phone number entered");
		String appUsername1 = eLTD85POM.sendUserName1("DBinput6");
		Thread.sleep(500);
		System.out.println("login name entered");
		eLTD85POM.clickPasswordRadio();
		Thread.sleep(500);
		System.out.println("Radio button selected");
		String appPassword1 = eLTD85POM.sendPassword1("password6");
		Thread.sleep(500);
		System.out.println("password entered");
		eLTD85POM.selectProfile1();
		Thread.sleep(500);
		System.out.println("caret clicked");
		eLTD85POM.selectProfile2();
		Thread.sleep(2000);
		System.out.println("Profile selected");
		screenShot.captureScreenShot("Profile Selected TC85");
		Thread.sleep(1000);
		eLTD85POM.clickSubmit();
		Thread.sleep(1000);
		System.out.println("Submit button clicked");

		System.out.println(" Database userName=" + userName);
		System.out.println(" Database password=" + password);
		System.out.println(" Database firstName=" + firstName);
		System.out.println(" Database lastName = " + lastName);
		System.out.println(" Database email= " + email);
		System.out.println(" Database phone = " + phone);
		System.out.println(" Database userName1 = " + userName1);
		System.out.println(" Database password1 = " + password1);
		System.out.println(" Application lastname = " + appLastname);
		System.out.println(" Application username = " + appUsername);
		System.out.println(" Application password = " + appPassword);
		System.out.println(" Application firstname = " + appFirstname);
		System.out.println(" Application email = " + appEmail);
		System.out.println(" Application phone = " + appPhone);
		System.out.println(" Application username1 = " + appUsername1);
		System.out.println(" Application password 1 = " + appPassword1);

		Assert.assertEquals(appUsername, userName);
		Assert.assertEquals(appPassword, password);
		Assert.assertEquals(appFirstname, firstName);
		Assert.assertEquals(appLastname, lastName);
		Assert.assertEquals(appEmail, email);
		Assert.assertEquals(appPhone, phone);
		Assert.assertEquals(appUsername1, userName1);
		Assert.assertEquals(appPassword1, password1);

	}

}