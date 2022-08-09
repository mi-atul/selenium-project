package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	    WebElement element = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	    WebElement element1 = driver.findElement(By.id("column-3"));
	    
	    
	    Actions actions = new Actions(driver);
	    
	    actions.dragAndDrop(element, element1);
	    actions.perform();
	    
		 System.out.println("Executed Successfully");
	}

}
