package source.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Facebook 
{
	WebDriver driver;
	//step1-locate each component using @findByAnnotation
	@FindBy(id="email")
	WebElement emailid_tf;
	
	@FindBy(id="pass")
	WebElement password_tf;
	
	@FindBy(name="login")
	WebElement login_button;
	
	//step 2- creating separate method for each component
	
	public void email_un()
	{
		emailid_tf.sendKeys("monaligaikwad25.mg@gmail.com");
		
	}
	public void pwd()
	{
		password_tf.sendKeys("Monali@2512");
	}
	public void login()
	{

		login_button.click();
		
	}
	
	//step 3- init componrnt using pagefactory class
	public Login_Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
}
