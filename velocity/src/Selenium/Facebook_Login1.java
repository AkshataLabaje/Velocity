package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_Login1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php");
		
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  // deprecated method
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("akshatalabaje203@gmail.com");
	//	Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='text']")).clear();
	//	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akku");
	//	Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("abc@1234");
	//    Thread.sleep(3000);
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//but[@value='1']"))).click();
	    
	//    driver.findElement(By.xpath("//button[@value='1']")).click();
		}

}
