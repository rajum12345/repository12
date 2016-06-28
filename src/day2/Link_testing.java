package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class Link_testing {

	@Test
	public void f() {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("sel_10am");
		FirefoxDriver d=new FirefoxDriver(fp);
		d.get("http://google.com/");
		
		 List<WebElement> links=d.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 for(int i=0;i<links.size();i++)
		 {
			//IF the text is not empty 
			 if(! links.get(i).getText().isEmpty())
			 { 
			 links.get(i).click();
			 String str= d.getCurrentUrl();
			 System.out.println(str);
			 d.navigate().back();
			 
			 links= d.findElements(By.tagName("a"));
			 }
		 }
		 
		
	}

}




