package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAsserDemo {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 
		String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");

		String expectedink ="Customer Service";
Assert.assertTrue(actualLink.equals(expectedink),"Both links are not equal");
		
		driver.findElement(By.linkText("Customer Service")).click();
		
	
	}

}
