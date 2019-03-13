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

	// WebElement for courseDesc Icon
	@FindBy(xpath = "//img[@id='toolimage_9445']")
	private WebElement courseDescIcon;

	// Webelement for Decsription ICON
	@FindBy(xpath = "//img[@title='Description']")
	private WebElement descicon;

	// Webelement for title textbox
	@FindBy(xpath = "//input[@id='course_description_title']")
	private WebElement titleText1;

	// WebElement for context testbox
	@FindBy(xpath = "/html[1]/body[1]/p[1]")
	private WebElement contextText1;

	// webElemtn for save button
	@FindBy(xpath = "//button[@id='course_description_submit']")
	private WebElement saveBtn1;

	// WebElement for Objective ICON;
	@FindBy(xpath = "//img[@title='Objective'")
	private WebElement objectiveIcon;

	// Webelement for title textbox
	@FindBy(xpath = "//input[@id='course_objective_title']")
	private WebElement titleText2;

	// WebElement for context testbox
	@FindBy(xpath = "/html[1]/body[1]/p[1]")
	private WebElement contextText2;

	// webElemtn for save button
	@FindBy(xpath = "//button[@id='course_objective_submit']")
	private WebElement saveBtn2;

	// webElement for Topics ICON
	@FindBy(xpath = "//img[@title='Topic'")
	private WebElement topicIcon;

	// Webelement for title textbox
	@FindBy(xpath = "//input[@id='course_topic_title']")
	private WebElement titleText3;

	// WebElement for context testbox
	@FindBy(xpath = "/html[1]/body[1]/p[1]")
	private WebElement contextText3;

	// webElemtn for save button
	@FindBy(xpath = "//button[@id='course_topic_submit']")
	private WebElement saveBtn3;

	// webElement for Project ICON
	@FindBy(xpath = "//img[@title='Project'")
	private WebElement projectIcon;

	// Webelement for title textbox
	@FindBy(xpath = "//input[@id='course_project_title']")
	private WebElement titleText4;

	// WebElement for context testbox
	@FindBy(xpath = "/html[1]/body[1]/p[1]")
	private WebElement contextText4;

	// webElemtn for save button
	@FindBy(xpath = "//button[@id='course_project_submit']")
	private WebElement saveBtn4;

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
	public void assertTC84CourseSaved() {
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

//Method to click on course desc icon
	public void clickCourseDesc() {
		this.courseDescIcon.click();
	}

//method to click on desc icon small
	public void clickDesc() {
		this.descicon.click();
	}

	// method to enter title text
	public void entertitletext(String titleText1) {
		this.titleText1.clear();
		this.titleText1.sendKeys(titleText1);
	}

	// method to enter context text
	public void entercontexttext(String contextText1) {
		this.contextText1.clear();
		this.contextText1.sendKeys(contextText1);
	}

	// method to click on save button
	public void saveButton() {
		this.saveBtn1.click();
	}

	// method to click on obj icon small
	public void clickObj() {
		this.objectiveIcon.click();
	}

	// method to enter title text
	public void entertitletext2(String titleText2) {
		this.titleText2.clear();
		this.titleText2.sendKeys(titleText2);
	}

	// method to enter context text
	public void entercontexttext2(String contextText2) {
		this.contextText2.clear();
		this.contextText2.sendKeys(contextText2);
	}

	// method to click on save button
	public void saveButton2() {
		this.saveBtn2.click();
	}
	
	// method to click on topic icon small
		public void clicTopic() {
			this.topicIcon.click();
		}

		// method to enter title text
		public void entertitletext3(String titleText3) {
			this.titleText3.clear();
			this.titleText3.sendKeys(titleText3);
		}

		// method to enter context text
		public void entercontexttext3(String contextText3) {
			this.contextText3.clear();
			this.contextText3.sendKeys(contextText3);
		}

		// method to click on save button
		public void saveButton3() {
			this.saveBtn3.click();
		}
	
}
