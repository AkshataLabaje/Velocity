package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
		public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikheel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();     // Upcasting
		
		driver.get("https://www.facebook.com/reg/");
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s = new Select(month);
		
	 //   s.selectByIndex(2);	
	//	s.selectByValue("3");
	//	s.selectByVisibleText("Mar");
		
		System.out.println(s.getFirstSelectedOption().getText());
	}

}