package qsp1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_conf_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 driver.findElement(By.name("cusid")).sendKeys("admin");
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
		 Alert a = driver.switchTo().alert();
		 String tt = a.getText();
		 System.out.println(tt);
		 a.dismiss();
		// TODO Auto-generated method stub

	}

}
