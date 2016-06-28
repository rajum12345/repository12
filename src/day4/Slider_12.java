package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Slider_12 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/slider/#default");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		Sleeper.sleepTightInSeconds(3);
		// xpath for slider element
		WebElement src=  d.findElement(By.xpath(".//*[@id='slider']/span"));
		
		int y=  src.getLocation().y;
		
		Actions act=new Actions(d);
		
		Sleeper.sleepTightInSeconds(3);
		act.dragAndDropBy(src, 100, y).build().perform();
		
	}

}






