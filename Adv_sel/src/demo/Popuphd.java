package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuphd {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//text[text()='Date']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='31']")).click();
		// TODO Auto-generated method stub

	}

}
