package AmazonWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath= "//input[@id='twotabsearchtextbox']")
	private WebElement textBox;
	
	@FindBy(xpath= "//input[@id='nav-search-submit-button']")
	private WebElement searchButton;
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterValueInTextBox()
	{
		textBox.sendKeys("MSI CreatorPro Z17");
	}
	
	public void ClickOnSearchButton()
	{
		searchButton.click();
	}
	
	

}
