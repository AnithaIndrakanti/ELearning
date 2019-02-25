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
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@title='Reporting']")
	private WebElement reportingTab;

	@FindBy(xpath="//a[contains(text(),'Followed teachers')]")
	private WebElement follTeacherLink;
	
	@FindBy(id="search_user_keyword")
	private WebElement teacherName;
	
	@FindBy(id="search_user_submit")
	private WebElement submitBtn; 
	
	@FindBy(xpath="//img[@title='Details']")
	private WebElement arrow1;
	
	@FindBy(xpath="//table//tbody//tr[3]//td[7] //a//img")
	private WebElement arrow2;
		
	@FindBy(xpath="//table//tbody//tr[6]//td[5]//img[@title='quiz.png']")
	private WebElement quizIcon;
	
	@FindBy(xpath="//div[@class='checkbox']//label/input[@id='qf_0f6937']")
	//@FindBy(xpath="//label[contains(text(),'Send Email')]")
	private WebElement sendEmailChkBox;
	
	@FindBy(id="myform_submit")
	private WebElement correctTestBtn; 
	
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
	
	public void clickReportingTab() {
		this.reportingTab.click(); 
	}
	
	public void clickFollowTeacherLink() {
		this.follTeacherLink.click(); 
	}
	
	public void sendTeacherName(String teacherName) {
		this.teacherName.clear();
		this.teacherName.click(); 
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
