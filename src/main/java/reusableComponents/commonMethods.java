package reusableComponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonMethods {
	
	public void selectDropDownOptions(WebElement element, String strValuetobeSelected) throws Exception
	{
		Select DropDownValue = new Select(element);
		try {
			DropDownValue.selectByVisibleText(strValuetobeSelected);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Value is not present for webelement: "+element+" and value is to be selected is :"+strValuetobeSelected);
		}
	}
;
}
