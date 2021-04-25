package ui;


import org.testng.annotations.Test;

public class DataProviderDemo2 {
	
	@Test(dataProvider = "dataset2",dataProviderClass=Extendsdataprovider.class)
	public void test(String Username,String password) {
		System.out.println("User Name"+Username+"\n password"+password+"");
	}
	
	@Test(dataProvider = "dataset2",dataProviderClass=Extendsdataprovider.class)
	public void test1(String Username,String password,String test) {
		System.out.println("User Name "+Username+"\npassword "+password+"Test "+test+"");
	}
	
	
//	@DataProvider(name = "dataset1")
//	public Object[][] dataset1(){
//		return new Object[][] {
//			{"user","pass","test"},{"user1","pass1","test1"}
//		};
//	}
//	@DataProvider
//	public Object[][] dataset() {
//		Object[][] dataset = new Object[4][2];
//		//4rows 3 colimns
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

}
