package selenium.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import common.BrowserController;

public class ScrollingDemo extends BrowserController {
	JavascriptExecutor jse;
	
	@BeforeMethod
	void setUp() {
		this.driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_area");
		jse = (JavascriptExecutor) driver;
	}
	@Test
	void scrollTest() throws InterruptedException {
		this.jse.executeScript("window.scrollBy(0, document.body.scrollHeight)", "");
		Thread.sleep(2000);
	}
	
	@Test
	void scrollTest1() throws InterruptedException {
		this.jse.executeScript("window.scrollBy(0, document.body.scrollHeight)", "");
		Thread.sleep(2000);
		WebElement countryList = driver.findElement(By.id("Countries_and_dependencies_by_area"));
		this.jse.executeScript("arguments[0].scrollIntoView();", countryList);
		Thread.sleep(2000);
	}

}
