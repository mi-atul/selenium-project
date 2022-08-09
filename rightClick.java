package ActionClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick // right click = contexClick

{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		
		Actions actions = new Actions(driver);
	    actions.contextClick().perform();
		actions.moveByOffset(100, 50).contextClick().perform(); 
		// to mover the cursor for certain lenght and then right click we use movebyoffset
		
		System.out.println("Ececuted Sucessfully");
		
		

	}

}
