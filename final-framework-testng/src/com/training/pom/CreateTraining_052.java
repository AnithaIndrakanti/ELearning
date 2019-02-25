package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTraining_052 {

	private WebDriver driver; 

	public CreateTraining_052(WebDriver driver) {
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
	
	@FindBy(xpath="//a[contains(text(),'Sessions categories list')]")
	private WebElement sessionCategoriesListLink;
	
	@FindBy(xpath="//img[@title='Add category']")
	private WebElement addCategoryIcon;
	
	@FindBy(xpath="//button[@value='Add category']")
	private WebElement categoryNameTextbox;
	
	@FindBy(xpath="//button[@value='Add category']")
	private WebElement addCategoryBtn;
	
	@FindBy(linkText="Session list")
	private WebElement sessionListLink;
	
	@FindBy(xpath="//img[@title='Add a training session']")
	private WebElement addTrainingIcon;
	
	@FindBy(id="add_session_name")
	private WebElement addSessionName;
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advancedSettingsBtn;
	
	@FindBy(xpath="//button[@title='none']//span[@class='caret']")
	private WebElement listBoxCaret;
	
	@FindBy(xpath="//span[contains(text(),'TC52_Category1')]")
	private WebElement listBoxValue;
	
	@FindBy(id="add_session_submit")
	private WebElement nextStepBtn1;
	
	@FindBy(xpath="//option[@title='AnithasCourse (ANITHASCOURSE)']")
	private WebElement courseSelection;
	
	@FindBy(xpath="//button[@name='add_course']")
	private WebElement addCourseArrow;
	
	@FindBy(xpath="//button[@name='next']")
	private WebElement nextStepBtn2;
	
	@FindBy(id="user_to_add")
	private WebElement studentName;
	
	@FindBy(xpath="//a[contains(text(),'G Deepa Reddy (DeepaReddy) DEEPAREDDY')]")
	private WebElement studentNameLink;
	
	@FindBy(xpath="//button[contains(text(),'Finish session creation')]")
	private WebElement finishSessionCreationBtn;
	
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
	
	public void clickSessionCategoriesListLink() {
		this.sessionCategoriesListLink.click(); 
	}
	
	public void clickAddCategoryIcon() {
		this.addCategoryIcon.click();
	}
	
	public void sendCategoryName(String categoryName) {
		this.categoryNameTextbox.sendKeys(categoryName);
	}
	
	public void clickAddcategoryBtn () {
		this.addCategoryBtn.click();
	}
	public void clickSessionListLink () {
		this.sessionListLink.click();
	}
	public void clickAddTraining() {
		this.addTrainingIcon.click();
	}

	public void sendSessionName(String sessionName) {
		this.addSessionName.clear();
		this.addSessionName.sendKeys(sessionName);
	}
	public void clickAdvancedSettingsBtn () {
		this.advancedSettingsBtn.click();
	}
	public void clickListBoxCaret() {
		this.listBoxCaret.click();
	}
	public void selectListBoxValue () {
		this.listBoxValue.click();
	}
	public void clickNexStepBtn1() {
		this.nextStepBtn1.click();
	}
	public void clickselectCourse() {
		this.courseSelection.click();
	}
	public void clickAddCourseArrow () {
		this.addCourseArrow.click();
	}
	public void clickNextStepBtn2 () {
		this.nextStepBtn2.click();
	}
	public void sendStudentName(String studentName) {
		this.studentName.clear();
		this.studentName.sendKeys(studentName);
	}
	public void clickStudentNameLink () {
		this.studentNameLink.click();
	}
	public void clickFinishSessionCreationBtn() {
		this.finishSessionCreationBtn.click();
	}
	
}
