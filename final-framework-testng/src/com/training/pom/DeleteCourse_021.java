package com.training.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCourse_021 {
	
//	public static final String checkboxCount = null;

	private WebDriver driver; 
	
	public DeleteCourse_021(WebDriver driver) {
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
	
	@FindBy(xpath="//a[contains(text(),'Course list')]")
	private WebElement courseListLink;
		
	@FindBy(xpath="//a[@href='http://elearning.upskills.in/main/admin/course_list.php?delete_course=0001']//img[@title='Delete']")
   	private WebElement deleteCourseButton;
	
	@FindBy(xpath="//a[contains(text(),'Course2Delete3')]")
	public WebElement courseName;
	
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
	
	public void clickCourseListLink() {
		this.courseListLink.click(); 
	}
	
	public void deleteCourseButton() {
		this.deleteCourseButton.click();
	}
	

	  

}
