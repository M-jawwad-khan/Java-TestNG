package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {

	@Test
	public void VerifyTitle() {
		// Type 1 Asserts is used to Detect the Expected and actual result but if the
		// text case failed
		// it will stop we used the another type of assertion which is SoftAsserts
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		// Assert.assertEquals(actual, expected , "message");
		Assert.assertEquals(actualtitle, expectedtitle, "Title Doesnt same");
		driver.close();
	}

	@Test
	public void SoftAsserts() {
		// Type 2 SoftAsserts it is used to rum multiple test case if the test case
		// failed this will be not Stop
		SoftAssert softAsserts = new SoftAssert();
		String expectedtitle = " jj Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext = "Search";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		// Assert.assertEquals(actual, expected , "message");
		System.out.println("Vrifying Title");
		softAsserts.assertEquals(actualtitle, expectedtitle, "Title Doesnt same");
		System.out.println("Verifyning Text");
		softAsserts.assertEquals(actualtext, expectedtext, "Text Doesnt same");
		System.out.println("CLosed Browser");
		driver.close();
		softAsserts.assertAll();
	}

}
