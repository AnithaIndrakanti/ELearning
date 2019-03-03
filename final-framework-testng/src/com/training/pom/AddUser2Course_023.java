package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddUser2Course_023 {

	private WebDriver driver;

	public AddUser2Course_023(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Webelemnt login
	@FindBy(id = "login")
	private WebElement userName;

	//Webelement password
	@FindBy(id = "password")
	private WebElement password;

	//webelement login button
	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	//webelement Admin link
	@FindBy(xpath = "//a[@title='Administration']")
	private WebElement administrationLink;

	//web element addusers tocourse link
	@FindBy(xpath = "//a[contains(text(),'Add users to course')]")
	private WebElement addUsersToCourseLink;

	//web Element userlist option
	@FindBy(xpath = "//option[@value='105']")
	private WebElement userListValue;

	//web element course list option
	@FindBy(xpath = "//option[contains(text(),'(1) CoreJava')]")
	private WebElement courseListValue;

	//web element add to course button
	@FindBy(xpath = "//button[@value='Add to the course(s) >>']")
	private WebElement add2CourseButton;

	//Method to send username
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	//Method to send password
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	//Method to click on login button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	// Method to click on Administration tab link
	public void clickAdminLink() {
		this.administrationLink.click();
	}

	// Method to click "Add Users To Course" link
	public void clickAddUsers2CourseLink() {
		this.addUsersToCourseLink.click();
	}

	// Method to select a user value from listbox
	public void selectUserListValue() {
		this.userListValue.click();
	}

	// Method to select a course value from listbox
	public void selectCourseListValue() {
		this.courseListValue.click();
	}

	// Method to click on Add to course Button
	public void clickadd2CourseBtn() {
		this.add2CourseButton.click();
	}

	//Method to assert alert by means of message displayed
	public void assertResult23_1() {
		String Expected = "The selected users are subscribed to the selected course";
		String Actual = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(Actual,Expected);
		System.out.println("Actual is: " +Actual+ " Expected is: "+Expected);
		}
	
	//Method to assert alert message by means of background color
	public void assertResult23_2() {
		String color = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getCssValue("background-color");
		System.out.println(color);
		String ActualColor = Color.fromString(color).asHex();
		System.out.println("Actual Color is " +ActualColor);
		String ExpectedColor = "#dff0d8";
		Assert.assertEquals(ActualColor,ExpectedColor);
	}
}
