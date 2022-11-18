package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import BaseClassPack.BaseClass;

public class UtilityClass extends BaseClass{
	
	public void takeScreenShot() throws IOException
	{
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String name = new SimpleDateFormat("yyyy-mm-dd-hh.mm.ss").format(new Date());
		
		File dest = new File("E:\\eclipse installer\\eclipse\\org.amazon.amazon2\\src\\test\\java\\ScreenShot\\"+name+".jpg");
		
		FileHandler.copy(source, dest);
	}
	
	public void fetchData() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Selenium sheet.xlsx");
		
		Cell value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1);
		
		
	}

}
