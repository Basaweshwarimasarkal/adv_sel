package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amaz {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='English']"));
		Point loc = ele.getLocation();
		System.out.println(loc);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(400,5842)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='English']")).click();
		
		
	}

}
