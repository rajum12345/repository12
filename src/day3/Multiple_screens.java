package day3;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;

public class Multiple_screens {

	public static void main(String[] args) throws IOException {

		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com");
		
		
		List<WebElement> items= d.findElements(By.tagName("a"));
		System.out.println(items.size());
		
		for(int k=0;k<items.size();k++)
		{
			String linkname= items.get(k).getText();
			
			 items.get(k).click();
			 
			 File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("D:\\123\\"+linkname+".jpg"));
				
				d.navigate().back();
				
				items= d.findElements(By.tagName("a"));	
			 
		}	

	}

}










