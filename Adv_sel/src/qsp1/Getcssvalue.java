package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//input[@name='email']"));
		driver.manage().window().maximize();
		int h = ele.getSize().getHeight();
		System.out.println(h);
		int w = ele.getSize().getWidth();
		System.out.println(w);
		
		// TODO Auto-generated method stub

	}

}
