package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDemo extends Commondatasetup{

	@Test(priority = 1, groups = "regression")
	public void a() {
		System.out.println("Test1");
	}

	@Test(priority = 2, groups = "regression")
	public void b() {
		System.out.println("Test 2");
		Assert.assertTrue(false);
	}

	@Test(priority = 3, groups = { "regression", "bvt" })
	public void c() {
		System.out.println("Test 3");
	}

	@Test(priority = 4, groups = "bvt")
	public void d() {
		System.out.println("Test 4");
	}

}
