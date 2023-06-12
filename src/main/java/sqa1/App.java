package sqa1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	 
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello");
		String driverPath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_area");
		List<WebElement> search = driver.findElements(By.tagName("a"));
		System.out.println(search.size());
		Iterator<WebElement> itr = search.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
//		search.sendKeys("Md Rashed Karim"+Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
