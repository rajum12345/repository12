package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String exp=  "orangehrm";
		String act=  driver.getTitle();
		System.out.println("the Actaual Title is======"+act);
		
		if(exp.equals(act))
		{
			System.out.println("launch Sucessssssssssssssss");
		}
		else
		{
			System.out.println("launch  not Sucessssssssssssssss");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
