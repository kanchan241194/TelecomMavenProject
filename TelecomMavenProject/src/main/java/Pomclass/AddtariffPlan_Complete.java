package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtariffPlan_Complete {
	
	@FindBy(xpath="//h2[text()=\"Congratulation you add Tariff Plan\"]") private WebElement addtariffPlan ;
	public AddtariffPlan_Complete(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    public String AddtariffPlan_Complete()
    {
    	String actualresult=addtariffPlan.getText();
    	
		return actualresult;
    }

}
