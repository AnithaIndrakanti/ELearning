package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenerateStudentReport_053 {
	
private WebDriver driver; 
	
	public GenerateStudentReport_053(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@title='Reporting']")
	private WebElement reportingTab;

	@FindBy(xpath="//a[contains(text(),'Followed students')]")
	private WebElement follStudentLink;
	
	@FindBy(id="search_user_keyword")
	private WebElement studentName;
	
	@FindBy(id="search_user_submit")
	private WebElement submitBtn; 
	
	@FindBy(xpath="//a[@href='myStudents.php?student=21']//img[@title='2rightarrow.png']")
	private WebElement arrow1;
	
	@FindBy(xpath="//table//tbody//tr//td//a//img[1]")
	private WebElement arrow2;
	
	@FindBy(xpath="//table//tbody//tr[6]//td[5]//img[@title='quiz.png']")
	private WebElement quizIcon;
	
	@FindBy(xpath="//form[@id='myform']//fieldset//div//div//label//input[@type='checkbox']")
	//@FindBy(id="qf_5f8cd6")
	//@FindBy(xpath="//input[contains(text(),'Send email')]/preceding-sibling::input[@type='checkbox']")
	private WebElement sendEmailChkBox;
	
	@FindBy(id="myform_submit")
	private WebElement correctTestBtn; 
	
	//@FindBy(id ="//img[@title='felenium7']") 
	@FindBy(xpath="//a[@href='http://elearning.upskills.in/courses/FELE7/index.php']")
	private WebElement courseNameLink;
	 	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickReportingTab() {
		this.reportingTab.click(); 
	}
	
	public void clickFollowStudentsLink() {
		this.follStudentLink.click(); 
	}
	
	public void sendStudentName(String studentName) {
		this.studentName.clear();
		this.studentName.click(); 
	}
	
	public void clickSubmitBtn() {
		this.submitBtn.click(); 
	}
	
	public void clickArrow1() {
		this.arrow1.click(); 
	}
	public void clickArrow2() {
		this.arrow2.click(); 
	}
	
	public void clickQuizIcon() {
		this.quizIcon.click(); 
	}
	
	public void clickEmailChkBox() {
		this.sendEmailChkBox.click(); 
	}
	
	public void clickCorrectTestBtn() {
		this.correctTestBtn.click(); 
	}
	public void clickCourseName() {
		this.courseNameLink.click(); 
	}
}
