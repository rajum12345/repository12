package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {

	public static void main(String[] args) throws Exception{
		
		//Launch App
		WebDriver d=new FirefoxDriver();
		d.get("h....ensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		//Login APP
		
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin");
		d.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		Thread.sleep(3000);
		
		//Logout App
		
		d.findElement(By.linkText("Welcome Admin")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		//close App
		
		d.quit();
	}

}






