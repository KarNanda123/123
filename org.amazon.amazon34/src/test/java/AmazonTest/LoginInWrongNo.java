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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AmazonWeb.LoginPage;

public class LoginInWrongNo {
	
	WebDriver driver;
	LoginPage login;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cromedriver\\chromeNew\\chromedriver.exe\\");
		
	      driver = new ChromeDriver();
	      
	      driver.get("https://www.amazon.com");
	      
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		login = new LoginPage(driver);
		Thread.sleep(500);
	
		login.MoveToLoginPage();
		Thread.sleep(500);
	}
	
	@Test
	public void TC02() throws InterruptedException
	{
		login.wrongNumber();
		Thread.sleep(500);
		
		login.clickOnContinueButton();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
	}
	
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	
	
	
	

}
