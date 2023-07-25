package pack;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TN_002 extends BaseTest
{
	

  @Test
  public void f() 
  {
		driver.get("https://www.facebook.com");
 
  }
  
  @BeforeMethod
  @Parameters("browser")

  public void beforeMethod(String bType) throws Exception
  {
	  
			 System.out.println("before method");
			  init();
		        test = rep.createTest("Tc_004");
		        test.log(Status.INFO,"\"Init the properties files..\"");
		        
		        launch("bType");
				test.log(Status.PASS,"Launching the browser :-" +p.getProperty("chromebrowser"));  
			
			
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}
