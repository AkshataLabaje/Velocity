package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframebasic {
	
		public static void main(String[] args) {
			
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikheel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();      // Upcasting
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(iframe);  // Changed selenium focus from main page to iframe
		
		driver.findElement(By.xpath("//button[@type='button']"));
		
		driver.switchTo().defaultContent();   // Selenium focused changed to main page
		
	//	driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		}

}
