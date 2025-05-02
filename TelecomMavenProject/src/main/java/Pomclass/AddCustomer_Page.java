package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer_Page {

	//@FindBy(xpath="//input[@id=\"done\"]") private WebElement dclick;
	@FindBy(xpath="//input[@id=\"fname\"]") private WebElement fname;
	@FindBy(xpath="//input[@id=\"lname\"]") private WebElement lname;
	@FindBy(xpath="//input[@id=\"email\"]") private WebElement email;
	@FindBy(xpath="//textarea[@id=\"message\"]") private WebElement message;
	@FindBy(xpath="//input[@id=\"telephoneno\"]") private WebElement mobilenumber;
	@FindBy(xpath="//input[@name=\"submit\"]") private WebElement submit;

	public AddCustomer_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//public void AddCustomer_Pagedclick()
	{
	//	dclick.click();
	}


	public void AddCustomer_Pagefname(String fnamevalue)
	{
		fname.sendKeys(fnamevalue);
	}


	public void AddCustomer_Pagelname(String lnamevalue)
	{
		lname.sendKeys(lnamevalue);
	}


	public void AddCustomer_Pageemail(String emailvalue)
	{
		email.sendKeys(emailvalue);
	}

	
	public void AddCustomer_Pagemessage(String messagevalue)
	{
		message.sendKeys(messagevalue);
	}

	
	public void AddCustomer_Pagemobilenumber(String mobilenumbervalue)
	{
		mobilenumber.sendKeys(mobilenumbervalue);
	}

	public void AddCustomer_Pagesubmit()
	{
		submit.click();
	}

	
}
