package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.Configuration;

public class HomePage extends Configuration{
	
	@FindBy(id="welcome")
	 WebElement welcomeTxt;
	
	@FindBy(id="menu_admin_viewAdminModule")
	 WebElement adminLink;
	
	@FindBy(id="menu_pim_viewPimModule")
	 WebElement pimLink;
	
	
	
	public void verifyHomePage()
	{
		String sText=welcomeTxt.getText();
		Assert.assertEquals(sText, "Welcome Admin");
	}
	
	public AdminPage navigateToAdminPage()
	{
		adminLink.click();
		return new AdminPage();
	}
	
	public void navigateToPIMPage()
	{
		pimLink.click();
	}
	
	public HomePage( )
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
