package BOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.HomePage;
import POM.LoginPage;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		
	    //LoginPage lpg = new LoginPage(driver);
	   // lpg.DisplayLoginPage("admin","manager" );
		
		new LoginPage(driver).DisplayLoginPage("admin","manager").HomePage();
	    
	   //PageFactory.initElements(driver, lpg);
	   // lpg.getUsernamtextfield().sendKeys("admin1");
	   // driver.navigate().refresh();
	    //lpg.getUsernamtextfield().sendKeys("admin");
	  //  lpg.getPasswordtextfield().sendKeys("manager");
	  //  lpg.getLoginbuttton().click();
	    
        HomePage hp = new HomePage(driver);
        hp.HomePage();
       // PageFactory.initElements(driver, hp);
       // hp.getLogoutbutton().click();
	}

}   // NoSuchElementException (look into the matter)
