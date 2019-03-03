package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GenerateStudentReport_053 {

	private WebDriver driver;

	public GenerateStudentReport_053(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//WebElement for username
	@FindBy(id = "login")
	private WebElement userName;

	//WebElement for password
	@FindBy(id = "password")
	private WebElement password;

	//WebElement for login button
	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	//WebElement for reporting tab link
	@FindBy(xpath = "//a[@title='Reporting']")
	private WebElement reportingTab;

	//WebElement for followStudents link
	@FindBy(xpath = "//a[contains(text(),'Followed students')]")
	private WebElement follStudentLink;

	//WebElement for Student name
	@FindBy(id = "search_user_keyword")
	private WebElement studentName;

	//WebElement for Submit button
	@FindBy(id = "search_user_submit")
	private WebElement submitBtn;
	
	//WebElement for arrow1
	@FindBy(xpath = "//a[@href='myStudents.php?student=21']//img[@title='2rightarrow.png']")
	private WebElement arrow1;

	//WebElement for arrow 2
	@FindBy(xpath = "//table//tbody//tr[1]//td[7]//a//img")
	private WebElement arrow2;
	
	//WebElement for quiz icon
	@FindBy(xpath = "//table//tbody//tr[6]//td[5]//img[@title='quiz.png']")
	private WebElement quizIcon;

	//WebElement for email checkbox
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement sendEmailChkBox;

	//WebElement for Correct Test button
	@FindBy(id = "myform_submit")
	private WebElement correctTestBtn;

	//WebElement for CourseName Link 
	@FindBy(xpath = "//a[@href='http://elearning.upskills.in/courses/FELE7/index.php']")
	private WebElement courseNameLink;
	
	
	//Method to enter username
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	//Method to enter password
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	//Method to click on login button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}
	//Method to click on Reporting tab
	public void clickReportingTab() {
		this.reportingTab.click();
	}
	//Method to click on Followed students link
	public void clickFollowStudentsLink() {
		this.follStudentLink.click();
	}
	//Method to enter student name
	public void sendStudentName(String studentName) {
		this.studentName.clear();
		this.studentName.click();
	}
	//Method to click on Submit button
	public void clickSubmitBtn() {
		this.submitBtn.click();
	}
	//Method to click on arrow1
	public void clickArrow1() {
		this.arrow1.click();
	}

	//Method to click on arrow2
	public void clickArrow2() {
		this.arrow2.click();
	}
	//Method to click on Quix icon 
	public void clickQuizIcon() {
		this.quizIcon.click();
	}
	//Method to click on email checkbox
	public void clickEmailChkBox() {
		this.sendEmailChkBox.click();
	}
	//Method to click on correct test button
	public void clickCorrectTestBtn() {
		this.correctTestBtn.click();
	}

	// Assert to check expected and actual message are similar
	public void asesrtResult53_1() {
		String Expected = "Message Sent";
		String Actual = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		Assert.assertEquals(Actual, Expected);
		System.out.println("Actual is " + Actual + " Expected is also " + Expected);

	}
//Method to click on course name
	public void clickCourseName() {
		this.courseNameLink.click();
	}
}
