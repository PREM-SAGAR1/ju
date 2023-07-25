package packB;

import org.testng.annotations.Test;

public class TestB
{
	
  @Test
  public void f() throws Exception
  {
	  System.out.println("Starting Test B");
	  
	  Thread.sleep(4000);
	  
	  System.out.println("ending testB");
  }
}
