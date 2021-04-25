package ui;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependecies {
	
	@Test
	public void userregistration1() {
		System.out.println("registration 1");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods="userregistration1",alwaysRun=true)
	public void userregistration2() {
		System.out.println("reg 2");
	}

	@Test
	public void userregistration3() {
		System.out.println("registration 3");
	}
	
	@Test(dependsOnGroups="test2")
	public void Test2() {
		System.out.println("Test2");
	}

	@Test(groups="test2")
	public void Test1(){
		System.out.println("Test1");
	}
	@Test
	public void Test3(){
		System.out.println("Test 3 ");
	}
}
