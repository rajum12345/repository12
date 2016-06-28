package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver ff=new FirefoxDriver();
		ff.navigate().to("http://google.com");
		ff.manage().window().maximize();
		
		WebElement element= ff.findElement(By.linkText("Gmail"));
		
		Actions abc=new Actions(ff);
		
		abc.doubleClick(element).build().perform();
		  //  (  OR  )
		
		Thread.sleep(3000);
		//abc.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		
		
	}

}







