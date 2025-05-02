package libraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass {
	
	public static String getdata(int rowindex,int colindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\admin\\eclipse-workspace2\\TelecomMavenProject\\TestData");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return value;
	}
	 public static void capaturescreenshot(WebDriver driver,int TestCaseID) throws IOException
	   {
		   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File dest= new File("C:\\Users\\admin\\eclipse-workspace2\\TelecomMavenProject\\Screenshot\\TCID3"+TestCaseID+".png");
		   FileUtils.copyFile(src, dest);
	   }
	public static String getpfdata(String key) throws IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\admin\\eclipse-workspace2\\TelecomMavenProject\\property2.properties");
		Properties p= new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
		
	}
	

}
