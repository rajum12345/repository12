package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dynamic_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://yahoo.com");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		//identify the search box
		d.findElement(By.xpath(".//*[@id='UHSearchBox']")).sendKeys("selenium");
		
		Thread.sleep(3000);
		//identify the dropdown items
		List<WebElement>  links=d.findElements(By.
				xpath("//*[contains(@id,'ui_3_12_0_1_14666')]/a"));
		Thread.sleep(3000);
		System.out.println(links.size());
		
		//click first link (selenium tutorial)
		links.get(0).click();

	}

}



