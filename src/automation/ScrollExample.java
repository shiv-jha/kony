package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Training\\Python_docs\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		
		


	}

}
