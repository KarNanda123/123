package AmazonTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import AmazonWeb.AddToCart1;
import AmazonWeb.Cart;
import AmazonWeb.GoToCart;
import AmazonWeb.HomePage;
import AmazonWeb.LoginPage;
import AmazonWeb.SelectProduct;

public class AddToCart {
	
	WebDriver driver;
	LoginPage login; 
	HomePage home;
	AddToCart1 add;
	GoToCart gocart;
	Cart cart;
	SelectProduct product;
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cromedriver\\chromeNew\\chromedriver.exe\\");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@BeforeMethod
	public void beforeMehtod() throws InterruptedException
	{
	    login = new LoginPage(driver); 
	    Thread.sleep(500);
	    
	    login.MoveToLoginPage();
	    Thread.sleep(500);
	    
        login.enterEmailId();
        Thread.sleep(500);
        
        login.clickOnContinueButton();
        Thread.sleep(500);
		
		login.enterPassword();
		 Thread.sleep(500);
		
		login.ClickOnSignInButton();
		 Thread.sleep(500);
	    
	}
	
	
	@Test
	public void Test01() throws InterruptedException
	{
		
		home = new HomePage(driver);
		
		home.EnterValueInTextBox();
		 Thread.sleep(500);
		
		home.ClickOnSearchButton();
		 Thread.sleep(500);
		 
		product = new SelectProduct(driver);
		product.selectProduct();
		Thread.sleep(500);
		
		add = new AddToCart1(driver);
		
		add.addToCartButton(driver);
		 Thread.sleep(500);
		
	    gocart = new GoToCart(driver);
	    
	    gocart.ClickOnGoToCartButton(driver);
	    Thread.sleep(500);
		
		
		
	}
	
	@AfterMethod
	public void afterMehtod() throws InterruptedException
	{
		 cart = new Cart(driver);
		 cart.deleteProductFormCart();
		 Thread.sleep(500);
		 
		 cart.logout(driver);
		 Thread.sleep(500);
		
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	

	
}
