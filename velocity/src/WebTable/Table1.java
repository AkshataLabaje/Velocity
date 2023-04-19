package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {
	
		public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikheel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> header = driver.findElements(By.xpath("//table//thead//th"));
		
		for (int i =0; i < header.size(); i++)  {
				System.out.println(header.get(i).getText()+" ");
		}
		System.out.println();
		List<WebElement> head1 = driver.findElements(By.xpath("//tbody[@style='margin: 0px; padding: 0px;']//th"));
		
	//	System.out.println(head1.size());
		
		for(int j = 0; j < head1.size(); j++) {
			System.out.println(head1.get(j).getText()+" ");
			
		  List<WebElement> cellno = driver.findElements(By.xpath("//tbody[@style='margin: 0px; padding: 0px;']//tr["+(j+1)+"]//td"));
			
	//	System.out.println(cellno.size());
		
		for (int k = 0; k < cellno.size(); k++)   {
			System.out.println(cellno.get(k).getText()+" ");
		}
		System.out.println();
	}
		List<WebElement> footer = driver.findElements(By.xpath("//tfoot/tr"));
		
		for(int l =0;l<footer.size();l++)   {
			System.out.println(footer.get(l).getText());
			}
		}
	}
	
		


