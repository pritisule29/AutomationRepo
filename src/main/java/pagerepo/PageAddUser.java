package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import businessfuntions.BaseClass;

public class PageAddUser extends BaseClass{
//	static WebDriver driver = null;
	
//	public static void init(WebDriver _driver) {
//		driver = _driver;
//	}
	
	public static void clickAddBtn() {
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
	}
	public static void selectUserRole() {
		Select userRole = new Select(driver.findElement(By.xpath("//*[@id=\"systemUser_userType\"]")));
		userRole.selectByIndex(1);
	}
	public static void enterEmpName() {
		driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys("Akshay");
	}
	public static void enterUserName() {
		driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys("Akas1");
	}
	public static void selectStatus() {
		Select status1 = new Select(driver.findElement(By.xpath("//*[@id=\"systemUser_status\"]")));
		status1.selectByIndex(0);
	}
	public static void enterPassword() {
		driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys("akas123");
	}
	public static void enterConfirmPassword() {
		driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys("akas123");
	}
	public static void clicksaveBtn() {
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
	}
	
}
