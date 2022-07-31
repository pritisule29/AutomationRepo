package tests;

import java.io.IOException;

import org.openqa.selenium.By;

import businessfuntions.AccessUtil;
import businessfuntions.BaseClass;
import configuration.Config;
import utilityfunctions.UtilExcel;

public class TestLoginLogout extends BaseClass {

	public static void main(String[] args) throws IOException {
		int noOfRows = UtilExcel.getRowCount();
		for (int i = 1; i < noOfRows; i++) {

			BaseClass.openBrowser();
			System.out.println(Config.getPropertyValue("username"));
			System.out.println(Config.getPropertyValue("password"));
//		AccessUtil.logIn(UtilExcel.getCellData(i, 0), UtilExcel.getCellData(i, 1));
			AccessUtil.logIn(Config.getPropertyValue("username"), Config.getPropertyValue("password"));
//		AccessUtil.adminTab();
//		AccessUtil.addUser();
			String expecetdLabel = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
			if (expecetdLabel == "Dashboard") {
				AccessUtil.logOut();
			} else {
				System.out.println("Unable to login due to error");
			}

//		AccessUtil.logOut();
			BaseClass.closeBrowser();
		}
	}

}
