package selenium.netlify;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.BrowserController;

public class Netlify extends BrowserController {
	@BeforeMethod
	public void setup() {
		this.driver.get("https://trytestingthis.netlify.app/");
	}
	@AfterMethod
	public void closeBrowser() {
		this.driver.close();
	}
	@Test(priority=1)
	public void alertTest() throws InterruptedException {
		WebElement dropDown = this.driver.findElement(By.id("option"));
		Select selectObject = new Select(dropDown);
		Thread.sleep(2000);
		selectObject.selectByIndex(1);
		Thread.sleep(2000);
		selectObject.selectByValue("option 3");
		Thread.sleep(2000);
		selectObject.selectByVisibleText("Option 2");
		Thread.sleep(2000);		
	}

	@Test(priority=2)
	public void sliderTest() throws InterruptedException {
		WebElement color = this.driver.findElement(By.id("a"));
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(color, 50, 50).perform();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) this.driver;
		jse.executeScript("javascript:document.getElementById('a').value=100");
		Thread.sleep(4000);
		
	}
}
