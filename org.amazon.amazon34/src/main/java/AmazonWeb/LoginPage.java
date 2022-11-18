package AmazonWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	@FindBy(xpath= "//a[@id='nav-link-accountList']")
	private WebElement MoveToLoginPageButton;
	
	@FindBy(xpath= "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath= "//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath= "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath= "//input[@id='signInSubmit']")
	private WebElement signInButton;
	
	@FindBy(xpath= "//a[@id='nav-link-accountList']")
	private WebElement moveToLogoutButton;
	
	@FindBy(xpath= "//a[@id='nav-item-signout']")
	private WebElement signOutButton;
	
	 public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void MoveToLoginPage()
	{
		MoveToLoginPageButton.click();
	}
	
	public void enterEmailId()
	{
		email.sendKeys("+918329923271");
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	public void enterPassword()
	{
		password.sendKeys("Kartik@1234");
	}
	
	public void ClickOnSignInButton()
	{
		signInButton.click();
	}
	
	public void MovetoLogoutTab(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		
	   act.moveToElement(moveToLogoutButton).click(signOutButton);
	   
	   
	}
	
	public void wrongNumber()
	{
		email.sendKeys("+918679947899");
	}
	

}
