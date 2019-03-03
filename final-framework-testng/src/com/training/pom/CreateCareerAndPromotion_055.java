package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateCareerAndPromotion_055 {

	private WebDriver driver;
	private String classname;

	public CreateCareerAndPromotion_055(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Web Element for login
	@FindBy(id = "login")
	private WebElement userName;

	// Web Element for password
	@FindBy(id = "password")
	private WebElement password;

	// Web Element for login button
	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	// Web Element for Admin link
	@FindBy(xpath = "//a[@title='Administration']")
	private WebElement administrationLink;

	// Web Element for Careers and promotions link
	@FindBy(xpath = "//a[contains(text(),'Careers and promotions')]")
	private WebElement careersAndPromotionsLink1;

	// Web Element for careers link
	@FindBy(xpath = "//img[@title='Careers']")
	private WebElement careersLink;

	// Web Element for add icon
	@FindBy(xpath = "//img[@title='Add']")
	private WebElement addIcon1;

	// Web Element for career name
	@FindBy(id = "career_name")
	private WebElement nameTextbox1;

	// Web Element for add career button
	@FindBy(id = "career_submit")
	private WebElement addBtn1;

	// Web Element for careers and promotions link
	@FindBy(xpath = "//a[contains(text(),'Careers and promotions')]")
	private WebElement careersAndPromotionsLink2;

	// Web Element for Promotions link
	@FindBy(xpath = "//img[@title='Promotions']")
	private WebElement promotionsLink;

	// Web Element for adding icon
	@FindBy(xpath = "//img[@title='Add']")
	private WebElement addIcon2;

	// Web Element for name
	@FindBy(id = "name")
	private WebElement nameTextbox2;

	// Web Element for submit promotion button
	@FindBy(id = "promotion_submit")
	private WebElement addBtn2;

	// Web Element for choosing option from session listbox
	@FindBy(xpath = "//option[@value='77']")
	private WebElement sessionListbox;

	// Web Element for arrow
	@FindBy(xpath = "//em[@class='fa fa-arrow-right']")
	private WebElement arrow;

	// Web Element for USbscribe button
	@FindBy(xpath = "//button[contains(text(),'Subscribe sessions to promotion')]")
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

	// Method to click on CareerPromotion Link
	public void clickCareerPromotionLink1() {
		this.careersAndPromotionsLink1.click();
	}

	// Method to click on Careers Link
	public void clickCareersLink() {
		this.careersLink.click();
	}

	// Method to click on Add Icon
	public void clickAddIcon1() {
		this.addIcon1.click();
	}

	// Method to send name in text box
	public void sendName1(String nameTextbox1) {
		this.nameTextbox1.clear();
		this.nameTextbox1.sendKeys(nameTextbox1);
	}

	// Method to click on Add BUtton
	public void clickAddBtn1() {
		this.addBtn1.click();
	}

	// Assert method when career is added 
	//by means of alert message displayed
	public void assertResult55_1() {
		String Expected1 = "Item added";
		String Actual1 = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(Actual1, Expected1);
		System.out.println("Actual is: " + Actual1 + " Expected is: " + Expected1);
	}

	// Method to assert alert message by means of background color
	public void assertResult55_2() {
		String color = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getCssValue("background-color");
		System.out.println(color);
		String ActualColor2 = Color.fromString(color).asHex();
		System.out.println("Actual Color is " + ActualColor2);
		String ExpectedColor2 = "#dff0d8";
		Assert.assertEquals(ActualColor2, ExpectedColor2);
	}

	// Method to click on CareersAndPromoitons text link
	public void clickCareerPromotionLink() {
		this.careersAndPromotionsLink1.click();
	}

	// Method to click on Promotions Link
	public void clickPromotionsLink() {
		this.promotionsLink.click();
	}

	// Method to click on Add icon
	public void clickAddIcon2() {
		this.addIcon2.click();
	}

	// Method to get the dynamic value for the
	// subUsersToClass1 method below.(classname)
	public void sendName2(String nameTextbox2) {
		this.nameTextbox2.clear();
		this.nameTextbox2.sendKeys(nameTextbox2);
		classname = this.nameTextbox2.getAttribute("value");
	}

	// Method to click on "Subscribe Sessions to Promotions" icon
	// Have split the Xpath and concantenated-
	// to capture dynamic xpath
	public void subUsersToClass1() {
		String before = "//table/tbody//td[@title='";
		String after = "']//following-sibling::td[3]//a/img[@title='Subscribe sessions to promotions']";
		String classuser = before + classname + after;
		driver.findElement(By.xpath(classuser)).click();
	}

	// Method to click on Add button for Promotion
	public void clickAddBtn2() {
		this.addBtn2.click();
	}

	// Method to Assert Expected and verified when Promotion is added
	public void assertResult55_3() {
		String Expected2 = "Item added";
		String Actual2 = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals(Actual2, Expected2);
		System.out.println("Actual is: " + Actual2 + " Expected is: " + Expected2);
	}

	// Method to assert alert message by means of background color
	public void assertResult55_4() {
		String color = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getCssValue("background-color");
		System.out.println(color);
		String ActualColor2 = Color.fromString(color).asHex();
		System.out.println("Actual Color is " + ActualColor2);
		String ExpectedColor2 = "#dff0d8";
		Assert.assertEquals(ActualColor2, ExpectedColor2);
	}

	// Method to select session from listbox
	public void selectSession() {
		this.sessionListbox.click();
	}

	// Method to click on Arrow
	public void clickArrow() {
		this.arrow.click();
	}

	// Method to click on Subscribe Session Button
	public void clickSubscribeSessionBtn() {
		this.subscribeBtn.click();
	}
}
