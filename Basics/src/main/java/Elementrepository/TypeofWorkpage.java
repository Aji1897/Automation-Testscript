package Elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypeofWorkpage {
	
	@FindBy(xpath ="//span[text()='Create Type of Work']")
	private WebElement TypeofWork;
	
	
	public TypeofWorkpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTypeofWork() {
		return TypeofWork;
	}
	

}
