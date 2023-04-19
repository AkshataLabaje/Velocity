package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
		public static void main(String[] args) throws InterruptedException {
				
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikheel\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();   // Upcasting
			
		driver.get("http://nxtgenaiacademy.com/alertandpopup/");	
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		
		driver.switchTo().alert().dismiss();
			}

}
