package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class ELTD82POM {
	private static final String DropdownCategory = null;

	private WebDriver driver;
	String classname;

	public ELTD82POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElements for Logging In as TEacher
	@FindBy(id = "login")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	// Methods for Login********************************
	// Method to send Username
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	// Method to send password
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	// Method to click on Submit button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	// Click on Click Course link
	//@FindBy(xpath = "//a[contains(text(),'TC82Course')]")
	@FindBy(xpath="//a[contains(text(),'TC82Course' or '1Selenium11')]")
	private WebElement clickcourse;

	// Click on Tests icon
	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Tests']")
	private WebElement clickTests;

	// Click on Create a new test button
	@FindBy(xpath = "//div[@class='controls']/a")
	private WebElement clickbtnCreNewTest;

	// Enter valid credentials in Test name textbox
	@FindBy(id = "exercise_title")
	private WebElement clickTestName;

	// click on advanced setting button
	@FindBy(how = How.ID, using = "advanced_params")
	private WebElement adv_Setting;

	// Identifying the frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, exerciseDescription']")
	private WebElement AddFrame;

	// Writing text inside the frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame1;

	// click on Enable start time checkbox
	@FindBy(xpath = "//label[contains(text(),'Enable start time')]")
	private WebElement checkBox;

	// For selecting the datefield
	@FindBy(xpath = "//div[@class='input-group']/span/img[@title='Select date']")
	private WebElement dateImage;

	// Click on Now button
	@FindBy(xpath = "//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']//div//following::div[8]/button[1]")
	private WebElement clickNow;

	// Click on Done button
	@FindBy(xpath = "//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']//div//following::div[8]/button[2]")
	private WebElement clickDone;

	// Enter valid numeric values in Pass percentage textbox
	@FindBy(id = "pass_percentage")
	private WebElement passPercent;

	// Click on Proceed to questions button
	@FindBy(how = How.NAME, using = "submitExercise")
	private WebElement btn_submitExercise;

	// . Click on Multiple Choice icon
	@FindBy(xpath = "//div[@class='well']/ul/li//div/a/img")
	private WebElement clickMultipleChoice;

	// Enter valid credentials in Questions textbox
	@FindBy(how = How.ID, using = "question_admin_form_questionName")
	private WebElement question;

	// Identifying the frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[1]']")
	private WebElement AddFramei;

	// Writing text inside the frame1
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFramei1;

	// Identifying the frame2
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[2]']")
	private WebElement AddFrameii;

	// Writing text inside the frame2
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrameii2;

	// Identifying the frame3
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[3]']")
	private WebElement AddFrameiii;

	// Writing text inside the frame3
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrameii3;

	// Identifying the frame4
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[4]']")
	private WebElement AddFrameiiii;

	// Writing text inside the frame4
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrameii4;

	// Writing score inside the frame1 of quizQuestion 1st
	@FindBy(name = "weighting[1]")
	private WebElement Addscore1_1stQuestion;

	// Writing score beside frame2 of quizQuestion 1st
	@FindBy(name = "weighting[2]")
	private WebElement Addscore2_1stQuestion;

	// Writing score beside frame3 of quizQuestion 1st
	@FindBy(name = "weighting[3]")
	private WebElement Addscore3_1stQuestion;

	// Writing score beside frame4 of quizQuestion 1st
	@FindBy(name = "weighting[4]")
	private WebElement Addscore4_1stQuestion;

	// For clicking the button Submit Question
	@FindBy(how = How.ID, using = "submit-question")
	private WebElement clicksub_question;

	// Click on Multiple Choice icon
	@FindBy(xpath = "//div[@class='well']/ul/li//div/a/img")
	private WebElement clickMultipleChoice1;

	// Enter valid credentials in Questions textbox
	@FindBy(id = "question_admin_form_questionName")
	private WebElement clickMulChoice2ndQues;

	// Identifying the frame1 of quizQuestion 2nd
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[1]']")
	private WebElement AddFrame1_2ndQuestion1;

	// Writing text inside the frame1 of quizQuestion 2nd
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame1_2ndQuestion1Text;

	// Identifying the frame2 of quizQuestion 2nd
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[2]']")
	private WebElement AddFrame2_2ndQuestion2;

	// Writing text inside the frame2 of quizQuestion 2nd
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame2_2ndQuestion2Text;

	// Identifying the frame3 of quizQuestion 2nd
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[3]']")
	private WebElement AddFrame3_2ndQuestion3;

	// Writing text inside the frame3 of quizQuestion 2nd
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame3_2ndQuestion3Text;

	// Identifying the frame4 of quizQuestion 2nd
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[4]']")
	private WebElement AddFrame4_2ndQuestion4;

	// Writing text inside the frame4 of quizQuestion 2nd
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame4_2ndQuestion4Text;

	// Writing score inside the frame1 of quizQuestion 2nd
	@FindBy(name = "weighting[1]")
	private WebElement Addscore1_2ndQuestion;

	// Writing score beside frame2 of quizQuestion 2nd
	@FindBy(name = "weighting[2]")
	private WebElement Addscore2_2ndQuestion;

	// Writing score beside frame3 of quizQuestion 2nd
	@FindBy(name = "weighting[3]")
	private WebElement Addscore3_2ndQuestion;

	// Writing score beside frame4 of quizQuestion 2nd
	@FindBy(name = "weighting[4]")
	private WebElement Addscore4_2ndQuestion;

	// For choosing the Radiobutton
	@FindBy(xpath = "//tbody/tr[2]/td[2]//input[@name='correct']")
	private WebElement Radiobutton;

	// For clicking the button ( "Add this Question to test")
	@FindBy(how = How.ID, using = "submit-question")
	private WebElement clicksub_question1;

	// For clicking on the preview icon
	@FindBy(xpath = "//div[@class='actions']/a//following::a/img")
	private WebElement clickPreviewIcon;

	// Clicking on Start test button
	@FindBy(xpath = "//div[@class='exercise_overview_options col-md-12']/a")
	private WebElement clickStartTest;

	// Clicking on Selenium radio button
	@FindBy(xpath = "//div[@class='main-question ']//following::div[@class='question_options']/child::label[1]/input")
	private WebElement clickSelenium;

	// Clicking on next Question button
	@FindBy(xpath = "//div[@class='form-actions']/button")
	private WebElement clickNextQuesbutton;

	// Clicking on Java radio button
	@FindBy(xpath = "//div[@class='question_options']/child::label[2]/input")
	private WebElement clickJava;

	// Clicking on End test button
	@FindBy(xpath = "//div[@class='form-actions']//button[@class='btn btn-warning question-validate-btn']")
	private WebElement clickEndTest;

	// ==============================================================================

	// Method to get the dynamic value for the
			// subUsersToClass1 method below.(classname)
			public void clickCourse() {
				 this.clickcourse.click();
				classname = this.clickcourse.getAttribute("value");
			}

			// Method to click on "Subscribe Sessions to Promotions" icon
			// Have split the Xpath and concantenated-
			// to capture dynamic xpath
			public void subUsersToClass1() {
				String before = "//div[@class='col-md-10']//h4//a[contains(text(),'";
				String after = "')]";
				String classuser = before + classname + after;
				driver.findElement(By.xpath(classuser)).click();
			}
	
	public void clickTests() {
		this.clickTests.click();
	}

	public void clickCreateaNewTest() {
		this.clickbtnCreNewTest.click();
	}

	
	 public void sendTestName(String clickTestName) { this.clickTestName.clear();
	 this.clickTestName.sendKeys(clickTestName); }
	
	
	public void clickAdvSetting() {
		this.adv_Setting.click();
	}

	public void Frame() {

		driver.switchTo().frame(AddFrame);
	}

	public void sendTestNameDesc(String AddFrame1) {
		this.AddFrame1.clear();
		this.AddFrame1.sendKeys(AddFrame1);
	}

	public void Frame2() {

		driver.switchTo().defaultContent();
	}

	public void clickCheckBox() {
		this.checkBox.click();
	}

	public void clickDateImage() {
		this.dateImage.click();
	}

	public void clickNow() {
		this.clickNow.click();
	}

	public void clickDone() {
		this.clickDone.click();
	}

	public void clickPassPercent(String passPercent) {
		this.passPercent.clear();
		this.passPercent.sendKeys(passPercent);
	}

	public void btnsubmitExercise() {
		this.btn_submitExercise.click();
	}

	public void assertResult82_1() {
		String Expectedtext1 = "Exercise added";
		String Actualtext1 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext1, Expectedtext1);
		System.out.println(Actualtext1);
	}

	public void assertResult82_2() {

		String Expected362 = "0 questions, for a total score (all questions) of 0.";
		String Actualtext362 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[4]")).getText();
		Assert.assertEquals(Actualtext362, Expected362);
		System.out.println(Actualtext362);

	}

	public void clickMultipleChoice() {
		this.clickMultipleChoice.click();
	}

	public void sendQuestionText(String question) {
		this.question.clear();
		this.question.sendKeys(question);
	}

	public void Framei() {

		driver.switchTo().frame(AddFramei);
	}

	public void send1text(String AddFramei1) {
		this.AddFramei1.clear();
		this.AddFramei1.sendKeys(AddFramei1);
	}

	public void Frame1out() {

		driver.switchTo().defaultContent();
	}

	public void Framei2() {

		driver.switchTo().frame(AddFrameii);
	}

	public void send2text(String AddFrameii2) {
		this.AddFrameii2.clear();
		this.AddFrameii2.sendKeys(AddFrameii2);
	}

	public void Frame2out() {

		driver.switchTo().defaultContent();
	}

	public void Framei3() {

		driver.switchTo().frame(AddFrameiii);
	}

	public void send3text(String AddFrameii3) {
		this.AddFrameii3.clear();
		this.AddFrameii3.sendKeys(AddFrameii3);
	}

	// to come out of frame
	public void Frame3out() {

		driver.switchTo().defaultContent();
	}

	public void Framei4() {

		driver.switchTo().frame(AddFrameiiii);
	}

	public void send4text(String AddFrameii4) {
		this.AddFrameii4.clear();
		this.AddFrameii4.sendKeys(AddFrameii4);
	}

	public void Frame4out() {

		driver.switchTo().defaultContent();
	}

	public void score1_1stQuestion(String Addscore1_1stQuestion) {
		this.Addscore1_1stQuestion.clear();
		this.Addscore1_1stQuestion.sendKeys(Addscore1_1stQuestion);
	}

	public void score2_1stQuestion(String Addscore2_1stQuestion) {
		this.Addscore2_1stQuestion.clear();
		this.Addscore2_1stQuestion.sendKeys(Addscore2_1stQuestion);
	}

	public void score3_1stQuestion(String Addscore3_1stQuestion) {
		this.Addscore3_1stQuestion.clear();
		this.Addscore3_1stQuestion.sendKeys(Addscore3_1stQuestion);
	}

	public void score4_1stQuestion(String Addscore4_1stQuestion) {
		this.Addscore4_1stQuestion.clear();
		this.Addscore4_1stQuestion.sendKeys(Addscore4_1stQuestion);
	}

	public void btnsubQuestion() {
		this.clicksub_question.click();
	}

	public void assertResult82_3() {
		String Expected3 = "1 questions, for a total score (all questions) of 0.";
		String Actualtext3 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[4]")).getText();
		Assert.assertEquals(Actualtext3, Expected3);
		System.out.println(Actualtext3);

	}

	public void MultipleChoice1() {
		this.clickMultipleChoice1.click();
	}

	public void clickMulChoiceQues2(String clickMulChoice2ndQues) {
		this.clickMulChoice2ndQues.clear();
		this.clickMulChoice2ndQues.sendKeys(clickMulChoice2ndQues);
	}

	public void Frame1_2ndQuestion1() {

		driver.switchTo().frame(AddFrame1_2ndQuestion1);
	}

	public void send1Text2ndQuestion(String AddFrame1_2ndQuestion1Text) {
		this.AddFrame1_2ndQuestion1Text.clear();
		this.AddFrame1_2ndQuestion1Text.sendKeys(AddFrame1_2ndQuestion1Text);
	}

	// to come out of frame1
	public void Frame1out2ndQuestion() {

		driver.switchTo().defaultContent();
	}

	public void Frame2_2ndQuestion2() {

		driver.switchTo().frame(AddFrame2_2ndQuestion2);
	}

	public void send2Text2ndQuestion(String AddFrame2_2ndQuestion2Text) {
		this.AddFrame2_2ndQuestion2Text.clear();
		this.AddFrame2_2ndQuestion2Text.sendKeys(AddFrame2_2ndQuestion2Text);
	}

	public void Frame2out2ndQuestion() {

		driver.switchTo().defaultContent();
	}

	public void Frame3_2ndQuestion3() {

		driver.switchTo().frame(AddFrame3_2ndQuestion3);
	}

	public void send3Text2ndQuestion(String AddFrame3_2ndQuestion3Text) {
		this.AddFrame3_2ndQuestion3Text.clear();
		this.AddFrame3_2ndQuestion3Text.sendKeys(AddFrame3_2ndQuestion3Text);
	}

	public void Frame3out2ndQuestion() {

		driver.switchTo().defaultContent();
	}

	public void Frame4_2ndQuestion4() {

		driver.switchTo().frame(AddFrame4_2ndQuestion4);
	}

	public void send4Text2ndQuestion(String AddFrame4_2ndQuestion4Text) {
		this.AddFrame4_2ndQuestion4Text.clear();
		this.AddFrame4_2ndQuestion4Text.sendKeys(AddFrame4_2ndQuestion4Text);
	}

	public void Frame4out2ndQuestion() {

		driver.switchTo().defaultContent();
	}

	public void score1_2ndQuestion(String Addscore1_2ndQuestion) {
		this.Addscore1_2ndQuestion.clear();
		this.Addscore1_2ndQuestion.sendKeys(Addscore1_2ndQuestion);
	}

	public void score2_2ndQuestion(String Addscore2_2ndQuestion) {
		this.Addscore2_2ndQuestion.clear();
		this.Addscore2_2ndQuestion.sendKeys(Addscore2_2ndQuestion);
	}

	public void score3_2ndQuestion(String Addscore3_2ndQuestion) {
		this.Addscore3_2ndQuestion.clear();
		this.Addscore3_2ndQuestion.sendKeys(Addscore3_2ndQuestion);
	}

	public void score4_2ndQuestion(String Addscore4_2ndQuestion) {
		this.Addscore4_2ndQuestion.clear();
		this.Addscore4_2ndQuestion.sendKeys(Addscore4_2ndQuestion);
	}

	public void clickRadioButton() {
		this.Radiobutton.click();
	}

	public void clickPreviewIcon() {
		this.clickPreviewIcon.click();
	}

	public void clickSub_Ques1() {
		this.clicksub_question1.click();
	}

	public void assertResult82_4() {
		String Expected4 = "2 questions, for a total score (all questions) of 0.";
		String Actualtext4 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[4]")).getText();
		Assert.assertEquals(Actualtext4, Expected4);
		System.out.println(Actualtext4);
	}

	public void clickStartTest() {
		this.clickStartTest.click();
	}

	public void clickSelenium() {
		this.clickSelenium.click();
	}

	public void clicknextQuesbutton() {
		this.clickNextQuesbutton.click();
	}

	public void clickJava() {
		this.clickJava.click();
	}

	public void clickEndTest() {
		this.clickEndTest.click();
	}

	public void assertResult82_5() {
		String Expected5 = "Score for the test: 2 / 2";
		String Actualtext5 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[5]/div/div/h3"))
				.getText();
		Assert.assertEquals(Actualtext5, Expected5);
		System.out.println(Actualtext5);
	}

	
}
