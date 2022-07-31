package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import businessfuntions.BaseClass;

public class PageAdmin extends BaseClass {
//	static WebDriver driver = null;
	
	public static void clickAminTab() {
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
	}
	public static void  clickUserMgmnt() {
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
	}
	public static void  clickUser() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/ul/li/a")).click();
	}
	public static void  enetrUserName() {
		driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userName\"]")).sendKeys("adash");
	}
	public static void selectUserRole() {
		Select userRole = new Select(driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userType\"]")));
		userRole.selectByValue("2");
	}
	public static void  enterEmpName() {
		driver.findElement(By.xpath("//*[@id=\"searchSystemUser_employeeName_empName\"]")).sendKeys("\"Ananya Dash");
		
	}
	public static void  selectstatus() {
		Select status1 = new Select(driver.findElement(By.xpath("//*[@id=\"searchSystemUser_status\"]")));
		status1.selectByIndex(1);
	}
	public static void  clickSearchBtn() {
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
	}

}
