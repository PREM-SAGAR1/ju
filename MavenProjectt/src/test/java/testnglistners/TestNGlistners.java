package testnglistners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNGlistners implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test started Running : "+result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		
		
	}

	public void onTestFailure(ITestResult result) {
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	

}
