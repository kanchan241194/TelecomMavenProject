package TestClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;

import Pomclass.AccessDetail_Page;
import Pomclass.AddCustomer;
import Pomclass.AddCustomer_Page;
import Pomclass.AddTariffPlan;
import Pomclass.AddTariffPlan_Page;
import Pomclass.AddtariffPlan_Complete;
import libraryFiles.Baseclass;
import libraryFiles.Utilityclass;

public class GuruTelecom_Test extends Baseclass  {
	
	int TestCaseID;
	AddCustomer add;
	AddCustomer_Page addcustomerpage;
	AccessDetail_Page accesspage;
	AddTariffPlan addtraffplan;
	AddTariffPlan_Page addtariffplanpage;
	AddtariffPlan_Complete completepage;
	
	 @BeforeClass
	   public void loginbrowser() throws IOException, InterruptedException
	   {
		   initialbroser();

		   add=new 	AddCustomer(driver);
		   addcustomerpage= new AddCustomer_Page(driver);
		   accesspage= new AccessDetail_Page(driver);
		   addtraffplan= new AddTariffPlan(driver);
		   addtariffplanpage= new AddTariffPlan_Page(driver);
		   completepage=new AddtariffPlan_Complete (driver);
		   
	   }
	   @BeforeMethod
	   public void gurutelecompage() throws IOException, InterruptedException
	   {
		   
		 driver.manage().timeouts().implicitlyWait(100,TimeUnit.MILLISECONDS);
		 Thread.sleep(1000);
		 add.AddCustomereclick();
		 Thread.sleep(1000);
		 //addcustomerpage.AddCustomer_Pagedclick();
		 Thread.sleep(1000);
		 addcustomerpage.AddCustomer_Pagefname(Utilityclass.getpfdata("FNAME")); 
		 Thread.sleep(1000);
		 addcustomerpage.AddCustomer_Pagelname(Utilityclass.getpfdata("LNAME"));
		 Thread.sleep(1000);
		 addcustomerpage.AddCustomer_Pageemail(Utilityclass.getpfdata("EMAIL")); 
		 Thread.sleep(1000);
		 addcustomerpage.AddCustomer_Pagemessage(Utilityclass.getpfdata("ADRESS")); 
		 Thread.sleep(1000);
		 addcustomerpage.AddCustomer_Pagemobilenumber(Utilityclass.getpfdata("MOBILENUMBER")); 
		 Thread.sleep(1000);
		 addcustomerpage.AddCustomer_Pagesubmit(); 
		 Thread.sleep(1000);
		 accesspage.AccessDetail_Pagehomeclick();
		 Thread.sleep(1000);
		 addtraffplan.AddTariffPlanpclick();
		 Thread.sleep(1000);
		 addtariffplanpage.AddTariffPlan_Pagemonthlyrental(Utilityclass.getpfdata("MONTHLYRETAL"));
		 Thread.sleep(1000);
		 addtariffplanpage.AddTariffPlan_Pagelocalmin(Utilityclass.getpfdata("FREELOCALMIN"));
		 Thread.sleep(1000);
		 addtariffplanpage.AddTariffPlan_Pageintermin(Utilityclass.getpfdata("FREEINTERNATIONALMIN"));
		 Thread.sleep(1000);
		 addtariffplanpage.AddTariffPlan_Pagesmspack(Utilityclass.getpfdata("SMSPACK"));
		 Thread.sleep(1000);
		 addtariffplanpage.AddTariffPlan_Pagemincharges(Utilityclass.getpfdata("LOCALCHARGES"));
		 Thread.sleep(1000);
		 addtariffplanpage.AddTariffPlan_Pageminchargesintercharges(Utilityclass.getpfdata("INTERCHARGES"));
		 Thread.sleep(1000);
		 addtariffplanpage.AddTariffPlan_Pagesmschargess(Utilityclass.getpfdata("SMSPERCHARGES"));
		 Thread.sleep(1000);
		 addtariffplanpage.AddTariffPlan_Pagesubclick();
		
		 
	   }
	   @Test
	   public void verifiedid() throws EncryptedDocumentException, IOException
	   {
		   TestCaseID=300;
		   String actualresult=completepage.AddtariffPlan_Complete();
		   String exceptedresult=Utilityclass.getpfdata("COMPLETE");
		   Assert.assertEquals(actualresult, exceptedresult,"Failed:Both Results are Different");
	   }
	   @AfterMethod
	   public void logoutapp(ITestResult s1) throws IOException
	   {
		   if(s1.getStatus()==ITestResult.FAILURE)
			{
			   Utilityclass.capaturescreenshot(driver,TestCaseID);
			}
		   
	   }
	   @AfterClass
	   public void logoutbrowser() throws InterruptedException
	   {
		   Thread.sleep(2000);
		   
		   driver.quit();
	   }
	}

