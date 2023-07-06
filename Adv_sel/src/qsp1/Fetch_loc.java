package qsp1;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fetch_loc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		TreeSet<String> l = new TreeSet<String>(Collections.reverseOrder());
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		for(WebElement w:opt)
		{
			String text = w.getText();
			l.add(text);
		}
	
		for(String l1:l)
		{
			System.out.println(l1);
		}
		
		
		
		 driver.close();
		// TODO Auto-generated method stub

	}

}
