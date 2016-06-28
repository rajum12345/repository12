package win_components;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;





public class Fileupload_Auto {
  @Test
  public void f() throws IOException, InterruptedException, AWTException {
	  
	  FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		Thread.sleep(3000);
		driver.findElement(By.id("photo")).click();
		Thread.sleep(3000);
		// Window operation 
		//Runtime.getRuntime().exec("E:\\0708\\reg_fileup.exe");
		
		Robot rb=new Robot();
		  // click TAB
		  rb.keyPress(KeyEvent.VK_L);
		  rb.keyRelease(KeyEvent.VK_L);
		
		  rb.keyPress(KeyEvent.VK_I);
		  rb.keyRelease(KeyEvent.VK_I);
		  
		  rb.keyPress(KeyEvent.VK_N);
		  rb.keyRelease(KeyEvent.VK_N);
		  
		  rb.keyPress(KeyEvent.VK_K);
		  rb.keyRelease(KeyEvent.VK_K);
		  
		  rb.keyPress(KeyEvent.VK_S);
		  rb.keyRelease(KeyEvent.VK_S);
		  
		  rb.keyPress(KeyEvent.VK_PERIOD);
		  rb.keyRelease(KeyEvent.VK_PERIOD);
		  
		  rb.keyPress(KeyEvent.VK_X);
		  rb.keyRelease(KeyEvent.VK_X);
		  
		  rb.keyPress(KeyEvent.VK_L);
		  rb.keyRelease(KeyEvent.VK_L);
		  
		  rb.keyPress(KeyEvent.VK_S);
		  rb.keyRelease(KeyEvent.VK_S);
		  
		  rb.keyPress(KeyEvent.VK_X);
		  rb.keyRelease(KeyEvent.VK_X);
		  
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
  }
  
  
}









