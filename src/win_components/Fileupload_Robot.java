package win_components;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fileupload_Robot {
	@Test
	public void fileUpload() throws IOException, AWTException, InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.toolsqa.com/automation-practice-form/");

  //code to copy the path into system clipboard

		
		
		
		StringSelection path=new StringSelection("E:\\0708\\Anant\\xyz.txt");
		
		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
		
		driver.findElement(By.id("photo")).click();
		Thread.sleep(1000);
		
        Robot r=new Robot();
		
        r.delay(2000);
		
		//performing paste operation ctrl+v

        r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.delay(2000);	
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
