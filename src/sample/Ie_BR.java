package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie_BR {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://gmail.com");

	}

}
