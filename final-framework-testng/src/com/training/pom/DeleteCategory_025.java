package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCategory_025 {

private WebDriver driver; 
	
	public DeleteCategory_025(WebDriver driver) {
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
	
    @FindBy(xpath="//a[@href='http://elearning.upskills.in/main/admin/course_category.php?category=&id=AA&action=delete']//img[@title='Delete this category']")
   	private WebElement deleteCategoryButton;
	
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
	public void clickDeleteCategoryButton() {
		this.deleteCategoryButton.click(); 
	}
	
}
