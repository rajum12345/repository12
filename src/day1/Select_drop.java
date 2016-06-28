package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Select_drop {

	public static void main(String[] args) throws InterruptedException {
		
		//create profile obj
		ProfilesIni pr=new ProfilesIni();
		
		//create firefox profile obj
		FirefoxProfile fp=pr.getProfile("sel_10am");
		
		WebDriver d=new FirefoxDriver(fp);
		d.get("http://amazon.in");
		
		d.manage().window().maximize();
		Thread.sleep(3000);
		//identify the Dropdown 
		d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		//search box
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("wings of fire");
		Thread.sleep(3000);
		d.findElement(By.className("nav-input")).click();
		

	}

}






