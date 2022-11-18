package AmazonWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {
	
	
	@FindBy(xpath= "//img[@alt='MSI CreatorPro Z17, Intel 12th Gen. i7-12700H, 43CM QHD+ 165Hz Creator Laptop (32GB/1TB NVMe SSD/ Windows 11 Pro/Nvidia RT...']")
	private WebElement product;
	
	public SelectProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectProduct()
	{
		product.click();
	}
	
	

}
