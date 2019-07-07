package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Configuration;

public class LoginPage extends Configuration {
	
	
	//Webelements in Login Page
	
	@FindBy(id="txtUsername")
	 WebElement userNameField;
	
	@FindBy(id="txtPassword")
	 WebElement passwordField;
	
	@FindBy(id="btnLogin")
	 WebElement loginBtn;
	
	public HomePage login(String sUserName,String sPassword)
	{
		userNameField.sendKeys(sUserName);
		passwordField.sendKeys(sPassword);
		loginBtn.click();
		return new HomePage();
		
	}
	
	public LoginPage( )
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
