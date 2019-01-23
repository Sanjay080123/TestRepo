package seleniumframework.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	public static WebDriver driver;
	public static WebDriver beforeTest(String browser) {
		 
		  // If the browser is Firefox, then do this
		 
		  if(browser.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.19.1-win32\\geckodriver.exe");
			  driver = new FirefoxDriver();
		 
		  // If browser is IE, then do this	  
		 
		  }else if (browser.equalsIgnoreCase("chrome")) { 
		 
			  // Here I am setting up the path for my IEDriver
		 
			  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 
			  driver = new ChromeDriver();
			  
		 
		  }
		return driver;
		}

}
