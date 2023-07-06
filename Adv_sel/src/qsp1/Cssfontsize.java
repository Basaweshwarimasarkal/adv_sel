package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssfontsize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//input[@name='email']"));
		driver.manage().window().maximize();
		String size = ele.getCssValue("font-size");
		System.out.println(size);
		
		
		
		// TODO Auto-generated method stub

	}

}
