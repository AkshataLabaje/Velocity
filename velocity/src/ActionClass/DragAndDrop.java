package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
		public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver = new ChromeDriver();	   // Upcasting
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("//li[@class='placeholder'])[1]"));
		
		WebElement destination = driver.findElement(By.xpath("//li[@class='placeholder'])[1]"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
	//	act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		
		act.dragAndDrop(source, destination).perform();
		
	}
}
