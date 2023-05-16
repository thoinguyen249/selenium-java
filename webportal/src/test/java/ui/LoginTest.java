package ui;

import org.testng.annotations.Test;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	boolean datasetup = true;
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Run this before class");
	}
	
	@BeforeGroups(value = "regression")
	public void beforeGroup()
	{
		System.out.println("Run this before regression");
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@AfterTest
	public void logout()
	{
		System.out.println("Logout to application");
	}
	
	@BeforeMethod
	public void connectToDb() {
		System.out.println("DB connected");
	}
	@AfterMethod
	public void disconnectToDb() {
		System.out.println("DB disconnected");
	}
	
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Success");
		if (datasetup == true) {
			System.out.println("Executed");
		}
		else {
			System.out.println("Not execute");
			throw new SkipException("Do not execute furhter steps");

		}
	}
	 @Test(priority = 2, groups = "regression")
	public void test2()
	{
		System.out.println("Failed");
		throw new SkipException("Skip this test base on condition");
	}

}
