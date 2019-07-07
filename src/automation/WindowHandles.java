package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Training\\Python_docs\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/Selenium/docs/sample.html");
		String currentBrowser=driver.getWindowHandle();
		String newBrowser="";
		System.out.println("current title "+driver.getTitle());
		driver.findElement(By.linkText("Yahoo")).click();
		Set<String> allBrowser = driver.getWindowHandles();
		
		//Iterate over set
		for(String s: allBrowser)
		{
			if(!s.equals(currentBrowser))
			{
				newBrowser=s;
				break;
			}
			
		}
		driver.switchTo().window(newBrowser);
		System.out.println("new title "+driver.getTitle());

	}

}
