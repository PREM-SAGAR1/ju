package pack;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends BaseTest
{
	public static ExtentHtmlReporter htmlReport;
	
	public static ExtentReports report;
	
	
	public static ExtentReports getInstance()
	{
		if(htmlReport==null)
		{
			htmlReport = new ExtentHtmlReporter(projectPath+"\\HtmllReports\\report.html");
			htmlReport.config().setDocumentTitle("Auto");
			htmlReport.config().setReportName("functional");
			htmlReport.config().setTheme(Theme.STANDARD);
			
			report = new ExtentReports();
			//report.attachReporter(htmlReport);
			report.setSystemInfo("Os","Windows10");
			
			report.setSystemInfo("Tester name","Babu");
			report.setSystemInfo("Browser","Chrome");
		}
		
		
		
		
		return report;
		
	}

	

}
