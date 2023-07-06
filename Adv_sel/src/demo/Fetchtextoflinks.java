package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchtextoflinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		 List<WebElement> link = driver.findElements(By.xpath("//a"));
		int x =link.size();
		System.out.println(x);
		for(WebElement w:link)
		{
			String t = w.getText();
			System.out.println(t);
		}
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
