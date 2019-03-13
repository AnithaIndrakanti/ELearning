package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ELTD81POM {
	private WebDriver driver;
	String classname;

	public ELTD81POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElements for Logging In
	@FindBy(id = "login")
	private WebElement userName;

	// Web Element for Password
	@FindBy(id = "password")
	private WebElement password;

	// Web Element for login button
	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	// Methods for Login********************************
	// Method to send Username
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	// Method to send password
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	// Method to click on Submit button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	// **********************************************************************
	// WebElements for Adding multiple users

	// Web Element for admin link
	@FindBy(xpath = "//a[@title='Administration']")
	private WebElement administrationLink;

	// Web Element for adduserlink
	@FindBy(xpath = "//a[contains(text(),'Add a user')]")
	private WebElement addUserLink;

	// Web Element for firstname
	@FindBy(id = "firstname")
	private WebElement firstName;

	// Web Element for lastname
	@FindBy(id = "lastname")
	private WebElement lastName;

	// Web Element for email
	@FindBy(id = "email")
	private WebElement email;

	// Web Element for phone
	@FindBy(id = "phone")
	private WebElement phone;

	// Web Element for username
	@FindBy(id = "username")
	private WebElement loginName;

	// Web Element for password radiobutn
	@FindBy(name = "password[password_auto]")
	private WebElement passwordRadio;

	// Web Element for password
	@FindBy(id = "password")
	private WebElement password1;

	// Web Element for caret
	@FindBy(xpath = "//span[@class='caret']")
	private WebElement profileSelect1;

	// Web Element for submit btn
	@FindBy(name = "submit")
	private WebElement addUserButton;

	// ******Methods to Add User**********
	public void clickAdminLink() {
		this.administrationLink.click();
	}

	// Method to click on Add User Link
	public void clickAddUserLink() {
		this.addUserLink.click();
	}

	// Method to enter firstname
	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}

	// Method to enter lastname
	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}

	// Method to entre email
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}

	// Method to enter phone number
	public void sendPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}

	// Method to enter username
	public void sendUserName1(String userName1) {
		this.loginName.clear();
		this.loginName.sendKeys(userName1);
	}

	// Method to select radio button
	public void clickPasswordRadio() {
		this.passwordRadio.click();
	}

	// Method to enter password
	public void sendPassword1(String password1) {
		this.password1.clear();
		this.password1.sendKeys(password1);
	}

	// Method to select a profile
	public void selectProfile1() {
		Select option = new Select(profileSelect1);
		option.selectByVisibleText("Trainer");
	}

	// Method to click on SUBMIT button
	public void clickSubmit() {
		this.addUserButton.click();
	}

	// Method to assert user added
	public void assertTC81_1() {
		String Expected = "The user has been added:manzoor";
		String Actual = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(Actual, Expected);
		System.out.println("Actual is: " + Actual + " Expected is: " + Expected);
	}

	// WebElements for "Add Users to Course" Link
	@FindBy(xpath = "//a[contains(text(),'Add users to course')]")
	private WebElement addUsersToCourseLink;

	@FindBy(xpath = "//option[@value='222']")
	private WebElement userListValue;

	@FindBy(xpath = "//option[contains(text(),'(1) CoreJava')]")
	private WebElement courseListValue;

	@FindBy(xpath = "//button[@value='Add to the course(s) >>']")
	private WebElement add2CourseButton;

	// Methods for Add users to course Link

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

	// Method to assert user subscribed to course selected
	public void assertTC81_2() {
		String Expected = "The selected users are subscribed to the selected course";
		String Actual = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(Actual, Expected);
		System.out.println("Actual is: " + Actual + " Expected is: " + Expected);
	}

}
