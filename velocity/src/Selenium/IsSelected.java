package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();   // Upcasting

		driver.get("https://www.facebook.com/reg/");
		
		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		female.click();
		
		boolean result = female.isSelected();
		
		System.out.println(result);
		
		if (result == true)  {
			
		System.out.println("Gievn Element is selected");
		}
		else   {
		System.out.println("Given Element is not selected");
		}
	
		}

}
