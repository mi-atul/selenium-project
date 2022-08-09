package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveActionClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
		driver.get("https://www.actitime.com/");
		WebElement element = driver.findElement(By.linkText("Pricing"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element, 100, 0);
		actions.perform();
		
		 System.out.println("Executed Successfully");

	}

}
