package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdowntesting2 {

	public static void main(String[] args) {

		FirefoxDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com");
		d.manage().window().maximize();
		//click register link
		d.findElement(By.linkText("REGISTER")).click();
		//identify dropdown element
		WebElement drop=  d.findElement(By.name("country"));
		 List<WebElement> items=drop.findElements(By.tagName("option"));
		 
		 System.out.println(items.size());
		 
		 for(int i=0;i<items.size();i++)
		 {
			 //get text of the links
			 String linktext=items.get(i).getText();
			 
			 
			 items.get(i).click();
			 
			 if(items.get(i).isSelected())
			 {
				 System.out.println(linktext+"----------element is working");
			 }
			 else
			 {
				 System.out.println(linktext+"----------element is  not working");
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
