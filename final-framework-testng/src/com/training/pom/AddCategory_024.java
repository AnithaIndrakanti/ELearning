package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategory_024 {

private WebDriver driver; 
	
	public AddCategory_024(WebDriver driver) {
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
		
	@FindBy(xpath="//a[contains(text(),'Courses categories')]")
	private WebElement coursesCategoriesLink;
	
    @FindBy(xpath="//img[@title='Add category']")
    private WebElement addCategoryButton;
	
    @FindBy(id="course_category_code")
    private WebElement enterCategoryCode;
    
    @FindBy(id="course_category_name")
    private WebElement enterCategoryName;
    
    @FindBy(xpath ="//input[@value='TRUE']")
	private WebElement radioButton;
    
    @FindBy(id="course_category_submit")
    private WebElement submitButton;
    
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
	
	public void clickCoursesCategoriesLink() {
		this.coursesCategoriesLink.click(); 
	}
	public void clickAddCategoryButton() {
		this.addCategoryButton.click(); 
	}
	public void sendCategoryCode(String categoryCode) {
		this.enterCategoryCode.clear();
		this.enterCategoryCode.sendKeys(categoryCode);
	}
	public void sendCategoryName(String categoryName) {
		this.enterCategoryName.clear();
		this.enterCategoryName.sendKeys(categoryName);
	}

	public void clickRadioBtn() {
		this.radioButton.click(); 
	}
	public void clickSubmitBtn() {
		this.submitButton.click(); 
	}
	
}
