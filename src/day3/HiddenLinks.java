package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class HiddenLinks {

	@Test
	public void f() {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sel_10am");
		FirefoxDriver d=new FirefoxDriver(fp);
		d.get("http://google.com/");
		
		List<WebElement> link= d.findElements(By.tagName("a"));
		System.out.println("Total links are========"+link.size());
		
		int count=0;
		
		for(int i=0;i<link.size();i++)
		{
			if(! link.get(i).getText().isEmpty())
			{
				//count the Visible Links
				count++;
			}
		}
		
		System.out.println("visible Lonksa are========="+count);
		
		System.out.println("Invisible Links are========="+(link.size()-count));
		
		
	}

}




