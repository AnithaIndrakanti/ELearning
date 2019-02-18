package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
//import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.DeleteCourse_021;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class DeleteCourseTest_021 {
	
	private WebDriver driver;	
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private DeleteCourse_021 deleteCourse;
	private ScreenShot screenShot;
	
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException, TimeoutException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		deleteCourse = new DeleteCourse_021(driver); 
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
	public void validLoginTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("ELTC021_HomePage");
	}
	@Test(priority = 2)
	public void validDeleteCourseTest() throws InterruptedException {
		System.out.println("DeleteCourse Method is being called");
		deleteCourse.clickAdminLink();
		deleteCourse.clickCourseListLink();
		screenShot.captureScreenShot("ELTC021_BeforeDeleteCourse");
		Thread.sleep(1000);
		deleteCourse.deleteCourseButton();
		driver.switchTo().alert().accept();
		System.out.println("popupok clicked");
		Thread.sleep(1000);
		screenShot.captureScreenShot("ELTC021_AfterDeleteCourse");
	}
	
	@Test(priority = 3)
	public boolean IsElementPresent(WebDriver driver, By by) 
    {
        try
        {
            driver.findElement(By.xpath("//a[@href='http://elearning.upskills.in/main/admin/course_list.php?delete_course=0001']//img[@title='Delete']"));
            //If element is found set the timeout back and return true
            return true;
        }
            catch (NoSuchElementException e)
        {
            //If element isn't found, set the timeout and return false
            return false;
        }
     }
}
	
