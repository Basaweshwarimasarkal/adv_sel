package qsp1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdownjse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0;i<3;i++)
		{
			js.executeScript("window,scrollBy(0,2000)");
			Thread.sleep(2000);
			
		}
		for(int j=0;j<3;j++)
		{
			js.executeScript("window,scrollBy(0,-2000)");
			Thread.sleep(2000);
			
		}
		
	
}
}

