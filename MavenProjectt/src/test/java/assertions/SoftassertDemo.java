package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftassertDemo {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();

		 
		 String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");

			String expectedink ="Customer Services";
			
			SoftAssert s = new SoftAssert();
			//s.assertEquals(actualLink, expectedink);
			s.assertEquals(actualLink.equals(expectedink),"link are not equal");
			
			s.assertTrue(false, "ERR1");
			s.assertTrue(true, "ERR2");

			s.assertTrue(false, "ERR3");

			s.assertTrue(false, "ERR4");

			
			
			
			
			driver.findElement(By.linkText("Customer Service")).click();

			s.assertAll();
	}

}
