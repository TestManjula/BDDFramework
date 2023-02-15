package insurance_Motorcycle;

import org.testng.annotations.Test;

import testBase.testBase;

public class E2E_Test_Motorcycle extends testBase {
	@Test
	public void VehicleInsuranceCalc_Volvo() throws Exception
	{
		homePage.clickOnMotorcycleLink();
		vehicleData.enterVehicleData();
	
	}
	
//	@Test
//	public void VehicleInsuranceCalc_Ford()
//	{
//		homePage.clickOnMotorcycleLink();
//		
//	}

}
