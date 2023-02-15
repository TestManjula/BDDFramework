package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class enterInsurantDataPageObjects {
	
	@FindBy(id="enterinsurantdata")
	WebElement link_enterInsurantData;
	
	
	
	
	public void clickOnEnterInsurantData()
	{
		link_enterInsurantData.click();
	}

}
