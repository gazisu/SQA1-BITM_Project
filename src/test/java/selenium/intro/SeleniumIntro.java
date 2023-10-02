package selenium.intro;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIntro {


    ChromeDriver driver;

//	@Test
//	void runOnChromeWithDriverManager() {
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com/");
//		driver.close();
//		driver.quit();
//	}
//
//	@Test
//	void runOnChrome() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shohel\\Desktop\\ProjectControl\\Driver\\chromedriver-win64\\chromedriver.exe");
//		this.driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		List<WebElement> search = driver.findElements(By.tagName("a"));
//		System.out.println(search.size());
//		Iterator<WebElement> itr = search.iterator();

//		while(itr.hasNext()) {
////			System.out.println(itr.next().getText());
//			itr.next().click();
//		}


//		search.sendKeys("Md Rashed Karim"+Keys.ENTER);
//		Thread.sleep(200000);
//		driver.close();
//		driver.quit();
		
//	}
@Test
void runOnChrome() throws InterruptedException {

//    ChromeDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shohel\\Desktop\\ProjectControl\\Driver\\chromedriver-win64\\chromedriver.exe");
	this.driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(2500);
}


//    @BeforeMethod
//
//    public void webdriversetups() {
//
//        WebDriverManager.chromedriver().setup();
//        this.drivers= new ChromeDriver();
//
//    }
//    @Test
//    void runOneChrome() throws InterruptedException {
//        ChromeDriver drivers = new ChromeDriver();
//        drivers.get("https://www.amazon.com/");
//        Thread.sleep(2500);
//
//    }
//    @AfterMethod
//    public void Close(){
//        this.drivers.close();
//    }
//	@Test
//	void runOnFirefox() throws InterruptedException {
//		System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://www.google.comm/");
//		Thread.sleep(1000000);
//		driver.close();
//
//	}
	
//	@Test
//	void runOnEdge() throws InterruptedException {
//		String driverPath = "./driver/msedgedriver.exe";
//		System.setProperty("webdriver.edge.driver", driverPath);
//		driver = new EdgeDriver();
//		driver.get("https://www.google.com/");
//		Thread.sleep(200000);
//		driver.close();
//
//	}
	
//	@Test
//	void failCase() {
//		Assert.fail();
//	}

}
