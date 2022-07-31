package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import businessfuntions.AccessUtil;
import businessfuntions.BaseClass;
import configuration.Config;
import utilityfunctions.UtilExcel;

public class TestLoginLogout2 extends BaseClass {
@DataProvider(name ="dataprovider1")

public Object[][] testData() {
	return new Object[][] {
		{"Admin","admin123"},{"Admin","admin123"}
	};
	
}
	@DataProvider(name ="dataprovider2")

	public Object[][] testData1() {
		return new Object[][] {
			{"Admin","admin123"},{"Admin","admin123"}
		};
		
}

@Test(dataProvider="dataprovider1")
public void testloginlogout(String UserName,String Password) throws IOException {
//		int noOfRows = UtilExcel.getRowCount();
//		for(int i=1;i<noOfRows;i++) {
					
		BaseClass.openBrowser();
//		AccessUtil.logIn(UtilExcel.getCellData(i, 0), UtilExcel.getCellData(i, 1));
		AccessUtil.logIn(UserName,Password);
//		AccessUtil.adminTab();
//		AccessUtil.addUser();
		String expecetdLabel = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
		if(expecetdLabel=="Dashboard") {
			AccessUtil.logOut();
		}else {
			System.out.println("Unable to login due to error");
		}
		
//		AccessUtil.logOut();
		BaseClass.closeBrowser();
		
		}
}
