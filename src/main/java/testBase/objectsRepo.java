package testBase;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageObjects;
import pageObjects.enterVehicleDataObjectPage;
import reusableComponents.commonMethods;

public class objectsRepo {
	public static WebDriver driver;
	public static HomePageObjects homePage;
	public commonMethods cm = new commonMethods();
	public static enterVehicleDataObjectPage vehicleData;
	

}
