package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CreateCourse_022 {
	
private WebDriver driver; 

   	public CreateCourse_022(WebDriver driver) {
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
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement createCourseLink;
	
	@FindBy(id="update_course_title")
	private WebElement title;
	
	@FindBy(id="visual_code")
	private WebElement code;
	
	@FindBy(xpath="//button[@title='Site Owner']//span[@class='caret']")
	 private WebElement click1;
	
	@FindBy(xpath="//div[@class='dropdown-menu open']/ul/li[4]")
	private WebElement click2;
	 
	@FindBy(xpath="//button[@title='none']//span[@class='caret']") 
	private WebElement categoryListbox1;
	
	@FindBy(xpath="//span[contains(text(),'(PROJ) Projects')]")
	private WebElement categoryListbox2;
	  
	@FindBy(xpath="//button[@title='English']//span[@class='caret']") 
	private WebElement courseLang1;
	
	@FindBy(xpath="//option[@value='english']")
	private WebElement courseLang2;
	  
	@FindBy(id="update_course_submit") 
	private WebElement createButton;
	 
	
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
	
	public void clickCreateCourseLink() {
		this.createCourseLink.click(); 
	}
	public void enterTitle(String title) {
		this.title.clear();
		this.title.sendKeys(title);
	}
	public void enterCode(String code) {
		this.code.clear();
		this.code.sendKeys(code);
	}
	
	public void teacherBox1() {
		click1.click();
	}
	public void teacherBox2() {
		click2.click();
	}
	
	public void clickCategoryListbox1() { 
		this.categoryListbox1.click(); 
	}
	public void clickCategoryListbox2() { 
		this.categoryListbox2.click(); 
	}
	
	public void selectCourseLanguage1() { 
		this.courseLang1.click(); 
	}
	public void selectCourseLanguage2() { 
		this.courseLang2.click(); 
	}
	
	/*
	 * public void CourseLang(String lang) { Select option=new Select(CourseLang);
	 * option.selectByValue(lang); }
	 */ 
	
	public void clickCreateButton() { 
		this.createButton.click(); 
	}
	 
}