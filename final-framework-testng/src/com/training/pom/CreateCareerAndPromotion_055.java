package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCareerAndPromotion_055 {

	private WebDriver driver; 

	public CreateCareerAndPromotion_055(WebDriver driver) {
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
	
	@FindBy(xpath="//a[contains(text(),'Careers and promotions')]")
	private WebElement careersAndPromotionsLink1;
	
	@FindBy(xpath="//img[@title='Careers']")
	private WebElement careersLink;
	
	@FindBy(xpath="//img[@title='Add']")
	private WebElement addIcon1;
	
	@FindBy(id="career_name")
	private WebElement nameTextbox1;
	
	@FindBy(id="career_submit")
	private WebElement addBtn1;
	
	@FindBy(xpath="//a[contains(text(),'Careers and promotions')]")
	private WebElement careersAndPromotionsLink2;
	
	@FindBy(xpath="//img[@title='Promotions']")
	private WebElement promotionsLink;
	
	@FindBy(xpath="//img[@title='Add']")
	private WebElement addIcon2;
	
	@FindBy(id="name")
	private WebElement nameTextbox2;
	
	@FindBy(id="promotion_submit")
	private WebElement addBtn2;
	
	@FindBy(xpath="//table//tbody//tr[2]//td[4]//a[1]//img")
	private WebElement subscribeSessionsIcon;
	
	@FindBy(xpath="//em[@class='fa fa-arrow-right']")
	private WebElement arrow;
	
	@FindBy(xpath="//button[contains(text(),'Subscribe sessions to promotion')]")
	private WebElement subscribeBtn;
	
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
	
	public void clickCareerPromotionLink1() {
		this.careersAndPromotionsLink1.click(); 
	}
	
		public void clickCareersLink() {
		this.careersLink.click(); 
	}
	
	public void clickAddIcon1() {
		this.addIcon1.click();
	}
	public void sendName1(String nameTextbox1) {
		this.nameTextbox1.clear();
		this.nameTextbox1.sendKeys(nameTextbox1);
	}
	
	public void clickAddBtn1() {
		this.addBtn1.click(); 
	}
	
	public void clickCareerPromotionLink() {
		this.careersAndPromotionsLink1.click(); 
	}
	
		public void clickPromotionsLink() {
		this.promotionsLink.click(); 
	}
	
	public void clickAddIcon2() {
		this.addIcon2.click();
	}
	public void sendName2(String nameTextbox2) {
		this.nameTextbox2.clear();
		this.nameTextbox2.sendKeys(nameTextbox2);
	}
	
	public void clickAddBtn2() {
		this.addBtn2.click(); 
	}
	
	public void clicksubscribeIcon() {
		this.subscribeSessionsIcon.click(); 
	}
	
	public void clickArrow() {
		this.arrow.click();
	}
	
	public void clickSubscribeSessionBtn() {
		this.subscribeBtn.click();
	}
}
