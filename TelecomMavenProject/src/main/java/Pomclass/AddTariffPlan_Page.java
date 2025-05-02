package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTariffPlan_Page {
	
	@FindBy(xpath="//input[@id=\"rental1\"]") private WebElement monthlyrental;
	@FindBy(xpath="//input[@id=\"local_minutes\"]") private WebElement localmin ;
	@FindBy(xpath="//input[@id=\"inter_minutes\"]") private WebElement intermin ;
	@FindBy(xpath="//input[@id=\"sms_pack\"]") private WebElement  smspack;
	@FindBy(xpath="//input[@id=\"minutes_charges\"]") private WebElement mincharges;
	@FindBy(xpath="//input[@id=\"inter_charges\"]") private WebElement intercharges ;
	@FindBy(xpath="//input[@id=\"sms_charges\"]") private WebElement smscharges;
	@FindBy(xpath="//input[@name=\"submit\"]") private WebElement subclick;

	public AddTariffPlan_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void AddTariffPlan_Pagemonthlyrental(String monthlyrentalvalue)
	{
		monthlyrental.sendKeys(monthlyrentalvalue);
	}


	public void AddTariffPlan_Pagelocalmin(String localminvalue)
	{
		localmin.sendKeys(localminvalue);
	}


	public void AddTariffPlan_Pageintermin(String interminvalue)
	{
		intermin.sendKeys(interminvalue);
	}

	
	public void AddTariffPlan_Pagesmspack(String smspackvalue)
	{
		smspack.sendKeys(smspackvalue);
	}

	
	public void AddTariffPlan_Pagemincharges(String minchargesvalue)
	{
		mincharges.sendKeys(minchargesvalue);
	}

	public void AddTariffPlan_Pageminchargesintercharges(String interchargesvalue)
	{
		intercharges.sendKeys(interchargesvalue);
	}
	
	public void AddTariffPlan_Pagesmschargess(String smschargesvalue)
	{
		smscharges.sendKeys(smschargesvalue);
	}
	
	
	public void AddTariffPlan_Pagesubclick()
	{
		subclick.click();
	}


}
