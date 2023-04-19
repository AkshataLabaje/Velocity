package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	
		public static void main(String[] args) throws InterruptedException {
			
	//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikheel\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://nxtgenaiacademy.com/alertandpopup/");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
			
			Thread.sleep(3000);
			
		//	driver.manage().window().maximize();
			
			driver.switchTo().alert().dismiss();
			
			//	a.sendKeys("No");
			 //   Thread.sleep(3000);
			
			//	a.accept();
		}

}
