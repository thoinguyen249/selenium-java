package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "dataSet", dataProviderClass = DataProviderDemo.class)
	public void test(String username, String password) {
		System.out.println(username + "====" + password);
	}
	
	@Test(dataProvider = "create")
	public void test1(String username, String password, String test) {
		System.out.println(username + "====" + password + "===" + test);
	}


}
