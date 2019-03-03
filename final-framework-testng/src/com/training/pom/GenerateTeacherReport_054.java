package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenerateTeacherReport_054 {

private WebDriver driver; 
	
	public GenerateTeacherReport_054(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//Username 
	@FindBy(id="login")
	private WebElement userName; 
	
	//Password
	@FindBy(id="password")
	private WebElement password;
	
	//Login Button
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	//Reporting tab link text
	@FindBy(xpath="//a[@title='Reporting']")
	private WebElement reportingTab;
    
	//Followed teachers
	@FindBy(xpath="//a[contains(text(),'Followed teachers')]")
	private WebElement follTeacherLink;
	
	//teacher keyword search text box
	@FindBy(id="search_user_keyword")
	private WebElement teacherName;
	
	//Submit button after entering teacher keyword
	@FindBy(id="search_user_submit")
	private WebElement submitBtn; 
	
	//Arrow icon link of the searched student
	@FindBy(xpath="//img[@title='Details']")
	private WebElement arrow1;
	
	//Arrow icon link of the course
	@FindBy(xpath="//table//tbody//tr[3]//td[7] //a//img")
	private WebElement arrow2;
		
	//Quiz icon link
	@FindBy(xpath="//table//tbody//tr[6]//td[5]//img[@title='quiz.png']")
	private WebElement quizIcon;
	
	//check box for send email
	@FindBy(xpath="//div[@class='checkbox']//label/input[@id='qf_0f6937']")
	//@FindBy(xpath="//label[contains(text(),'Send Email')]")
	private WebElement sendEmailChkBox;
	
	//Correct Test Button
	@FindBy(id="myform_submit")
	private WebElement correctTestBtn; 
	
	//Course Name Link
	@FindBy(id ="//img[@title='felenium7']") 
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
	
	//Method to click on Reporting tab
	public void clickReportingTab() {
		this.reportingTab.click(); 
	}
	
	//Method to click on Follow Teacher Link
	public void clickFollowTeacherLink() {
		this.follTeacherLink.click(); 
	}
	
	//Method to send teacher keyword
	public void sendTeacherName(String teacherName) {
		this.teacherName.clear();
		this.teacherName.click(); 
	}
	
	//Method to click on Submit button after sending teacher keyword
	public void clickSubmitBtn() {
		this.submitBtn.click(); 
	}
	
	//Method to click on student Arrow icon
	public void clickArrow1() {
		this.arrow1.click(); 
	}
	
	//Method to click on Course arrow icon
	public void clickArrow2() {
		this.arrow2.click(); 
	}
		
	//Method to click on Quiz arrow icon
	public void clickQuizIcon() {
		this.quizIcon.click(); 
	}
	
	//Method to check the Send Email checkbox
	public void clickEmailChkBox() {
		this.sendEmailChkBox.click(); 
	}
	
	//Method to click COrrect Test Button
	public void clickCorrectTestBtn() {
		this.correctTestBtn.click(); 
	}
	
	//Method to click on COurse Name Link
	public void clickCourseName() {
		this.courseNameLink.click(); 
	}
	
}
