package datadriventesting;

import org.testng.annotations.Test;

public class Testannotationattribute {
	
	@Test(dependsOnMethods ="registration")
	
	
	public void login()
	{
		System.out.println("login done");
	}
	@Test
	public void registration()
	{
		System.out.println("registration done");
	}

}
