package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.com/Sign-up/s?k=Sign+up");
			Thread.sleep(3000);
			
		//	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("7083804545");
		//	 Thread.sleep(3000);
			 
		//	 driver.findElement(By.xpath("//input[@type='submit']")).click();
			 
		}
	    		  
	}


