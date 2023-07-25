package actions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

public class MouseOperations
{
	 Actions a;
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() 
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
	  }
	
  @Test(enabled =false)
  public void moveToElement()
  {
	 driver.get("https://www.amazon.in"); 
	 
	 a = new Actions(driver);
	 
	 a.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).perform();
	 driver.findElement(By.xpath("//span[text()='Your Account'] ")).click();
  }
  
  @Test(enabled =false)
      public void dragDrop()
      {
	  driver.get("https://jqueryui.com/droppable/");
	  a = new Actions(driver);
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  
	 WebElement drag = driver.findElement(By.id("draggable"));
	  
	 WebElement drop = driver.findElement(By.id("droppable"));
	 
	// a.dragAndDrop(drag, drop).perform();
	  
	 a.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();  
      }

@Test(enabled =false)
  public void Slider() 
{
	 driver.get("https://jqueryui.com/slider/");
	  
	  a = new Actions(driver);
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	
	
	 WebElement drag = driver.findElement(By.className("ui-slider-handle"));
	
	 a.dragAndDropBy(drag, 66, 0).perform();
}
@Test(enabled =false)
public void rightclick() 
{
	 driver.get("https://jqueryui.com/slider/");
	  
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	
	
	 WebElement drag = driver.findElement(By.className("ui-slider-handle"));
	
	  a = new Actions(driver);
	  
	  a.contextClick(drag).perform();

}
@Test(enabled =false)
  public void browserSlider() throws InterruptedException
  {
	 driver.get("https://www.amazon.in");
for(int i=0;i<10;i++)
{
	 ((RemoteWebDriver)driver).executeScript("window.scrollBy(0,100)");
Thread.sleep(2000);
}
	 

  }


@Test

public void autosuggestion()
{
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Hadoop tutorial");

String val = driver.findElement(By.name("q")).getAttribute("value");

List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li/div/div[2]/div[1]/div/span"));

for(int i=0;i<list.size();i++)
{
	if(list.get(i).getText().equalsIgnoreCase(val))
	{
		list.get(i).click();
		return;
		
	}
	list= driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li/div/div[2]/div[1]/div/span"));
}




}


}
