package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ELTD81to85_POM {
	private WebDriver driver;

	public ELTD81to85_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElements for Logging In
	@FindBy(id = "login")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

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
	// TC81

	// WebElements for Adding multiple users

	@FindBy(xpath = "//a[@title='Administration']")
	private WebElement administrationLink;

	@FindBy(xpath = "//a[contains(text(),'Add a user')]")
	private WebElement addUserLink;

	@FindBy(id = "firstname")
	private WebElement firstName;

	@FindBy(id = "lastname")
	private WebElement lastName;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "phone")
	private WebElement phone;

	@FindBy(id = "username")
	private WebElement loginName;

	@FindBy(name = "password[password_auto]")
	private WebElement passwordRadio;

	@FindBy(id = "password")
	private WebElement password1;

	@FindBy(xpath = "//button[@title='Trainer']//span[@class='caret']")
	private WebElement profileSelect1;

	@FindBy(xpath = "//*[@id='user_add']//fieldset//div[11]//div[1]//div[1]/button//span[1]")
	private WebElement profileSelect2;

	// Click on Add button
	@FindBy(name = "submit")
	private WebElement addUserButton;

	// ******Methods to Add User**********
	public void clickAdminLink() {
		this.administrationLink.click();
	}

	public void clickAddUserLink() {
		this.addUserLink.click();
	}

	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}

	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}

	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}

	public void sendPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}

	public void sendUserName1(String userName1) {
		this.loginName.clear();
		this.loginName.sendKeys(userName1);
	}

	public void clickPasswordRadio() {
		this.passwordRadio.click();
	}

	public void sendPassword1(String password1) {
		this.password1.clear();
		this.password1.sendKeys(password1);
	}

	public void selectProfile1() {
		this.profileSelect1.click();
	}

	public void selectValueFromExcel() {
		this.profileSelect2.click();
	}

	public void selectProfile2() {
		this.profileSelect2.click();
	}

	public void clickSubmit() {
		this.addUserButton.click();
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

	public void assertTC81_2() {
		String Expected = "The selected users are subscribed to the selected course";
		String Actual = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(Actual, Expected);
		System.out.println("Actual is: " + Actual + " Expected is: " + Expected);
	}

	// **********************************************************************
	// TC83
	// WebElements for Add A User
    // NOt needed again as they are mentioned in TC81 elements
	// ***********************************************************************
	
	
}
