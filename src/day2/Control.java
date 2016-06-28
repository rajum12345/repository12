package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Control {
	@Test
	public void f() {
		//Launch  App
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		//identify the no.of links
		List<WebElement> links=	driver.findElements(By.tagName("a"));
		//Total size of links
		System.out.println("total links========"+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			//Text of links
			String str= links.get(i).getText();
			System.out.println(str);
		}
	
	}

}




