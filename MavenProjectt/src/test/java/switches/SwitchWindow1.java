package switches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow1 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("---disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com");
		
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println(driver.getTitle());
		
		while(!driver.findElement(By.xpath("")).isDisplayed())
		{
			driver.findElement(By.xpath("(//button[@class='slick-next slick-arrow'])[1]")).click();
	
		}
		
		driver.findElement(By.xpath("")).click();

	}

}
