package ui;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commondatasetup {
	
	@BeforeSuite
	public void datasetup() {
		System.out.println("Database Connected");
	}
	
	@AfterSuite
	public void datasettrap() {
		System.out.println("DataBase Disconected");
	}

}
