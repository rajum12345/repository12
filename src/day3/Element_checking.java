package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Element_checking {

	@Test
	public void f() {

		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		//it returns html source code of the webpage
		String webpage= d.getPageSource();
		System.out.println(webpage);
				
		if(webpage.contains("rajani kanth"))
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("element is not  present");
		}
		
	}

}




