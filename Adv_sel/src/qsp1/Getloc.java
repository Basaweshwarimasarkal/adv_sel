package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getloc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//input[@name='email']"));
		driver.manage().window().maximize();
		Point loc = ele.getLocation();
		System.out.println(loc);
		int x = loc.getX();
		System.out.println(x);
		int y = loc.getY();
		System.out.println(y);
		
		// TODO Auto-generated method stub

	}

}
