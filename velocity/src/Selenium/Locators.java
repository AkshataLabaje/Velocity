package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikheel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();     // Upcasting
		
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(1000);
		
		//driver.findElement(By.linkText("Developers")).click();     
		driver.findElement(By.partialLinkText("uploading")).click();
		
		//driver.findElement(By.name("firstname")).sendKeys("Akshata");
		//driver.findElement(By.id("New password")).sendKeys("Akku");      // Password
		
	}

}
