package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopup {

		public static void main(String[] args) throws InterruptedException {
			
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("prefs","prefs");
		
	//	To disable the notifications based permission popup
		
	//	options.addArguments("disable-notifications");
		
	//	To disable the location based permission popup
		
	//	options.addArguments("disable-geolocation");
		
	//	To disable the microphone or camera based permission popup
		
	//	options.addArguments("disable-media-stream");
		
	//	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
	//	To verify notification based permission popup
	//	driver.get("https://www.cleartrip.com/");
		
	//	To verify location based permission popup
	//	driver.get("https://whatmylocation.com/");
		
	//	To verify microphone based permission popup
	//	driver.get("https://mictests.com/");
	//	Thread.sleep(2000);
	//	driver.findElement(By.id("mic-luncher")).click();
		
	//	To verify camera based permission popup
		driver.get("https://webcamtests.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("webcam-launcher")).click();

		}
	}


