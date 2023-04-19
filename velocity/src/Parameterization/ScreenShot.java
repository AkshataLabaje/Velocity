package Parameterization;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikheel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		// To take ScreenShot and Store it as a file Format
	//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Now copy that Screenshot and save it desired location by giving its path
		
		//File destination = new File("")
	}

}
