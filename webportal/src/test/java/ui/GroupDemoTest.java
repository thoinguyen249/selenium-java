package ui;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


@Test(groups = "user-registration")
public class GroupDemoTest {
	
	@Test(priority = 1, groups = "regression")
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Logout to application");
	}
	
	@Test(groups = {"regression", "smoke"})
	public void connectToDb() {
		System.out.println("DB connected");
	}
	
	@Test
	public void disconnectToDb() {
		System.out.println("DB disconnected");
	}
	
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Success");
	}
	 @Test(priority = 2)
	public void test2()
	{
		System.out.println("Failed");
	}

}
