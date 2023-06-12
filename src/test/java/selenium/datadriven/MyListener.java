package selenium.datadriven;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import selenium.screenshot.ScreenshotDemo;

public class MyListener extends ScreenshotDemo implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("==== onTestStart...");
	  }
	public void onStart(ITestContext arg) {
		System.out.println("==== onStart...");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("=== onTestSuccess...");
	  }
	
	public void onFinish(ITestContext arg) {
		System.out.println("=== onFinish...");
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			screenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=== onTestFailure...");
	}
}
