package ExtentReport;

import org.testng.ITestListener;
import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportclass implements ITestListener{
	ExtentSparkReporter hmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void startReport()
	{
		String timestamp=new SimpleDateFormat("yyyy.mm.dd hh.mm.ss").format(new Date());
		String reortname="Automation_Project-"+timestamp+".html";
		hmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\"+reortname);
		reports=new ExtentReports();
		reports.attachReporter(hmlReporter);
		
		reports.setSystemInfo("Device name", "Pradip-Workstation");
		reports.setSystemInfo("OS", "Windows 10 Pro");
		reports.setSystemInfo("Browser", "Chrome");
		
		hmlReporter.config().setDocumentTitle("Extent Listener report");
		hmlReporter.config().setReportName("This is automation exerise report");
		hmlReporter.config().setTheme(Theme.DARK);
	}
		public void onStart(ITestContext Result)
		{
			startReport();
			System.out.println("On start method invoked....");
		}
		
		public void onFinish(ITestContext Result)
		{
			System.out.println("On finished method invoked....");
			reports.flush();
		}
		
		public void onTestFailure(ITestResult Result)
		{
			System.out.println("Name of the test method failed:"+Result.getName());
			test = reports.createTest(Result.getName());
			test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is:"+ Result.getName() ,ExtentColor.RED));

			String screenshotpath=System.getProperty("user.dir")+"//Screenshot//"+Result.getName()+".png";
			File screenshotfile= new File(screenshotpath);
			 
			   {
				   if(Result.getStatus()==ITestResult.FAILURE)
					{
					   test.fail("CapturedScreenshot is below:"+test.addScreenCaptureFromPath(screenshotpath));
					}
				   
			   }
			
	     }
		
		public void onTestSkipped(ITestResult Result)
		{
			System.out.println("Name of the test method skipped:"+Result.getName());
			test = reports.createTest(Result.getName());
			test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is:"+ Result.getName() ,ExtentColor.YELLOW));
			
	     }
		
		public void onTestSuccess(ITestResult Result)
		{
			System.out.println("Name of the test method successed:"+Result.getName());
			test = reports.createTest(Result.getName());
			test.log(Status.PASS, MarkupHelper.createLabel("Name of the success test case is:"+ Result.getName() ,ExtentColor.GREEN));
			
	     }
		
		public void onTestFailedButwithinSuccessPercentage(ITestResult Result)
		{
			
		}

}
