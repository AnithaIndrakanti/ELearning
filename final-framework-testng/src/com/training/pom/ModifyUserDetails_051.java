package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ModifyUserDetails_051 {
	private WebDriver driver;

	public ModifyUserDetails_051(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement for username
	@FindBy(id = "login")
	private WebElement userName;

	// WebElement for password
	@FindBy(id = "password")
	private WebElement password;

	// WebElement for login button
	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	// WebElement for Admin link
	@FindBy(xpath = "//a[@title='Administration']")
	private WebElement administrationLink;

	// WebElement for user List link
	@FindBy(xpath = "//a[contains(text(),'User list')]")
	private WebElement userListLink;

	// WebElement for results per page list box
	// @FindBy(xpath="//option[@value='115']")
	@FindBy(name = "users_per_page")
	private WebElement resultsPerPageListBox;

	// WebElement for search box
	@FindBy(id = "search_simple_keyword")
	private WebElement searchBox;

	// WebElement for searc button
	@FindBy(id = "search_simple_submit")
	private WebElement searchBtn;

	// WebElement for edit button
	@FindBy(xpath = "//table//tbody//tr//td//a[6]//img[1]")
	private WebElement editBtn;

	// WebElement for email text box
	@FindBy(id = "user_edit_email")
	private WebElement emailTextBox;

	// WebElement for accoutn radio button
	@FindBy(xpath = "//div[@class='col-sm-8']/following::div[75]/div/div/label/input")
	private WebElement accountRadioBtn;

	// WebElement for save button
	@FindBy(id = "user_edit_submit")
	private WebElement saveBtn;

	// Method for entering username
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	// Method for clikcing loign button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	// Method for clicking on Admin link
	public void clickAdminLink() {
		this.administrationLink.click();
	}

	// Method for user list link
	public void clickUserListLink() {
		this.userListLink.click();
	}

	// Method for clicking on choose all option
	public void clickChooseAllOption() {
		Select option = new Select(driver.findElement(By.name("users_per_page")));
		option.selectByVisibleText("All");
		}

	// Method for entering search text
	public void sendSearchtext(String searchBox) {
		this.searchBox.clear();
		this.searchBox.sendKeys(searchBox);
	}

	// Method for clicking on search button
	public void clickSearchBtn() {
		this.searchBtn.click();
	}

	// Method for clicking on Edit button
	public void clickEditBtn() {
		this.editBtn.click();
	}

	// Method for entering email
	public void clearEmail(String emailTextBox) {
		this.emailTextBox.clear();
		this.emailTextBox.sendKeys(emailTextBox);
	}

	// Method for clicking on inactive button
	public void clickInactiveAccBtn() {
		this.accountRadioBtn.click();
	}

	// Method for clicking on save button
	public void clickSaveBtn() {
		this.saveBtn.click();
	}

	// Method for assert
	public void assertResult51() {
		String Expected = "User updated";
		String Actual = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		Assert.assertTrue(Actual.contains(Expected));
		System.out.println("Actual is " + Actual + "Expected is  " + Expected);
	}

}
