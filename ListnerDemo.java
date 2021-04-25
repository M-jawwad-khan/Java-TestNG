package ui;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerDemo  extends Screenshoot implements ITestListener {

	public void onTestStart(ITestResult result) {
//		System.setProperty("org.uncommons.reportng.title", "Test RCV Report");
//		Reporter.log("Methond Name is : "  +result.getName());
		System.out.println("Test Case is Starting");
	//	Reporter.log("<a "+ getScreenshoot() "> Test Results </a>");
	}

	public void onTestSuccess(ITestResult result) {

//		Reporter.log("Status of execution is : " +result.getStatus());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test Method Name is : " +result.getName());
		try {
			getScreenshoot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.setProperty("org.uncommons.reportng.escape-output", "false");
//		Reporter.log("<a href=\"C:\\Users\\hp\\Documents\\eclipse workspace\\TestNG_Trainimg\\Screenshots\\Mon-Mar-01-02-12-30-PKT-2021.png\"> Test Results </a>");
		
	}

	public void onTestSkipped(ITestResult result) {

	}
	public void onTestStop(ITestResult result) {
		System.out.println("Test Case  Stop");
		
	}
	
}
