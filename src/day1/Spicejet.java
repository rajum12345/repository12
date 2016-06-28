package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch App
		WebDriver d=new FirefoxDriver();
		d.get("http://www.spicejet.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		//Oneway search
		
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//click leaving from
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		//click hyd
		Thread.sleep(2000);
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		//click bang
		Thread.sleep(2000);
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		//date
		Thread.sleep(2000);
		d.findElement(By.xpath("html/body/div/div[1]/table/tbody/tr[4]/td[6]/a")).click();
		//slect Adults
		Thread.sleep(2000);
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Adult"))).
													selectByVisibleText("2 Adults");
		Thread.sleep(2000);
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Child"))).
													selectByVisibleText("1 Child");
		Thread.sleep(3000);
		//click find flights
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
