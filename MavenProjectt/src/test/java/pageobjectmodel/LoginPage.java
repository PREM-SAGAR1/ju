package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//a[@id='nav-link-accountList']")public WebElement signIN;
	@FindBy(id="ap_email") public  WebElement userEmail;
    @FindBy(id="continue") public WebElement SubmitContinue;
    @FindBy(xpath="//span[contains(text(),'We cannot find an account with that mobile number')]") public WebElement loginerror;


    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void login()
    {
    	signIN.click();
    	userEmail.sendKeys("9848022338");
    	
    	SubmitContinue.click();	
    }
    
    
    public String verifyErrorMessage()
    {
    	return loginerror.getText();
    }

}
