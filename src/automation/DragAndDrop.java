package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Training\\Python_docs\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//mouse over
		Actions action=new Actions(driver);
		WebElement resizable=driver.findElement(By.linkText("Resizable"));
		action.moveToElement(resizable).build().perform();
		

		//drag and drop

		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement draggable=driver.findElement(By.cssSelector("#draggable"));
		WebElement droppable=driver.findElement(By.cssSelector("#droppable"));
	
		action.dragAndDrop(draggable, droppable).build().perform();
		//driver.quit();
		
		//action.contextClick(target)
		
	}

}
