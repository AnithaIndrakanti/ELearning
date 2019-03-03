package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddCategory_024 {

private WebDriver driver; 

//constructor method
//has same name as Class	
//below is a parameterized constructor method	
	public AddCategory_024(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
    //Web Element for login
	@FindBy(id="login")
	private WebElement userName; 
	
    //Web Element for password
	@FindBy(id="password")
	private WebElement password;
	
    //Web Element for login button
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
    //Web Element for Admin link
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement administrationLink; 
		
    //Web Element for courses categories link
	@FindBy(xpath="//a[contains(text(),'Courses categories')]")
	private WebElement coursesCategoriesLink;
	
    //Web Element for add category button
    @FindBy(xpath="//img[@title='Add category']")
    private WebElement addCategoryButton;
	
    //Web Element for enter category code
    @FindBy(id="course_category_code")
    private WebElement enterCategoryCode;
    
    //Web Element for course category name
    @FindBy(id="course_category_name")
    private WebElement enterCategoryName;
    
    //Web Element for radio button
    @FindBy(xpath ="//input[@value='TRUE']")
	private WebElement radioButton;
    
    //Web Element for Submit button 
    @FindBy(id="course_category_submit")
    private WebElement submitButton;
    
	//Method to enter username
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	//Method to enter password
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	//Method to click on login button
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	//Method to click on Administration link
	public void clickAdminLink() {
		this.administrationLink.click(); 
	}
	
	//Method to click on Course Categories link
	public void clickCoursesCategoriesLink() {
		this.coursesCategoriesLink.click(); 
	}
	
	//Method to click on Add category button
	public void clickAddCategoryButton() {
		this.addCategoryButton.click(); 
	}
	
	//Method to enter category code
	public void sendCategoryCode(String categoryCode) {
		this.enterCategoryCode.clear();
		this.enterCategoryCode.sendKeys(categoryCode);
	}
	
	//Method to entre category name
	public void sendCategoryName(String categoryName) {
		this.enterCategoryName.clear();
		this.enterCategoryName.sendKeys(categoryName);
	}

	//Method to click on radiobutton
	public void clickRadioBtn() {
		this.radioButton.click(); 
	}
	
	//Method to click on submit button
	public void clickSubmitBtn() {
		this.submitButton.click(); 
	}
	
	//Method to assert message displayed based on alert text
	public void assertResult24_1() {
		String Expected = "Created";
		String Actual = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		Assert.assertTrue(Actual.contains(Expected));
		System.out.println("Actual is " +Actual+ "Expected is  "+Expected);
		}
	
}
