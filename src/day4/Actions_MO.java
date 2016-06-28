package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Actions_MO {

	public static void main(String[] args) {
		
		FirefoxDriver ff=new FirefoxDriver();
		ff.navigate().to("http://www.emirates.com");
		ff.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		WebElement src= ff.findElement(By.xpath(".//*[@id='destinations']/a"));
		 WebElement src12= ff.findElement(By.xpath(".//*[@id='book']/a/span[1]"));
		
		Sleeper.sleepTightInSeconds(3);
		Actions act=new Actions(ff);
		
		act.moveToElement(src).moveToElement(src12).build().perform();
		
		

	}

}




