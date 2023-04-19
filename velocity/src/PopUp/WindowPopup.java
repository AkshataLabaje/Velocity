package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {
	
		public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		WebElement clk = driver.findElement(By.xpath("//input[@type='button'])[2]"));
		
		clk.click();
		clk.click();
		
		Set<String> id = driver.getWindowHandles();
		
		ArrayList<String> arr = new ArrayList<String>(id);
		System.out.println(id);
		
		driver.switchTo().window(arr.get(2));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//span[text()='])[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath(title));
		
		}

}
     //    https://demo.automationtesting.in/Frames.html