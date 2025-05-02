package libraryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Baseclass {

	public  WebDriver driver;
	public  void initialbroser() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace2\\TelecomMavenProject\\Browser\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-extensions");
		opt.addArguments("--start-maximized");
		driver=new ChromeDriver();
		driver.get(Utilityclass.getpfdata("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.MILLISECONDS);
		//Thread.sleep(2000);
		
	}
}
