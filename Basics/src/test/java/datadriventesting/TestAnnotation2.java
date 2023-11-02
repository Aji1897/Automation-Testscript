package datadriventesting;

import org.testng.annotations.Test;

public class TestAnnotation2 {
	@Test(priority=1)
	public void register()
	{
		System.out.println("registration done");
	}
	@Test(priority=2 )
	public void login()
	{
		System.out.println("login done");
	}
	@Test(invocationCount = 4)
	public void addproducttocart()
	{
		System.out.println("add to product done");
	}
	@Test(priority=4)
	public void placeorder()
	{
		System.out.println("place order done");
	}
}
