package qsp1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Childpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links");
		driver.findElement(By.name("NewWindow")).click();
		 Set<String> id = driver.getWindowHandles();
		 int count = id.size();
		System.out.println(count);
		for(String wh:id)
		{
			System.out.println(wh);
		}
		// TODO Auto-generated method stub

	}

}
