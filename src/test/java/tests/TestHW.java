package tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagerepo.PageAddUser;
import pagerepo.PageLogin;
import pagerepo.PageLogout;

public class TestHW {
	WebDriver driver = null;
	
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\workspace\\eclipse-workspace\\AutomationFrameworkProject\\Drivers\\chromedriver_103.exe");
		this.driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}	

	public void destroy() {
		driver.close();
		driver.quit();
	}
	
//	public void test_login() {
//		PageLogin.enterUserName(driver);
//		PageLogin.enterPassword(driver);
//		PageLogin.clickSignIn(driver);
//	}
	public void test_logout() {
		PageLogout.clickWelcomeLink();
		PageLogout.clickLogoutLink();
		
	}
	public void test_addUser() {
//		PageAddUser.init(driver);
		PageAddUser.enterEmpName();
			
	}
	
//	public void suite() {
//		test_login();
//	}
		
	public static void main(String[] args) {
		TestHW test = new TestHW();
		test.init();
//		test.suite();
		test.destroy();

	}

}
