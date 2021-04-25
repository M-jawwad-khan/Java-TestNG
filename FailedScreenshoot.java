package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FailedScreenshoot {

	public static WebDriver driver = null;

	@BeforeSuite
	public void launch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	@AfterSuite
	public void Close() {
		driver.close();
	}

}
