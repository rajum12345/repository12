package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Radiobutton2 {
	
  @Test
  public void f() {
	  
	  FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
	
		//xpath of the complete block of 2 radio groups
		
		WebElement block=driver.findElement(By.xpath("html/......./tbody/tr/td"));
		//loop for groups	
		for(int k=1;k<=2;k++)
			{
			   List<WebElement> radio=block.findElements(By.name("group"+k));
			  //loop for click 3 radio btns
			   for(int i=0;i<radio.size();i++)
		 	   {
				   radio.get(i).click();
				   for(int j=0;j<radio.size();j++)
				   {
					   System.out.println(radio.get(j).getAttribute("value")+"---"
							   	+radio.get(j).getAttribute("checked"));
				   }
				   System.out.println("########################");
				}
			}
			
  }
  

  
  
  
  
  
}

