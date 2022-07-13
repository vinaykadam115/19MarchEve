package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/span") private WebElement loginButton;
	//@FindBy (xpath = "(//iframe)[1]") private WebElement signInFrame;
	@FindBy (xpath = "(//span[text()='Sign in with Google'])[2]") private WebElement signInButton;
	@FindBy (xpath = "//input[@id='login_email1']") private WebElement emailbox;
	@FindBy (xpath = "//span[text()='Continue']") private WebElement continueButton;
	@FindBy (xpath = "//input[@id='login_password1']")private WebElement passwordbox;
	@FindBy (xpath = "//span[text()='Submit']") private WebElement submitButton;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login_Button() throws InterruptedException
	{
		loginButton.click();
		Thread.sleep(2000);
	}
	
	public void sign_In_Button() throws InterruptedException
	{
		emailbox.sendKeys("vskadam2000@gmail.com"); Thread.sleep(800);
		continueButton.click();
	}
	public void password_box() throws InterruptedException
	{
		passwordbox.sendKeys("Jarvis@V12");
	}
	public void submit_button()
	{
		submitButton.click();
	}
	
	
	
	
}
