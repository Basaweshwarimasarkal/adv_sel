package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchtextfield {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		 List<WebElement> cbox = driver.findElements(By.xpath("//input"));
		int x =cbox.size();
		System.out.println(x);
		for(int i=0;i<x;i++)
		{
			WebElement w=cbox.get(i);
			w.click();
		}
		for(int i=x-1;i>=0;i--)
		{
			WebElement w=cbox.get(i);
			w.click();
		}
		driver.close();
		

	}

}
