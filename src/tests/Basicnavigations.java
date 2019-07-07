package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.Configuration;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;

public class Basicnavigations extends Configuration{

	
	LoginPage objLogin;
	HomePage objHome;
	AdminPage objAdmin;
	
	@BeforeTest
	public void login()
	{
		objLogin=new LoginPage();
		objHome=objLogin.login("admin", "admin123");
	}
	
	@Test
	public void verifyAdminFunctionality() {
		objHome.verifyHomePage();
		objAdmin=objHome.navigateToAdminPage();
		
		
		
		
		
		objHome=objAdmin.navigateBack();
		
	}
	
	@Test
	public void verifyPimFunctionality() {

		objHome.navigateToPIMPage();

	}
}
