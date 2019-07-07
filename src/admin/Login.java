package admin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Login {
	static WebDriver driver;
	String sProductEntered;
	String sQty;
	
	@BeforeSuite(groups={"init"})
	@Parameters({"browser"})
	public void beforeSuite(String sBrowser) {
		if(sBrowser.equalsIgnoreCase("chrome"))
		{	System.setProperty("webdriver.chrome.driver", "E:\\Training\\Python_docs\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(sBrowser.equalsIgnoreCase("firefox"))
		{	System.setProperty("webdriver.gecko.driver", "E:\\Training\\Python_docs\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		else if(sBrowser.equalsIgnoreCase("ie"))
		{	System.setProperty("webdriver.ie.driver", "E:\\Training\\Python_docs\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{	System.out.println("Sorry,not a valid browser:-"+sBrowser);
		}
	}
	@Test(groups={"smoke","regression"},priority=1)
	public void searchFunctionality() {
		String sTitle=driver.getTitle();
		Assert.assertEquals(sTitle, "Your Store");
		sProductEntered="Phone";
		sQty="3";
		driver.findElement(By.name("search")).sendKeys(sProductEntered);
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		new Select(driver.findElement(By.name("category_id"))).selectByIndex(3);
		driver.findElement(By.name("sub_category")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//img[@title='iPhone']")).isDisplayed(), true);
		//driver.findElement(By.xpath("//img[@title='iPhone']")).click();
	}

	@Test(groups={"regression"},priority=2)

	public void cartverification() {

		driver.findElement(By.xpath("//img[@title='iPhone']")).click();
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys(sQty);
		driver.findElement(By.id("button-cart")).click();
		//Thread.sleep(5000);
		driver.findElement(By.id("cart")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='cart']/ul/li[1]/table//tr/td[2]"), "iPhone"));
		String sProductActual=driver.findElement(By.xpath("//div[@id='cart']/ul/li[1]/table//tr/td[2]")).getText();
		String sQtyActual=driver.findElement(By.xpath("//div[@id='cart']/ul/li[1]/table//tr/td[3]")).getText();
		//System.out.println(sProductActual);
		Assert.assertEquals(sProductActual.toLowerCase(), sProductEntered.toLowerCase());
		Assert.assertEquals(sQtyActual.contains(sQty),true);

	}


	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	@Parameters({"url"})
	@BeforeTest(groups={"init"})
	public void beforeTest(String sUrl) {
		driver.get(sUrl);
	}

	@AfterTest
	public void afterTest() {
		//logout code
	}


	@AfterSuite(groups={"init"})
	public void afterSuite() {
		driver.quit();
	}

}
