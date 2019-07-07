package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Training\\Python_docs\\chromedriver.exe");
		driver=new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver", "E:\\Training\\Python_docs\\geckodriver.exe");		
	//	driver=new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		
		
		String sTitle=driver.getTitle();
		System.out.println("Title is "+sTitle);
		if(sTitle.equalsIgnoreCase("Your Store"))
		{
			System.out.println("Page load verification passed");
		}
		else
		{
			System.out.println("Page load verification failed");
			
		}
		
		String sProductEntered="Phone";
		String sQty="3";
		driver.findElement(By.name("search")).sendKeys(sProductEntered);
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		new Select(driver.findElement(By.name("category_id"))).selectByIndex(3);
		driver.findElement(By.name("sub_category")).click();
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
		if(sProductEntered.equalsIgnoreCase(sProductActual))
		{
			System.out.println("Product matches");
		}
		else
		{
			System.out.println("Product is not matches Expected :"+sProductEntered +"  Actual :"+sProductActual);
		}
		if(sQtyActual.contains((sQty)))
		{
			System.out.println("Quantity matches");
		}
		else
		{
			System.out.println("Quantity is not matches");
		}
		
	}

}
