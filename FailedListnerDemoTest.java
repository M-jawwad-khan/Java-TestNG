package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedListnerDemoTest extends FailedScreenshoot{

	@Test(retryAnalyzer = ui.Retry.class)
	//@Test
	public void launchbrowser() {
		driver.get("https://www.youtube.com/watch?v=4chQnh4MQLU&list=PLL34mf651faPB-LyEP0-a7Avp_RHO0Lsm&index=76");
		Assert.assertTrue(false);
	}
}
