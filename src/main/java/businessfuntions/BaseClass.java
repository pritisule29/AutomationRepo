package businessfuntions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Config;

public class BaseClass {
	
	public static  WebDriver driver = null;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\workspace\\eclipse-workspace\\AutomationFrameworkProject\\Drivers\\chromedriver_103.exe");
		driver = new ChromeDriver();
		driver.get(Config.getPropertyValue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	public static void closeBrowser() {
		driver.close();
		driver.quit();
		
	}

}
