package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class myclass2 {
  @Test
  public void Test1()
  {
  
	  System.setProperty("webdriver.chrome.driver", "V:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//This Program Modified By Kunal
		//new update
		System.out.println("hi");
		Reporter.log("hii");
		Reporter.log("hiii", true);
		Reporter.log("test1 run done.",true);
		
  
  }
}
