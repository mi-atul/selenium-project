package ActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pageDownAndUp{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_UP).perform();
	}

}
