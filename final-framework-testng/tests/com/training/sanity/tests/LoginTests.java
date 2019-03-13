package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.DeleteCourse_021;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	//private DeleteCourse_021 deleteCourse;
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
		loginPOM = new LoginPOM(driver); 
		//deleteCourse = new DeleteCourse_021(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@1234");
		int width= driver.findElement(By.xpath("//input[@id='login']")).getSize().getHeight();
		int height = driver.findElement(By.xpath("//input[@id='login']")).getSize().getWidth();
		String value = driver.findElement(By.xpath("//input[@id='login']")).getAttribute("textboxword");
		String valuetext = driver.findElement(By.xpath("//input[@id='login']")).getText();
		int xaxis = driver.findElement(By.xpath("//input[@id='login']")).getLocation().x;
		int yaxis = driver.findElement(By.xpath("//input[@id='login']")).getLocation().y;
		 boolean usernameprsent = driver.findElement(By.xpath("//input[@id='login']")).isEnabled();
		System.out.println("Textbox content is" + value);
		System.out.println("Textbox content is" + valuetext);
		System.out.println("Width is "+width);
		System.out.println("Height is " +height);
		System.out.println("X is"+xaxis);
		System.out.println("Y is"+yaxis);
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
	}
}

