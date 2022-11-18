package BaseClassPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browser)
	{
	   if(browser.equalsIgnoreCase("chrome"))
		{
		   System.setProperty("webdriver.chrome.driver", "E:\\Cromedriver\\chromeNew\\chromedriver.exe\\");
		
		   driver = new ChromeDriver();
		
		   driver.manage().window().maximize();
		}

	   else if (browser.equalsIgnoreCase("firefox"))
	    {
		   System.setProperty("webdriver.gecko.driver", "E:\\FIrefox driver\\geckodriver.exe\\");
		   
		   driver = new FirefoxDriver();
		   
		   driver.manage().window().maximize();
		   
		   
	    }
		
	   else if (browser.equalsIgnoreCase("IE"))
	   {
		   
	   }
	   
	}

}
