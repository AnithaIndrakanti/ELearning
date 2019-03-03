package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ELTD84POM {

	private WebDriver driver;

	public ELTD84POM(WebDriver driver) {
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
	// TC84
	// WebElements for Create Course below
	// ************************************************************************

	// Webelement for finding create course
	@FindBy(linkText = "Create a course")
	WebElement CreateCourse;

	// Webelement for courseTitle
	@FindBy(id = "title")
	WebElement courseName;

	// Webelement for finding Advance Settings
	@FindBy(id = "advanced_params")
	WebElement AdvanceSettings;

	// WebElement for fetch Dropdown
	@FindBy(id = "add_course_category_code")
	WebElement categoryListbox;

	// Webelement for course code
	@FindBy(id = "add_course_wanted_code")
	WebElement courseCodeTextBox;

	// Webelement for course language
	@FindBy(id = "add_course_course_language")
	WebElement courseLangListbox;

	// Webelement for add course
	@FindBy(id = "add_course_submit")
	WebElement createCourseBtn;

	// Webelement for add introduction Text
	@FindBy(xpath = "//*[@id=\"course_tools\"]/div[1]/div/div[1]/a")
	WebElement courseIntro;

	// Webelement for html editor
	@FindBy(xpath = "/html")
	WebElement Editor;

	// Webelement for Display text
	@FindBy(xpath = "//*[@id=\"content-section\"]/div/div[2]/div/div")
	public WebElement displayText;

	// Webelement for click on save Intro Text
	@FindBy(id = "introduction_text_intro_cmdUpdate")
	WebElement saveIntroText;

	public void clickCreateCourse() {
		this.CreateCourse.click();
	}

	public void sendCourseTitle(String CourseName) {
		this.courseName.sendKeys(CourseName);
	}

	public void clickAdvancedSettings() {
		this.AdvanceSettings.click();
	}

	public void category(int index) {
		Select option = new Select(categoryListbox);
		option.selectByIndex(index);

	}

	public void CourseCode(String code) {
		this.courseCodeTextBox.sendKeys(code);
	}

	public void CourseLang(String lang) {
		Select option = new Select(courseLangListbox);
		option.selectByValue(lang);

	}

	public void addCourseClick() {
		this.createCourseBtn.click();
	}

	public void courseIntro() {
		this.courseIntro.click();
	}

	// Assert for TC84 Course is saved
	public void assertTC81CourseSaved() {
		String Expected84_1 = "Intro was updated";
		String Actual84_1 = driver.findElement(By.xpath("//div[contains(text(),'Intro was updated')]")).getText();
		Assert.assertEquals(Actual84_1, Expected84_1);
		System.out.println("Actual is " + Actual84_1 + ". Expected is " + Expected84_1);
	}

	public void editClick() {
		this.Editor.click();

	}

	public void saveText() {
		this.saveIntroText.click();
	}

	public void senddisplayText(String displayText) {
		this.displayText.clear();
		this.displayText.sendKeys(displayText);
	}

}
