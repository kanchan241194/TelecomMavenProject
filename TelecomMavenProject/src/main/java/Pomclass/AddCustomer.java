package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	
	@FindBy(xpath="//*[@id=\"one\"]/div/div[1]/div[1]/h3/a") private WebElement eclick;
	

	public AddCustomer (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void AddCustomereclick()
	{
		eclick.click();
	}


}
