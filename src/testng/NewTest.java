package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test(priority=0)
  public void f() {
	  System.out.println("second");
  }
  
  @Test(priority=1)
  public void a(){
	  System.out.println("first");
  }
  
  @Test(priority=2)
  public void z(){
	  System.out.println("third");
  }
  @BeforeMethod
  public void beforeTest() {
	  System.out.println("START");
  }

  @AfterMethod
  public void afterTest() {
	  System.out.println("STOP");
  }

}
