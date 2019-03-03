package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateTraining_052 {

	private WebDriver driver;

	public CreateTraining_052(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement for username
	@FindBy(id = "login")
	private WebElement userName;

	// WebElement for password
	@FindBy(id = "password")
	private WebElement password;

	// WebElement for login button
	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	// WebElement for Admin link
	@FindBy(xpath = "//a[@title='Administration']")
	private WebElement administrationLink;

	// WebElement for session categories list link
	@FindBy(xpath = "//a[contains(text(),'Sessions categories list')]")
	private WebElement sessionCategoriesListLink;

	// WebElement for add category icon
	@FindBy(xpath = "//img[@title='Add category']")
	private WebElement addCategoryIcon;

	// WebElement for category name
	@FindBy(xpath = "//button[@value='Add category']")
	private WebElement categoryNameTextbox;

	// WebElement for add category button
	@FindBy(xpath = "//button[@value='Add category']")
	private WebElement addCategoryBtn;

	// WebElement for Category added Message
	@FindBy(xpath = "/html/body/div[1]/section/div/div[2]")
	private WebElement actualCategoryAddedMsg1;

	// WebElement for session List Link
	@FindBy(linkText = "Session list")
	private WebElement sessionListLink;

	// WebElement for add training icon
	@FindBy(xpath = "//img[@title='Add a training session']")
	private WebElement addTrainingIcon;

	// WebElement for addSessionName
	@FindBy(id = "add_session_name")
	private WebElement addSessionName;

	// WebElement for advance settings button
	@FindBy(xpath = "//button[@id='advanced_params']")
	private WebElement advancedSettingsBtn;

	// WebElement for list box caret (small triangle)
	@FindBy(xpath = "//button[@title='none']//span[@class='caret']")
	private WebElement listBoxCaret;

	// WebElement for list box value
	@FindBy(xpath = "//span[contains(text(),'Testing')]")
	private WebElement listBoxValue;

	// WebElement for next step button
	@FindBy(id = "add_session_submit")
	private WebElement nextStepBtn1;

	// WebElement for course selection
	@FindBy(xpath = "//option[@title='AnithasCourse (ANITHASCOURSE)']")
	private WebElement courseSelection;

	// WebElement for add course arrow
	@FindBy(xpath = "//button[@name='add_course']")
	private WebElement addCourseArrow;

	// WebElement for next step button 2
	@FindBy(xpath = "//button[@name='next']")
	private WebElement nextStepBtn2;

	// WebElement for student name
	@FindBy(id = "user_to_add")
	private WebElement studentName;

	// WebElement for student name link
	@FindBy(xpath = "//a[contains(text(),'G Deepa Reddy (DeepaReddy) DEEPAREDDY')]")
	private WebElement studentNameLink;

	// WebElement for Finish session creation button
	@FindBy(xpath = "//button[contains(text(),'Finish session creation')]")
	private WebElement finishSessionCreationBtn;

	// Method to enter username
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	// Method to enter password
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	// Method to click on login button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}
	// Method to click on Admin link
	public void clickAdminLink() {
		this.administrationLink.click();
	}

	// Method to click on session categories list link 
	public void clickSessionCategoriesListLink() {
		this.sessionCategoriesListLink.click();
	}

	// Method to click on add category icon
	public void clickAddCategoryIcon() {
		this.addCategoryIcon.click();
	}

	// Method to enter category name
	public void sendCategoryName(String categoryName) {
		this.categoryNameTextbox.sendKeys(categoryName);
	}

	// Method to click on Add Category Button
	public void clickAddcategoryBtn() {
		this.addCategoryBtn.click();
	}

	// Method to assert the alert message when category is added
	public void assertResult52_1() {
		String Expected1 = "The category has been added";
		String Actual1 = this.actualCategoryAddedMsg1.getText();
		Assert.assertEquals(Actual1, Expected1);
		System.out.println("Actual is: " + Actual1);
		System.out.println("Expected is: " + Expected1);
	}

	//Method to assert alert message by means of background color
		public void assertResult52_2() {
			String color = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getCssValue("background-color");
			System.out.println(color);
			String ActualColor = Color.fromString(color).asHex();
			System.out.println("Actual Color is " +ActualColor);
			String ExpectedColor = "#d9edf7";
			Assert.assertEquals(ActualColor,ExpectedColor);
		}
		
	// Method to click on session list link
	public void clickSessionListLink() {
		this.sessionListLink.click();
	}

	// Method to click on add training link
	public void clickAddTraining() {
		this.addTrainingIcon.click();
	}

	// Method to enter session name
	public void sendSessionName(String sessionName) {
		this.addSessionName.clear();
		this.addSessionName.sendKeys(sessionName);
	}

	// Method to click on Advanced settings
	public void clickAdvancedSettingsBtn() {
		this.advancedSettingsBtn.click();
	}

	// Method to click on list box caret
	public void clickListBoxCaret() {
		Actions action = new Actions(driver);
		action.moveToElement(listBoxCaret).perform();
	}

	// Method to select list box value
	public void selectListBoxValue() {
		Actions action = new Actions(driver);
		action.moveToElement(listBoxValue);
		action.click();
		action.perform();
	}
	// Method to click on next step button1
	public void clickNexStepBtn1() {
		this.nextStepBtn1.click();
	}
	// Method to select course
	public void clickselectCourse() {
		this.courseSelection.click();
	}

	// Method to click on add course arrow
	public void clickAddCourseArrow() {
		this.addCourseArrow.click();
	}

	// Method to click on next step button2
	public void clickNextStepBtn2() {
		this.nextStepBtn2.click();
	}

	// Method to enter student name
	public void sendStudentName(String studentName) {
		this.studentName.clear();
		this.studentName.sendKeys(studentName);
	}

	// Method to click on student name link
	public void clickStudentNameLink() {
		Actions action = new Actions(driver);
		// action.moveToElement(studentNameLink).perform();
		action.moveToElement(studentNameLink).build().perform();
		// this.studentNameLink.click();
		// action.click();
	}

	// Method to click on Finish session creation Button
	public void clickFinishSessionCreationBtn() {
		this.finishSessionCreationBtn.click();
	}

	/*
	 * public void selectListBoxValue () { this.listBoxValue.click(); Actions action
	 * = new Actions(driver); action.moveToElement(listBoxCaret).perform();
	 * action.moveToElement(listBoxCaret).build().perform();
	 * 
	 * driver.findElement(By.linkText("iPads")).click();
	 */

}
