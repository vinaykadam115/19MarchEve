package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import baseClass.base;
import pomClasses.Loginpage;

public class growApp extends base {
	Loginpage login;
	
	
	
  @Test
  public void validateLogin() throws InterruptedException {
	  
	  launchBrowser();																		//launch groww
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	  login=new Loginpage(driver);
	  
	  login.login_Button();																	//login click
	  login.sign_In_Button();																//sign in enter mail
	  
	  login.password_box();  Thread.sleep(500);												//enter password
	  login.submit_button();																//submit button
	  
	  
  }
}
