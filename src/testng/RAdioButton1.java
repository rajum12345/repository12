package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RAdioButton1 {
  @Test
  public void f() {
	  
	  FirefoxDriver ff=new FirefoxDriver();
		ff.navigate().to("http://echoecho.com/htmlforms10.htm");
		ff.manage().window().maximize();
		
		
		WebElement block= ff.findElement(By.xpath("html ......ble/tbody/tr/td"));
	    List<WebElement> radio=	block.findElements(By.name("group1"));
	    
	    System.out.println(radio.size());
	    
	    for(int i=0;i<radio.size();i++)
	    {
	    	System.out.println(radio.get(i).getAttribute("value")+"-------"+
	    					radio.get(i).getAttribute("checked"));
	    	
	    }   
  }
  
  
  
  
  
  
}












