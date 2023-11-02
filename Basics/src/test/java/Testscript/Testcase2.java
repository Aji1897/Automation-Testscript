package Testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Elementrepository.NewTypeofworkpage;
import Elementrepository.TimeTrackpage;
import Elementrepository.TypeofWorkpage;

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

public class Testcase2 extends BaseTest {
   @Test(groups ="Functional")
	public void testcase2() throws IOException, InterruptedException {
		
		//to click on settings
	   TimeTrackpage tt = new TimeTrackpage(driver);
	   tt.getSettingsbutton().click();
       tt.getTypeofwork().click();
       
       TypeofWorkpage wp = new TypeofWorkpage(driver);
       wp.getTypeofWork().click();
	   
       NewTypeofworkpage nt = new  NewTypeofworkpage(driver);
       nt.getNametextfield().sendKeys("ajith");
       nt.getTypeofworkbutton().click();
       
	    
	    //driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		//driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		//driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		Thread.sleep(3000);
        
		//driver.findElement(By.id("name")).sendKeys("Ajith");
		//driver.findElement(By.xpath("//td[@class='formbuttonpane']//input[@type='button']")).click();
		Thread.sleep(3000);

		String actualAlertText = CommonUtility.getTextFromAlert(driver);
		
		//validation
		//if(actualAlertText.equals("Are you sure you want to cancel the Type of Work creation?"))
	//	{
	//		System.out.println("Testcase2 is pass");
	//	}
	//	else
	//		System.out.println("Testcase2 is fail");
		
		try {
			Assert.assertEquals(actualAlertText, "Are you sure you want to cancel the Type of Work creation?");
			Reporter.log("Testcase2 is pass",true);
		} catch (AssertionError e) {
			Reporter.log("Testcase2 is fail",true);
		} 
		
		//To handle Alert
		CommonUtility.clickonokAlert(driver);
		
		
	}

}
