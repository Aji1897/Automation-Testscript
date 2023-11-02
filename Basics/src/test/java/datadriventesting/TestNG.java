package datadriventesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeSuite
	public void connectionToServer()
	{
		System.out.println("connected to server");
	}
	@BeforeTest
	public void connectionToDatabase()
	{
		System.out.println("connected to database");
	}
	@BeforeClass
	public void LaunchingBrowser()
	{
		System.out.println("browser launched");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("login done");
	}
	@Test
	public void Testcase()
	{
		System.out.println("hello");
	}
	@Test
	public void Testcase02()
	{
		System.out.println("good morning");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout done");
	}
	@AfterClass
	public void ClosingBrowser()
	{
		System.out.println("browser closed");
	}
	@AfterTest
	public void disconnectFromDatabase()
	{
		System.out.println("Database disconnected");
	}
	@AfterSuite
	public void disconnectFromServer()
	{
		System.out.println("server disconnected");
	}
}
