 package AmazonWeb;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Cart {
	
	@FindBy(xpath= "//input[@value='Delete']")
	private WebElement deleteProduct;
	
	@FindBy(xpath= "//a[@id='nav-link-accountList']")
	private WebElement openLogoutOption;
	
	@FindBy(xpath= "//a[@id='nav-item-signout']")
	private WebElement clickOnLogout;
	
	public Cart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void deleteProductFormCart()
	{
		deleteProduct.click();
	}
	
	public void logout(WebDriver driver)
	{
			Actions act = new Actions(driver);
			act.moveToElement(openLogoutOption).click(clickOnLogout);
			
	}

}
