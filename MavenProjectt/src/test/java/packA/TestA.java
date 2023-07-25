package packA;

import org.testng.annotations.Test;

public class TestA 
{
  @Test(groups = {"regression","smoke"})
  public void f() throws Exception 
  {
System.out.println("Starting Test A");
	  
	  Thread.sleep(4000);
	  
	  System.out.println("ending testA");
  }
}
