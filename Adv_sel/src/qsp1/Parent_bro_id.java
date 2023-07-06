package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_bro_id {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://skpatro.github.io/demo/links/");
		 String p_id = driver.getWindowHandle();
		 System.out.println(p_id);

	}

}
