package qsp1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabledtext {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ACER/Desktop/disabled.html");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String Value;
		js.executeScript("document.getElementById('a1')");
		driver.close();

}
}
