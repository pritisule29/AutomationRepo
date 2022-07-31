package businessfuntions;

import pagerepo.PageAddUser;
import pagerepo.PageAdmin;
import pagerepo.PageLogin;
import pagerepo.PageLogout;

public class AccessUtil {
	public static void logIn(String uname, String pwd) {
		PageLogin.enterUserName(uname);
		PageLogin.enterPassword(pwd);
		PageLogin.clickSignIn();
		
	}
	public static void logOut() {
		PageLogout.clickWelcomeLink();
		PageLogout.clickLogoutLink();
				
	}
	public static void adminTab() {
		PageAdmin.clickAminTab();
		PageAdmin.clickUserMgmnt();
		PageAdmin.clickUser();
		PageAdmin.enetrUserName();
		PageAdmin.selectUserRole();
		PageAdmin.enterEmpName();
		PageAdmin.selectstatus();
		PageAdmin.clickSearchBtn();
		
	}
	public static void addUser() {
		PageAddUser.clickAddBtn();
		PageAddUser.selectUserRole();
		PageAddUser.enterEmpName();
		PageAddUser.enterUserName();
		PageAddUser.selectStatus();
		PageAddUser.enterPassword();
		PageAddUser.enterConfirmPassword();
		PageAddUser.clicksaveBtn();
		
	}

}
