package ui;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTtitle {
	String username = "YOUR_LAMBDATEST_USERNAME";
	String accesskey = "YOUR_LAMBDATEST_ACCESS_KEY";

	@Test
	public void name() {
		SoftAssert softAssert = new SoftAssert();
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		String actualTitle = driver.getTitle();
		System.out.println("Verify title");
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
//		assertEquals(actualTitle, expectedTitle);

		String searchInput = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("Value");
		System.out.println("Verify search");
		AssertJUnit.assertEquals(searchInput, "Search");
//		assertEquals(searchInput, "Search");
		softAssert.assertAll();

		driver.close();
	}

}
