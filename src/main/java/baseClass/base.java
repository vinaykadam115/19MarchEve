package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	protected WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "V:\\Velocity\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://groww.in/");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
