package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyUserDetails_051 {
private WebDriver driver; 
	
	public ModifyUserDetails_051(WebDriver driver) {
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
		
	@FindBy(xpath="//a[contains(text(),'User list')]")
	private WebElement userListLink;
	
	@FindBy(id="search_simple_keyword")
	private WebElement searchBox;
	
	@FindBy(id="search_simple_submit")
	private WebElement searchBtn;
	
	@FindBy(xpath="//table//tbody//tr//td//a[6]//img[1]")
	private WebElement editBtn;
	
	@FindBy(id="user_edit_email")
	private WebElement emailTextBox;
	
	//@FindBy(xpath="//input[@id='qf_03d27b']")
	//@FindBy(id="qf_03d27b")
	@FindBy(xpath="//div[@class='col-sm-8']/following::div[75]/div/div/label/input")
	private WebElement accountRadioBtn;
	
	@FindBy(id="user_edit_submit")
	private WebElement saveBtn;
	
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
	
	public void clickUserListLink() {
		this.userListLink.click(); 
	}
	public void sendSearchtext(String searchBox) {
		this.searchBox.clear(); 
		this.searchBox.sendKeys(searchBox); 
	}
	
	public void clickSearchBtn() {
		this.searchBtn.click(); 
	}
	
	public void clickEditBtn() {
		this.editBtn.click(); 
	}
	
	public void clearEmail(String emailTextBox) {
		this.emailTextBox.clear();
		this.emailTextBox.sendKeys(emailTextBox); 
	}
	
	public void clickInactiveAccBtn() {
		this.accountRadioBtn.click(); 
	}
	public void clickSaveBtn() {
		this.saveBtn.click(); 
	}
	
}
