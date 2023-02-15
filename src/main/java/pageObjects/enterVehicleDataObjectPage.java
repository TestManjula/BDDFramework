package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.testBase;

public class enterVehicleDataObjectPage extends testBase {
	
	@FindBy(id="make")
	WebElement dd_make;
	
	@FindBy(id="model")
	WebElement dd_model;
	
	@FindBy(id="cylindercapacity")
	WebElement txt_cylindercapacity;
	
	@FindBy(id="engineperformance")
	WebElement txt_engineperformance;
	
	@FindBy(id="dateofmanufacture")
	WebElement date_dateofmanufacture;
	
	@FindBy(id="numberofseatsmotorcycle")
	WebElement dd_numberofseatsmotorcycle;
	
	@FindBy(id="listprice")
	WebElement txt_listprice;
	
	@FindBy(id="annualmileage")
	WebElement txt_annualmileage;
	
	@FindBy(id="nextenterinsurantdata")
	WebElement btn_nextenterinsurantdata;
	
	public enterVehicleDataObjectPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterVehicleData() throws Exception
	{
		cm.selectDropDownOptions(dd_make, "Volvo");
//		cm.selectDropDownOptions(dd_model, "Motocycle");
//		txt_cylindercapacity.sendKeys("216");
//		txt_engineperformance.sendKeys("234");
//		date_dateofmanufacture.sendKeys("12/10/2000");
//		cm.selectDropDownOptions(dd_numberofseatsmotorcycle, "2");
//		txt_listprice.sendKeys("23000");
//		txt_annualmileage.sendKeys("35000");
		
	}
	
	public void clickNextButton()
	{
		btn_nextenterinsurantdata.click();
	}

}
