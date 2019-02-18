package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser2Course_023 {
	
	private WebDriver driver; 

	public AddUser2Course_023(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement administrationLink; 
	
	@FindBy(xpath="//a[contains(text(),'Add users to course')]")
	private WebElement addUsersToCourseLink;

	@FindBy(xpath="//option[@value='222']")
	private WebElement userListValue;
	
	@FindBy(xpath="//option[contains(text(),'(1) CoreJava')]")
	private WebElement courseListValue;

	@FindBy(xpath="//button[@value='Add to the course(s) >>']")
	private WebElement add2CourseButton;
	
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
	
	public void clickAdminLink() {
		this.administrationLink.click(); 
	}
	
	public void clickAddUsers2CourseLink() {
		this.addUsersToCourseLink.click(); 
	}
	public void selectUserListValue() {
		this.userListValue.click(); 
	}
	public void selectCourseListValue() {
		this.courseListValue.click(); 
	}
	public void clickadd2CourseBtn() {
		this.add2CourseButton.click(); 
	}
	
}
