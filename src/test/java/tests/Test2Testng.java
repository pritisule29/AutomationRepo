package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2Testng {
	@BeforeClass(groups= {"Sanity","Regression"})
	public void beforeclas() {
		System.out.println("Before class is running in Test2");
	}
	@AfterClass(groups= {"Sanity","Regression"})
	public void afterclass() {
		System.out.println("After class is running ");
		
	}
	@BeforeMethod(groups= {"Sanity","Regression"})
	public void beforeMethod() {
		System.out.println("Before1 Method is excuted");
	}
	@AfterMethod(groups= {"Sanity","Regression"})
	public void afterMethod() {
		System.out.println("After2 Method is excuted");
	}
	@Test(groups= {"Sanity","Regression"})
	private void test3() {
		System.out.println("Test3 is running");
	}
	@Test(groups= {"Sanity"})
	private void test4() {
		System.out.println("Test4 is running");

	}
	

}
