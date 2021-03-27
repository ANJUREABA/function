package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Browser//chromedriver.exe");
		ChromeDriver objC = new ChromeDriver();
		objC.get("http://cookbook.seleniumacademy.com/Alerts.html");
		objC.findElement(By.id("simple")).click();
		Thread.sleep(3000);
		objC.switchTo().alert().accept();
		objC.findElement(By.id("confirm")).click();
		objC.switchTo().alert().dismiss();
		objC.findElement(By.id("prompt")).click();
		objC.switchTo().alert().sendKeys("haloo test");
		objC.switchTo().alert().accept();
		
		
		
	}

}
