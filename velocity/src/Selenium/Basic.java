package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Basic {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikheel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();    // Upcasting
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
	//	driver.close();    // Current Tab Closed
	//	
	//	driver.quit();     // Current Browser Closed
	
		String title = driver.getTitle();
		System.out.println(title	);
		
		String exptitle ="Facebook – log in or sign up";
		
		if(title.equalsIgnoreCase(exptitle))  {
			System.out.println("Navigate to correct page");
		} 
		else {
			System.out.println("Navigate to Invalid page");
		}
	}

}
  

