package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTesting {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://amazon.com");
		d.manage().window().maximize();
		
		//identify the drop down
		
		WebElement  drop=	d.findElement(By.id("searchDropdownBox"));
		List<WebElement> items= drop.findElements(By.tagName("option"));
		
		System.out.println(items.size());
		
		
		for(int i=0;i<items.size();i++)
		{
			System.out.println(items.get(i).getText());
		}
	
	}

}
