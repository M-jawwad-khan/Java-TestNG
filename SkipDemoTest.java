package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	
	
	@Test(enabled=false)
	public void skiptest1() {
		System.out.println("Skip Test");
	}
	@Test
	public void skiptest2() {
		System.out.println("Skip Test 2");
		throw new SkipException("Skipping this test");
	}
	Boolean datasetup = true;
	
	@Test
	public void skiptest3() {
		
		System.out.println("Skip Test 3");
		if(datasetup=true) {
			System.out.println("ExecuteTest");
		}else {
			System.out.println("Donot Execute");
			throw new SkipException("DOnot Execute Further Steps");
		}
	}

}
