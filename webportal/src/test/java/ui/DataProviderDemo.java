package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderDemo {

	@Test(dataProvider = "dataset", dataProviderClass = DataProviderDemo.class)
	public void test(String username, String password) {
		System.out.println(username + "====" + password);
	}
	
	public Object[][] dataSet1() {

		return new Object[][] { { "username", "password", "test" }, { "username1", "password1", "test1" },
				{ "username2", "password2", "test2" } };

	}

	@Test(dataProvider = "create")
	public Object[][] dataSet() {

		Object[][] dataset = new Object[4][2];

		// first row
		dataset[0][0] = "user1";
		dataset[0][1] = "pass1";

		// second row
		dataset[1][0] = "user2";
		dataset[1][1] = "pass2";

		// third row
		dataset[2][0] = "user3";
		dataset[2][1] = "pass3";

		// fourth row
		dataset[3][0] = "user4";
		dataset[3][1] = "pass4";

		return dataset;
	}

}
