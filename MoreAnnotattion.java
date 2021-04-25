package ui;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
//run krna hai group ko left click krkay run as
public class MoreAnnotattion extends Commondatasetup{
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Run this beforeClass");
	}
	
	@BeforeGroups(value="regression")
	public void BeforeGroup() {
		System.out.println("Run this method before regression");
	}
	
	@org.testng.annotations.AfterGroups(value="regression")
	public void AfterGroups() {
		System.out.println("Run this After Groups");
	}
	
	@Test(priority = 1, groups = "regression")
	public void a() {
		System.out.println("Test1");
	}

	@Test(priority = 2, groups = "regression")
	public void b() {
		System.out.println("Test 2");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("Run this AfterClass");
	}

}
