package packA;

import org.testng.annotations.Test;

public class TestA2 
{
	
    @Test(groups = {"regression","sanity"})

  public void f() throws Exception 
  {
System.out.println("Starting Test A2");
	  
	  Thread.sleep(4000);
	  
	  System.out.println("ending testA2");
  }
}
