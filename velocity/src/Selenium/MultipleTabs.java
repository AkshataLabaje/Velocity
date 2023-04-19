package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikheel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();    // Upcasting
		
        driver.manage().window().maximize();       // Top Open Browser in Full Screen
		
		driver.get("https://www.google.com/");
		String A = driver.getWindowHandle();
		System.out.println(A);	
		System.out.println(driver.getTitle());
	
		driver.switchTo().newWindow(WindowType.TAB);
		// To Open New Blank tab before switching the driveris at 1st tab
		// Which is google.com but after switch driver
		// Goes new driver
		driver.switchTo().newWindow(WindowType.WINDOW);   // To open linkin new Window
		System.out.println(driver.getTitle());
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(A);
		// After Closing current tab driver will be lost in order to get driver
		// Get back to the tab or window we will switch driver
		System.out.println(driver.getTitle());

		}
	
	}
