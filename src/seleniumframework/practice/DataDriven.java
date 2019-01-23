package seleniumframework.practice;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {
	WebDriver driver;
	
	
	
	@Test(dataProvider="testData", priority='1')
	public void testCase(String Username , String Password) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("http://flipkart.com");
		System.out.println(Username);
		driver.findElement(By.xpath("//div[@class='_39M2dM']/input[@type='text']")).sendKeys(Username);
		System.out.println(Password);
		driver.findElement(By.xpath("//div[@class='_39M2dM']/input[@type='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button/span[text()='Login']")).click();
		String str = driver.findElement(By.xpath("//span[text()='Sanjay']")).getText();
		Assert.assertEquals(str, "Sanjay");
	}
	
	
	@DataProvider(name="testData")
	public Object[][] readExcel()  throws BiffException, IOException { 
		//Array of object as we are sending multiple data for rws and column
		
		File f = new File("C:\\Users\\sanjayk\\Desktop\\Data.xls");   //--- JXL supports xls file not xlsx.
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet("Sheet1");
		int rows = sh.getRows();
		int coloumns = sh.getColumns();
		String[][] inputData = new String [rows][coloumns];
		for (int i = 0;i< rows ; i++){
			for (int j =0;j<coloumns;j++){
				Cell c = sh.getCell(j,i);
				inputData[i][j] = c.getContents();
				System.out.println(i);
				System.out.println(j);
				
			}
		}
		return inputData;

	}

}
