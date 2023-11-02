package Elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath ="//div[text()='Add New']")
	private WebElement AddnewButton;
	
	@FindBy(xpath ="//div[@class='item createNewCustomer']")
	private WebElement Newcustomer;
	
	@FindBy(xpath ="//input[contains(@class,'inputFieldWithPlaceholder newNameField')]")
	private WebElement customerName;
	
	@FindBy(xpath ="//textarea[@placeholder='Enter Customer Description']")
	private WebElement description;
	
	@FindBy(xpath ="//div[text()='Create Customer']")
	private WebElement createcustomer;
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement Logout;
	
	
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public WebElement getNewcustomer() {
		return Newcustomer;
	}

	public WebElement getAddnewButton() {
		return AddnewButton;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getCreatecustomer() {
		return createcustomer;
	}

	public WebElement getLogout() {
		return Logout;
	}

}
