package pagerepo;

import org.openqa.selenium.By;

import businessfuntions.BaseClass;

public class PageLogout extends BaseClass {
	
//	static WebDriver driver = null;
	
	static By welcomeLink = By.xpath("//*[@id=\"welcome\"]");
	static By logOutLink = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a");
	
	static public void clickWelcomeLink() {
		driver.findElement(welcomeLink).click();
	}
	static public void clickLogoutLink() {
		driver.findElement(logOutLink).click();
	}
			
}
