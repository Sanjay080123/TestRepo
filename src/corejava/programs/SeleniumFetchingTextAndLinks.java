package corejava.programs;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumFetchingTextAndLinks {
	
	@Test
	public void start() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver-v0.19.1-win32/geckodriver.exe");
		WebDriver wb = new FirefoxDriver();
		wb.get("https://timesofindia.indiatimes.com/defaultinterstitial.cms");
		Thread.sleep(7000);
		String str = wb.findElement(By.tagName("body")).getText();
		System.out.println(str);
		
		List<WebElement> ls = wb.findElements(By.tagName("a"));
		int count = ls.size();
		
		for (int i =0 ;i<=count-1;i++){
			System.out.println(ls.get(i).getText());
			
		}
	
	}

}
