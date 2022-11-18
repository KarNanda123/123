package AmazonTest;

import java.io.IOException;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import AmazonWeb.GoToCart;
import AmazonWeb.LoginPage;
import BaseClassPack.BaseClass;
import Util.UtilityClass;

public class AmazonLogin extends BaseClass {
	
	LoginPage fbLogin;
	UtilityClass utility;
	
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		BaseClass.launchBrowser("chrome");
		driver.get("https://www.amazon.com/");
	}
		
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		fbLogin = new LoginPage(driver);
		Thread.sleep(1000);
		
		fbLogin.MoveToLoginPage();
		Thread.sleep(1000);
	}
	
	@Test
	public void TC01() throws InterruptedException, IOException
	{
		

		fbLogin.enterEmailId();
		Thread.sleep(1000);
		
		fbLogin.clickOnContinueButton();
		Thread.sleep(1000);
		
		fbLogin.enterPassword();
		Thread.sleep(1000);
		
		fbLogin.ClickOnSignInButton();
		Thread.sleep(3000);
		
		
		
	}
		
		@AfterMethod
		public void afterMethod(ITestResult result) throws InterruptedException, IOException
		{
			utility = new UtilityClass();
			if(result.getStatus() == ITestResult.FAILURE)
			{
				utility.takeScreenShot();
				System.out.println("TC01 Fail");
			}
			else 
				System.out.println("TC01 pass");
			
			fbLogin.MovetoLogoutTab(driver);
			Thread.sleep(1000);
		}
		
		@AfterClass
		public void afterClass() throws InterruptedException
		{
			driver.quit();
			Thread.sleep(1000);
			
		}
		
		
	}
	
