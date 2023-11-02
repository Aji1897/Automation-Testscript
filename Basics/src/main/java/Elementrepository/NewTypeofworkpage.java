package Elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTypeofworkpage {
	
	@FindBy(id ="name")
	private WebElement Nametextfield;
	
	@FindBy(xpath ="//td[@class='formbuttonpane']//input[@type='button']")
	private WebElement Typeofworkbutton;
	
	
	public NewTypeofworkpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getNametextfield() {
		return Nametextfield;
	}

	public WebElement getTypeofworkbutton() {
		return Typeofworkbutton;
	}

}
