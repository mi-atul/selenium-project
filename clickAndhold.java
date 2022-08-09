package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndhold {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("draggable"));
		 WebElement element1 = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).moveToElement(element1).release().perform();
		
		
		// Insted of dragAnddrop method we can use this
		
		System.out.println("Ececuted Sucessfully");
	}

}
