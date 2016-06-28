package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Checkboxes {
  @Test
  public void f() {
	  
	  FirefoxDriver ff=new FirefoxDriver();
		ff.navigate().to("http://echoecho.com/htmlforms09.htm");
		ff.manage().window().maximize();
		
		 WebElement block= ff.findElement(By.xpath("html/b......e/tbody/tr/td"));
		 List<WebElement> checks= block.findElements(By.name("option1"));
		 
		 System.out.println(checks.size());
		 
		 for(int i=0;i<checks.size();i++)
		 {
			 System.out.println(checks.get(i).getAttribute("name")+"------"
					 		+checks.get(i).getAttribute("checked"));
		 }
		
		
  }
}




