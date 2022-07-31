package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1Testng {
	@BeforeSuite(groups= {"Sanity","Regression"})
	public void beforeSuite() {
		System.out.println("Before test suite is running");
	}
	@AfterSuite(groups= {"Sanity","Regression"})
	public void afterSuite() {
		System.out.println("After test suite is running");
	}
	@BeforeClass(groups= {"Sanity","Regression"})
	public void beforeclass() {
		System.out.println("Before class is running in Test1");
	}
	@AfterClass(groups= {"Sanity","Regression"})
	public void afterclass() {
		System.out.println("After class is running ");
		
	}
	@BeforeTest(groups= {"Sanity","Regression"})
	private void beforetest() {
		System.out.println("Before test");
	}
	@AfterTest(groups= {"Sanity","Regression"})
	public void aftertest() {
		System.out.println("After test");
	}
	@BeforeMethod(groups= {"Sanity","Regression"})
	public void beforeMethod() {
		System.out.println("Before Method is excuted");
	}
	@AfterMethod(groups= {"Sanity","Regression"})
	public void afterMethod() {
		System.out.println("After Method is excuted");
	}
		
	@Test(groups= {"Sanity","Regression"})
	private void test1() {
		System.out.println("Test1 is running");
	}
	@Test(groups= {"Regression"})
	private void test2() {
		System.out.println("Test2 is running");
	}
}
