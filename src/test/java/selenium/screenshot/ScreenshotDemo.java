package selenium.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import common.BrowserController;

public class ScreenshotDemo extends BrowserController {
	
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println(currentDate.toString());
		String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-")+"-"+currentDate.getHours();
		System.out.println(screenshotFileName);
	}
	
	public void screenshot() throws IOException {
		Date currentDate = new Date();
		System.out.println(currentDate.toString());
		String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-")+"-"+currentDate.getHours();
		System.out.println(screenshotFileName);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotFileName+".png"));
	}

	@Test
	void screenshotTest() throws IOException {
		driver.get("http://www.google.com");
		Date currentDate = new Date();
		System.out.println(currentDate.toString());
		String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-")+"-"+currentDate.getHours();
		System.out.println(screenshotFileName);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotFileName+".png"));
	}
}
