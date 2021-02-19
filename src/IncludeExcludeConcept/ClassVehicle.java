package IncludeExcludeConcept;

import org.testng.annotations.Test;

public class ClassVehicle {
	
	@Test(groups="Smoke")
	public void VehicleLoanHDFC()
	{
		System.out.println("Vehicle Loan HDFC");
	}

	@Test(groups="Regression")
	public void VehicleLoanICICI()
	{
		System.out.println("Vehicle Loan ICICI");
	}
	
	@Test
	public void VehicleLoanAxis()
	{
		System.out.println("Vehicle Loan Axis");
	}
	
	@Test
	public void VehicleLoanPunjab()
	{
		System.out.println("Vehicle Loan Punjab");
	}

}
