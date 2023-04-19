package AbstractEncapsulGeneralis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggestion {
	
	
		public static void main(String[] args) throws InterruptedException {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options);    // Upcasting
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Oneplus");
		Thread.sleep(3000);
		
		List<WebElement> options1 = driver.findElements(By.xpath("//div[@class='aajZCb']"));
		Thread.sleep(3000);
		
		for (int i = 0; i < options1.size(); i++)   {
			System.out.println(options1.get(i).getText());
		}
		
	//	for(WebElement Eachoption : options)   {   // Advance for loop
			
	//		System.out.println(Eachoption.getText());
	//	}
	}

}
