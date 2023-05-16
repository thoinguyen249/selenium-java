package ui;

import org.testng.annotations.Test;

import common.CommonDataSetup;



@Test(groups = "user-registration")
public class GroupDemoTest2 extends CommonDataSetup{
	
	
	
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
