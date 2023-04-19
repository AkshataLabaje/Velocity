package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	
		public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement enable = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		
		boolean result = enable.isEnabled();
		
		System.out.println(result);
		

		}

}
