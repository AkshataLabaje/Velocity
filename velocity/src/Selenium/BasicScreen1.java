package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class BasicScreen1 {
	
public static void main(String[] args) throws InterruptedException, IOException {
	
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikheel\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   // Upcasting

		driver.get("https://www.facebook.com/reg/");
		
		for (int i = 1; i <= 5; i++)  {
			
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(2);
		
		File destination = new File("C:\\Selenium\\Screenshot\\Test1"+random+".jpg");
		
		FileHandler.copy(source, destination);
		}
	}
}