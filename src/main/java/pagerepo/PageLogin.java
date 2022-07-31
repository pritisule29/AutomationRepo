package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import businessfuntions.BaseClass;

public class PageLogin extends BaseClass{
	
//	static WebDriver driver = null;
	
	static By userName = By.xpath("//*[@id=\"txtUsername\"]");
	static By password = By.xpath("//*[@id=\"txtPassword\"]");
	static By loginBtn = By.xpath("//*[@id=\"btnLogin\"]");
	
	static public void enterUserName(String uname) {
		driver.findElement(userName).sendKeys(uname);
	}
	static public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	static public void clickSignIn() {
		driver.findElement(loginBtn).click();
	}

//	static public void enterUserName(WebDriver _driver) {
//		_driver.findElement(userName).sendKeys("Admin");
//	}
//	static public void enterPassword(WebDriver _driver) {
//		_driver.findElement(password).sendKeys("admin123");
//	}
//	static public void clickSignIn(WebDriver _driver) {
//		_driver.findElement(loginBtn).click();
//	}
	
	
}
