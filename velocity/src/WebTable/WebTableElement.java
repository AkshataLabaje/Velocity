package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableElement {
	
		public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new ChromeDriver();    // Upcasting
		  
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		
		 List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		 
		 System.out.println(noOfRows.size());
		 
		 List<WebElement> noOfcells = driver.findElements(By.xpath("//table[@id='customers']//tr[\"+(i+1)+\"]//td"));
		 
		 System.out.println(noOfcells.size());
		
		}

}
