package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Extendsdataprovider {
	
//	@Test(dataProvider = "dataset")
//	@DataProvider
//	public Object[][] dataset() {
//		Object[][] dataset = new Object[4][2];
//		//4rows 3 columns
//		dataset[0][0] = "user1";
//		dataset[0][1] = "pass1";
//		dataset[1][0] = "user2";
//		dataset[1][1] = "pass2";
//		dataset[2][0] = "user3";
//		dataset[2][1] = "pass3";
//		dataset[3][0] = "user4";
//		dataset[3][1] = "pass4";
//		return dataset;
//	}
//	
//	@DataProvider(name = "dataset1")
//	public Object[][] dataset1(){
//		return new Object[][] {
//			{"user","pass","test"},{"user1","pass1","test1"}
//		};
//	}

	
	@DataProvider(name = "dataset2")
	public Object[][] dataset2(Method m){
		
		Object[][] testdata = null;
		if(m.getName().equals("test1"))
		{
			testdata = new Object[][] { 
				{"user","pass","test"},
				{"user1","pass1","test1"}
			};
		}
		else if(m.getName().equals("test")) {
			testdata =new Object[][] {
				{"user","pass"},
				{"user1","pass1"}
			};
		}
		return testdata;
	}
}
