package IncludeExcludeConcept;

import org.testng.annotations.*;
public class Trial {
	
	public Trial()
	{
		System.out.println("Need to check when i will be called during TestNG");
	}

	@BeforeSuite
	public void BeforeTest()
	{
		System.out.println("Before Test is executing");
	}
	
	@Test
	public void Test()
	{
		System.out.println("Test is executing");
	}
}
