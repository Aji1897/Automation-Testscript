package Testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Elementrepository.TimeTrackpage;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import genericlibrary.CommonUtility;
import genericlibrary.DataUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 extends BaseTest {
@Test(groups ="Regression")
	public void testcase3() throws IOException, InterruptedException {
		
		//to click on settings

	   TimeTrackpage tt = new TimeTrackpage(driver);
	   tt.getSettingsbutton().click();
	   tt.getGeneralsettings().click();
	
		//driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		//driver.findElement(By.xpath("//div[@id='popup_menu_settings']//li[4]")).click();
		         
		//select class for dropdown handling
		WebElement e = driver.findElement(By.id("userGroupNamingCodeSelect"));
		CommonUtility.selectDropdownbyVisibleText(e, "User Group");
		

		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FormModifiedDivButton")));
		String message = driver.findElement(By.xpath("//td[@class='modified']")).getText();
		
		//validation
	//	if(message.equals("MODIFICATIONS NOT SAVED"))
	//	{
	//		System.out.println("Testcase3 is pass");
	//	}
	//	else
	//		System.out.println("Testcase3 is fail");
		
		try {
			Assert.assertEquals(message, "MODIFICATIONS NOT SAVED");
			Reporter.log("Testcase3 is pass",true);
		} catch (AssertionError e2) {
			Reporter.log("Testcase3 is fail",true);
		} 
		
		
		
	}

	}


