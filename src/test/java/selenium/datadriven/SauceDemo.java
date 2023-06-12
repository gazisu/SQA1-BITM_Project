package selenium.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.BrowserController;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(MyListener.class)
public class SauceDemo extends BrowserController {
	
	@BeforeMethod
	void setup() {
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	void cleaning() {
		driver.close();
		driver.quit();
	}
	
	
	@Test(dataProviderClass = ExcelDataProvider.class, dataProvider="excel-user-data", description = "User Login Test")
	void loginTest(String username, String password) throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		Boolean isDisplayed = driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
		Assert.assertTrue(isDisplayed);
	}
	
}
