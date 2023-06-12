package selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridDemo {
	
	
	
	@Test
	void chromeTest() throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		String url = "http://192.168.42.3:4444";
		WebDriver driver = new RemoteWebDriver(new URL(url), option);
		driver.get("http://google.com");
		driver.close();
	}

	
	@Test
	void edgeTest() throws MalformedURLException {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--remote-allow-origins=*");
		String url = "http://192.168.42.3:4444";
		WebDriver driver = new RemoteWebDriver(new URL(url), option);
		driver.get("http://google.com");
		driver.close();
	}

	@Test
	void fireFoxTest() throws MalformedURLException {
		System.setProperty("webdriver.edge.driver", "./driver/geckodriver.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		FirefoxOptions option = new FirefoxOptions();
		String url = "http://192.168.42.3:4444";
		WebDriver driver = new RemoteWebDriver(new URL(url), option);
		driver.get("http://facebook.com");
		driver.close();
	}

}
