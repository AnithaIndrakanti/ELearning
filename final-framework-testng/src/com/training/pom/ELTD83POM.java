package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ELTD83POM {

	private WebDriver driver;
	private String classname;

	public ELTD83POM(WebDriver driver) {
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

	@FindBy(xpath = "//button[@title='Learner']//span[@class='caret']")
	private WebElement profileSelect1;

	@FindBy(xpath = "//span[contains(text(),'Trainer')]")
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

	public void selectProfile2() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Trainer')]"))).build().perform();
		this.profileSelect2.click();
	}

	public void clickSubmit() {
		this.addUserButton.click();
	}

	public void assertResult83Pass() {
		String color = driver.findElement(By.xpath("//div[@class='alert alert-success']"))
				.getCssValue("background-color");
		System.out.println(color);
		String ActualColor = Color.fromString(color).asHex();
		String ExpectedColor = "#d9edf7";
		System.out.println("Actual Color is " + ActualColor);
		System.out.println("Expected Color is " + ExpectedColor);
	}

	public void assertResult83Fail() {
		String color1 = driver.findElement(By.xpath("//div[@class='alert alert-warning']"))
				.getCssValue("background-color");
		System.out.println(color1);
		String ActualColor1 = Color.fromString(color1).asHex();
		String ExpectedColor1 = "#fcf8e3";
		System.out.println("Actual Color is " + ActualColor1);
		System.out.println("Expected Color is " + ExpectedColor1);
	}

}
