package datadriventesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithDataprovider {
	@Test(dataProvider ="Datasupply" )
	public void Testcase(String userName, String password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}
	
	
	@DataProvider(name="Datasupply")
	public Object Datasupply()
	{
		Object [] [] arr = new Object [3] [2];
		arr[0][0]="admin";
		arr[0][1]="manager";
		arr[1][0]="admin1";
		arr[1][1]="manager1";
		arr[2][0]="admin2";
		arr[2][1]="manager2";
		return arr;
	}

}
