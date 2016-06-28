package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Block_elements {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sel_10am");
		FirefoxDriver d=new FirefoxDriver(fp);
		d.get("http://bing.com");
		//identify the block
		WebElement blk=  d.findElement(By.id("sc_hdu"));
		//identify links from the block
		List<WebElement> items= blk.findElements(By.tagName("a"));
		System.out.println(items.size());
		
		for(int k=0;k<items.size();k++)
		{
			 String str=items.get(k).getText();
			 System.out.println(str);
		}	

	}

}
