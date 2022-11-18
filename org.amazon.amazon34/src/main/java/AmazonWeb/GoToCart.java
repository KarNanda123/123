package AmazonWeb;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToCart {
	
	@FindBy(xpath = "//a[@href='/gp/cart/view.html?ref_=sw_gtc']")
	private WebElement goToCart;
	
	public GoToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnGoToCartButton(WebDriver driver)
	{
		ArrayList<String> arlist = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(arlist.get(1));
		goToCart.click();
	}

}
