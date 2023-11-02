package Elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackpage {
	@FindBy(xpath ="//table[@class='navTable']//td//div[@id='container_tasks']")
	private WebElement Taskbutton;
	
	@FindBy(xpath ="//a[text()='Types of Work']")
	private WebElement Typeofwork;
	
	@FindBy(xpath ="//div[@class='menuTable']/div[2]")
	private WebElement settingsbutton;
	
	@FindBy(xpath ="//div[@id='popup_menu_settings']//li[4]")
	private WebElement generalsettings;
	
	
	

	public TimeTrackpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSettingsbutton() {
		return settingsbutton;
	}

	public WebElement getTaskbutton() {
		return Taskbutton;
	}
	
	 public WebElement getTypeofwork() {
			return Typeofwork;
		}

		public WebElement getGeneralsettings() {
			return generalsettings;
		}


}
