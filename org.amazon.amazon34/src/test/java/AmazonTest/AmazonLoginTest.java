package AmazonTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import AmazonWeb.LoginPage;
import Util.UtilityClass;

public class AmazonLoginTest {

	WebDriver driver;
	LoginPage login;
	UtilityClass utility;
	
	@BeforeClass
	public void beforeClass() 
	{
	System.setProperty("webdriver.chrome.driver" , "E:\\Cromedriver\\chromeNew\\chromedriver.exe\\");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
	
	@BeforeMethod
	public void BeforeTest() throws InterruptedException
	{
		login = new LoginPage(driver);	
		
		login.MoveToLoginPage();
		Thread.sleep(500);
	}
	
	@Test
	public void TC01() throws InterruptedException, IOException
	{
		
        login.enterEmailId();
        Thread.sleep(500);
        
		login.clickOnContinueButton();
		Thread.sleep(500);
		
		utility = new UtilityClass();
		utility.takeScreenShot();
		
		login.enterPassword();
		Thread.sleep(500);
		
		login.ClickOnSignInButton();
		Thread.sleep(500);
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		login.MovetoLogoutTab(driver);
		Thread.sleep(500);
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	
	
	
	
	
}
