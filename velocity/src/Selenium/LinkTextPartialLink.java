package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialLink {
	
		public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com/r.php");	
		
		driver.findElement(By.linkText("Privacy Centre")).click();
		
		driver.findElement(By.partialLinkText("Contact Uploading and non-users")).click();
		}

}
