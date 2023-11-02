package genericlibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Elementrepository.LoginPage;
import Elementrepository.TaskListPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	DataUtility du = new DataUtility();
	public WebDriver driver;
	public static WebDriver listenersDriver;
	
	@BeforeClass(alwaysRun = true)
	public void launchbrowser() throws IOException
	{
			WebDriverManager.chromedriver().setup();
		  
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		listenersDriver = driver;
		driver.manage().window().maximize();
		driver.get(du.getDataFromProperties("url"));	
	}
	@BeforeMethod(alwaysRun = true)
    public void login() throws IOException
    {
    	//driver.findElement(By.xpath("//input[@name='username']")).sendKeys(du.getDataFromProperties("un"));
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(du.getDataFromProperties("pwd"));
		//driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getUserNameTF().sendKeys(du.getDataFromProperties("un"));
		lp.getPasswordTF().sendKeys(du.getDataFromProperties("pwd"));
		lp.getLoginButton().click();
    }
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		//driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		TaskListPage tl = new TaskListPage(driver);
		tl.getLogout().click();
	}
	@AfterClass(alwaysRun = true)
	public void closethebrowser()
	{
		driver.close();
	}
}
