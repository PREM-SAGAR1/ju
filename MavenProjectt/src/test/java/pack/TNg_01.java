package pack;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNg_01 extends BaseTest
{
	 @BeforeMethod
	  @Parameters("browser")

	  public void startProcess(String bType) throws Exception
	 {
		 System.out.println("before method");
		  init();
	        test = rep.createTest("Tc_004");
	        test.log(Status.INFO,"\"Init the properties files..\"");
	        
	        
		
		launch("chromebrowser");
		test.log(Status.PASS,"Launching the browser :-" +p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.FAIL,"Navigated to url : "+childProp.getProperty("amazonurl"));
	  }
  @Test
  public void amazon()
  {
	  System.out.println("Amazon test method");
	  selectOption("amazondropdown_id","Books");
		
		test.log(Status.PASS,"Selected the option Books by using the locator :-"+orProp.getProperty("amazondropdown_id"));
		
		typeText("amazontextbox_id","Harry Potter");
		test.log(Status.PASS,"Entered the text harry potter by suing the locator :-"+orProp.getProperty("amazontextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS,"Clicked the element bybusing the locator :-"+orProp.getProperty("amazonsearchbutton_xpath")); 
  }
 

  @AfterMethod
  public void endProcess() 
  {
	  rep.flush();
	  driver.quit();
  }

}
