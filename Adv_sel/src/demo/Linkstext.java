package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkstext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		 List<WebElement> img = driver.findElements(By.xpath("//a"));
		int x = img.size();
		System.out.println(x);
		for(int i=0;i<x;i++)
		{
			WebElement we = img.get(i);
			String t = we.getText();
			String tt = we.getAttribute("href");
			//System.out.println(t);
			System.out.println(tt);
		
		}
		driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
