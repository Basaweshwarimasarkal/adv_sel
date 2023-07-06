package qsp1;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		 Dimension tfd=new Dimension(200,300);
		 Point p=new Point(200,300);
		// driver.manage().window().setPosition(p);
		//driver.manage().window().setSize(tfd);
		// TODO Auto-generated method stub

	}

}

