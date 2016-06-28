package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathCreation {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com/");
		d.manage().window().maximize();
		
		//d.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
		//d.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		d.findElement(By.xpath("//input[@id='lst-ib' and @name='q' and @type='text']"))
							.sendKeys("selenium");

	}

}






