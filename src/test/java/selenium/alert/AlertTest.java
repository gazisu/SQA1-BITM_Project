package selenium.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.BrowserController;

public class AlertTest extends BrowserController{
	@BeforeMethod
	public void setup() {
		this.driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	}
	@AfterMethod
	public void closeBrowser() {
		this.driver.close();
	}
	@Test(priority=1)
	public void alertTest() throws InterruptedException {
		this.driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("You successfully clicked an alert")) {
			System.out.println("You successfully clicked an alert");
		}
	}
	@Test(priority=2)
	public void alertConfirmOkTest() throws InterruptedException {
		this.driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("You clicked: Ok")) {
			System.out.println("You clicked: Ok");
		}
	}
	@Test(priority=3)
	public void alertConfirmCacelTest() throws InterruptedException {
		this.driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("You clicked: Cancel")) {
			System.out.println("You clicked: Cancel");
		}
	}
	@Test(priority=4)
	public void alertPromptTest() throws InterruptedException {
		this.driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Rashed");
		alert.accept();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("You entered: Rashed")) {
			System.out.println("You entered: Rashed");
		}
	}
}
