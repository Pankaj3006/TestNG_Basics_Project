package IncludeExcludeConcept;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class ClassGold {
	
	@BeforeGroups(groups="Smoke")
	public void SmokeGroup()
	{
		System.out.println("I will run before first test method of Smoke Group");
	}
	
	@Test
	public void GoldLoanHDFC()
	{
		System.out.println("Gold Loan HDFC");
	}

	@Test(groups="Smoke")
	public void GoldLoanICICI()
	{
		System.out.println("Gold Loan ICICI");
	}
	
	@Test(groups= {"Regression","Smoke"})
	public void GoldLoanAxis()
	{
		System.out.println("Gold Loan Axis");
	}
	
	@Test
	public void GoldLoanPunjab()
	{
		System.out.println("Gold Loan Punjab");
	}

}
