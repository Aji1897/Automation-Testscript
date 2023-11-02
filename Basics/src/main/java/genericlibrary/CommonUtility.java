package genericlibrary;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility {
	
	public static int randomNumber() 
	{
		Random r = new Random();
		int number = r.nextInt(1000);
		return number;
	}
	
	public static String getTextFromAlert(WebDriver driver) 
	{
		Alert alt =  driver.switchTo().alert();
		String altText = alt.getText();
		return altText;	
	}
	
	public static void clickonokAlert(WebDriver driver)
	{
		Alert alt =  driver.switchTo().alert();
		alt.accept();
	}
	
	public static void selectDropdownbyVisibleText(WebElement dropdown, String visibleText) 
	{
		Select s = new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}
}
