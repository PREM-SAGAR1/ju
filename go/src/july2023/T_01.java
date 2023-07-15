package july2023;

public class T_01  extends BaseTest
{
	
public static void main(String[] args) throws Exception 
{
	
	init();
	
	launch("chromebrowser");
	
	navigateUrl("amazonurl");
	
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);

	driver.manage().deleteAllCookies();
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	driver.close();
	
	//driver.quit();
}
	

}