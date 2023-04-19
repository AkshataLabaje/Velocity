package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSignup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/account/login?signup=true");
		
		driver.findElement(By.xpath("// input[@class='_2IX_2-VJ2DxU']")).sendKeys("7083804545");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("// Button[@class='_2KpZ6l_2HKlqd_3AWRaL']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("// Button[@class='_2KpZ6l_2HKlqd_3AWRaL']")).click();
		Thread.sleep(3000);
		
	}

}
