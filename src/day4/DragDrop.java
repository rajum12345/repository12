package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DragDrop {

	public static void main(String[] args) {

		FirefoxDriver ff=new FirefoxDriver();
		ff.navigate().to("http://jqueryui.com/droppable/");
		ff.manage().window().maximize();
		
		ff.switchTo().frame(0);
		Sleeper.sleepTightInSeconds(3);
		WebElement src= ff.findElement(By.id("draggable"));
		
		WebElement targ=ff.findElement(By.id("droppable"));
		
		Actions ab=new Actions(ff);
		
		Sleeper.sleepTightInSeconds(3);
		ab.dragAndDrop(src, targ).build().perform();
		
		
		
		
	}

}






