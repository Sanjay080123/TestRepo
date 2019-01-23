package corejava.programs;



import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fileInput {
	
	
	WebDriver wb;
	@DataProvider(name= "TestData")
	public Object[][] test() throws BiffException, IOException
	{
		File f = new File("C:/Users/sanjayk/Desktop/Data gmail.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet("Sheet1");
		int rows = sh.getRows();
		System.out.println(rows);
		int coloums = sh.getColumns();
		System.out.println(coloums);
		String [][] inputdata = new String[rows][coloums];
		for (int i =0;i<rows;i++){
			for (int j =0;j<coloums ;j++){
				Cell c = sh.getCell(j, i);
				inputdata[i][j] = c.getContents();
			}
		}
		return inputdata;
	}




	@Test(dataProvider="TestData")
	public void excel(String username , String password) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D://geckodriver-v0.19.1-win32//geckodriver.exe");
		wb = new FirefoxDriver();
		wb.get("http://gmail.com");
		wb.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		wb.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		Thread.sleep(2000);
		wb.findElement(By.xpath("//span[text()='Next']")).click();
	}
	
	@AfterMethod
	public void after(){
		wb.close();
	}
	
}	