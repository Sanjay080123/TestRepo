package seleniumframework.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationPractice {
	WebDriver driver;
	
	
	@Parameters("browser")
	 
	  @BeforeClass
	// Passing Browser parameter from TestNG xml
	  public void ontimeConfig(){
	  driver = Browsers.driver;
	}
	  
	 
	  
	
	@Test
	public void test1() throws InterruptedException{
		 driver.get("http://flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_39M2dM']/input[@type='text']")).sendKeys("adasd");
		driver.findElement(By.xpath("//div[@class='_39M2dM']/input[@type='password']")).sendKeys("asa");
		driver.findElement(By.xpath("//button/span[text()='Login']")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(7000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		WebElement we = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(we).build().perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()='Desktop PCs']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@href='/computers/desktop-pcs/all-in-one-pcs/pr?sid=6bo,nl4,igk&wid=1.productCard.PMU_V2']/span']")).click();
		
		
	}
	
	
	}
	
	
	

