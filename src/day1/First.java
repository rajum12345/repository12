package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) throws Exception {
		//Launch App
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		
		Thread.sleep(3000);
		//enter the data into search box
		d.findElement(By.id("lst-ib")).sendKeys("selenium");
		d.findElement(By.name("btnG")).click();
		Thread.sleep(3000);
		//clear the data in the search box
		d.findElement(By.id("lst-ib")).clear();
		Thread.sleep(3000);
		d.findElement(By.id("lst-ib")).sendKeys("qtp");
		d.findElement(By.name("btnG")).click();
		
	}

}




