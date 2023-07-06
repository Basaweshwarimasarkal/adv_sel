package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("basava");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name='email']")).clear();
		   
		  
		  
		  
		  
		// TODO Auto-generated method stub

	}

}
