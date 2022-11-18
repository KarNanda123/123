package AmazonWeb;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart1 {
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCartButton;

	public AddToCart1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addToCartButton(WebDriver driver)
	{
		ArrayList<String> arlist = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(arlist.get(1));
		
		addToCartButton.click();
	}

}
