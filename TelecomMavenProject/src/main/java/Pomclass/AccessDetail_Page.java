package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessDetail_Page {
	

	@FindBy(xpath="//a[@class=\"button\"]") private WebElement homeclick;
	

	public AccessDetail_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void AccessDetail_Pagehomeclick()
	{
		homeclick.click();
	}

}
