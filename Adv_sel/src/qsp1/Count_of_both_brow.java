package qsp1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_of_both_brow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://skpatro.github.io/demo/links/");
		 driver.findElement(By.name("NewWindow")).click();
		 Thread.sleep(2000);
		 Set<String> wh = driver.getWindowHandles();
		 int count = wh.size();
		 System.out.println(count);
		 for(String whh:wh)
		 {
			 System.out.println(whh);
		 }
		 
		 
		 
	}

}
