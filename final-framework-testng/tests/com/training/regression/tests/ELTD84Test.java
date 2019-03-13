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
import com.training.pom.ELTD84POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTD84Test {
	
	private WebDriver driver;
	private String baseUrl;
	private ELTD83POM eLTD83POM;
	private ELTD84POM eLTD84POM;
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
		eLTD84POM = new ELTD84POM(driver);
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
			String password1, String CourseName, int index, String code, String lang, String displayText, String titleText1, String contextText1, 
			String titleText2, String contextText2, String titleText3, String contextText3) throws InterruptedException {
		//Steps for Login
		eLTD83POM.sendUserName(userName);
		eLTD83POM.sendPassword(password);
		eLTD83POM.clickLoginBtn();
		screenShot.captureScreenShot("userName");
		
		//Steps for create course n more
		eLTD84POM.clickCreateCourse();
		eLTD84POM.sendCourseTitle(CourseName);
		eLTD84POM.clickAdvancedSettings();
		eLTD84POM.category(index);
		eLTD84POM.CourseCode(code);
		eLTD84POM.CourseLang(lang);
		eLTD84POM.addCourseClick();
		eLTD84POM.courseIntro();
		eLTD84POM.assertTC84CourseSaved();
		eLTD84POM.editClick();
		eLTD84POM.saveText();
		eLTD84POM.senddisplayText(displayText);
		eLTD84POM.clickCourseDesc();
		eLTD84POM.clickDesc();
		eLTD84POM.entertitletext(titleText1);
		eLTD84POM.entercontexttext(contextText1);
		eLTD84POM.saveButton();
		eLTD84POM.clickObj();
		eLTD84POM.entertitletext2(titleText2);
		eLTD84POM.entercontexttext2(contextText2);
		eLTD84POM.saveButton2();
		eLTD84POM.clicTopic();
		eLTD84POM.entertitletext3(titleText3);
		eLTD84POM.entercontexttext3(contextText3);
		eLTD84POM.saveButton3();
		
}

}