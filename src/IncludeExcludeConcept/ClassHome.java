package IncludeExcludeConcept;

import org.testng.annotations.Test;

public class ClassHome {
	
	@Test(groups="Smoke")
	public void HomeLoanHDFC()
	{
		System.out.println("Home Loan HDFC");
	}

	@Test(groups="Regression")
	public void HomeLoanICICI()
	{
		System.out.println("Home Loan ICICI");
	}
	
	@Test
	public void HomeLoanAxis()
	{
		System.out.println("Home Loan Axis");
	}
	
	@Test
	public void HomeLoanPunjab()
	{
		System.out.println("Home Loan Punjab");
	}

}
