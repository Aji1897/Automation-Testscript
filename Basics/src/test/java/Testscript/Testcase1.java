package Testscript;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Elementrepository.TaskListPage;
import Elementrepository.TimeTrackpage;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import genericlibrary.CommonUtility;
import genericlibrary.DataUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(genericlibrary.Listeners_Implementation.class)
public class Testcase1 extends BaseTest {
  
	@Test(groups ="Smoke")
	public void testcase1() throws IOException, InterruptedException {
				
		String customerName ="Ajith"+CommonUtility.randomNumber();
		String description ="jspiders"+CommonUtility.randomNumber();
		//to create customer
		TimeTrackpage tt = new TimeTrackpage(driver);
		tt.getTaskbutton().click();
	    
		
		TaskListPage tl = new TaskListPage(driver);
		tl.getAddnewButton().click();
		tl.getNewcustomer().click();
		tl.getCustomerName().sendKeys(customerName);
		tl.getDescription().sendKeys(description);
		tl.getCreatecustomer().click();
		
		//driver.findElement(By.xpath("//table[@class='navTable']//td//div[@id='container_tasks']")).click();
		//driver.findElement(By.xpath("//div[text()='Add New']")).click();
		//driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();


		//driver.findElement(By.xpath("//input[contains(@class,'inputFieldWithPlaceholder newNameField')]")).sendKeys(customerName);
		//driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(description);
		//driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(4000);
		
		//to fetch the customer name
		String actualCustomerName = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div[1]")).getText();
	    
		//validation
	//	if(actualCustomerName.equals(customerName))
	//	{
		//	System.out.println("testcase 1 is pass");
	//	}
	//	else
	//		System.out.println("testcase 2 is pass");
		
		try 
		{
		Assert.assertEquals(actualCustomerName, customerName);
		Reporter.log("testcase 1 is pass" , true);
		}
		catch (AssertionError e) {
			Reporter.log("testcase 1 is fail");
		}
		
	}

}
