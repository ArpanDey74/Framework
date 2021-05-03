package FreeCrmAutomation.FreeCrmAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class normalTest {

	 static WebDriver driver;
	 
	 @Test
	 public void Setup() {
		 System.setProperty("webdriver.chrome.driver", "/Users/arpan/Documents/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			//new line added
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("http://www.google.com");
			//driver.findElement(By.xpath("q"));
	 }
	 
	@AfterMethod
	 public void TearDown() {
		 driver.quit();
	 }
}
