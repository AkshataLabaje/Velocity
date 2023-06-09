package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListBox {
	
		public static void main(String[] args) throws InterruptedException  {
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2Kpz61_2doB4z']")).click();
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_w1N']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(login).perform();    // moving angular brace to login elemen
		
		WebElement orders = driver.findElement(By.xpath("//div[text()='Orders']"));
		
		act.click(orders).perform();
		
		}

}
