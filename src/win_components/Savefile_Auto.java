package win_components;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Savefile_Auto {
  @Test
  public void f() throws IOException, AWTException  {
	  
	  FirefoxDriver d=new FirefoxDriver();
	  d.get("http://docs.seleniumhq.org/download/");
	  d.manage().window().maximize();
	  
	  Sleeper.sleepTightInSeconds(3);
	  //click 2.53.0 link
	  
	  d.findElement(By.linkText("2.53.0")).click();
	  
	  /* Auto IT Save File operation
	  Sleeper.sleepTightInSeconds(3);
	  Runtime.getRuntime().exec("E:\\0708\\Auto_save8.exe");  */

	  
	  Robot rb=new Robot();
	  // click TAB
	  rb.keyPress(KeyEvent.VK_TAB);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  
	  rb.delay(3000);
	  
	  //Click Enter
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  
	 
  }  
	  
}




