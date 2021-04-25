package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Screenshoot extends FailedListnerDemoTest{

	public void getScreenshoot() throws IOException {
		Date date = new Date();
		String Screenshootfilename = date.toString().replace(" ", "-").replace(":", "-");	
		File scrennshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrennshotfile, new File(".//Screenshots/"+Screenshootfilename+" .png"));
	}

}
