package Elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath ="//input[@name='username']")
	private WebElement UserNameTF;
	
	@FindBy(xpath ="//input[@name='pwd']")
	private WebElement PasswordTF;
	
	@FindBy(xpath ="//a[@id='loginButton']")
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserNameTF() {
		return UserNameTF;
	}

	public WebElement getPasswordTF() {
		return PasswordTF;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	

}
