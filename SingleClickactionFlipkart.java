package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleClickactionFlipkart {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement element = driver.findElement(By.xpath("//div[text()='More']"));
		
		
		Actions actions = new Actions(driver);  // 
		actions.moveToElement(element);   // it is non static method
		
		actions.perform();        // it is required otherwise action class will not work
		driver.findElement(By.xpath("//div[text()='Download App']")).click();
		
		  
		
	    System.out.println("Executed Successfully");
	}

}
