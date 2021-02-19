package IncludeExcludeConcept;

import org.testng.annotations.Test;

public class ClassPersonal {
	
	@Test
	public void PersonalLoanHDFC()
	{
		System.out.println("Personal Loan HDFC");
	}

	@Test(groups="Regression")
	public void PersonalLoanICICI()
	{
		System.out.println("Personal Loan ICICI");
	}
	
	@Test(groups="Smoke")
	public void PersonalLoanAxis()
	{
		System.out.println("Personal Loan Axis");
	}
	
	@Test
	public void PersonalLoanPunjab()
	{
		System.out.println("Personal Loan Punjab");
	}
}
