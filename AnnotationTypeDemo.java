package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTypeDemo {

	@BeforeTest
	public void BeforeTesting() {
		System.out.println("Start testing");
	}

	@BeforeMethod
	public void ConnectedtoDataBase() {
		System.out.println("Connected");
	}

	@AfterMethod
	public void DisconectedToDataBase() {
		System.out.println("Disconnected");
	}

	@Test(priority = 2, description = "this is login test")
	public void logouttest() {
		System.out.println("Logouttest");
	}

	@Test(priority = 1, description = "this is test")
	public void Logintest() {
		System.out.println("Logintest");
	}

	@AfterTest
	public void AfterTesting() {
		System.out.println("testing End");
	}

}
