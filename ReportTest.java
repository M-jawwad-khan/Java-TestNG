package ui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest extends FailedScreenshoot{

	@Test(priority = 1)
	public void ReportTest1() {
		Reporter.log("This is test1");
		driver.get("https://www.youtube.com/watch?v=-dJ5rsaD-GM&list=PLL34mf651faPB-LyEP0-a7Avp_RHO0Lsm&index=79");
		driver.manage().window().maximize();
		System.out.println("Test1");
		Assert.assertTrue(false);
	}

	@Test(priority = 2)
	public void ReportTest2() {
		System.out.println("Test 2");
	}

	@Test(priority = 3)
	public void ReportTest3() {
		System.out.println("Test 3");
	}
}
