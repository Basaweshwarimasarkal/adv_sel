package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filepopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ACER/Desktop/abc.html");
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.name("upload file"));
		 ele.sendKeys("C:\\Users\\ACER\\Desktop\\ct.txt\\");
		// TODO Auto-generated method stub

	}

}
