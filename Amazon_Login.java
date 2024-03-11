package source_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login
{
	//step1-locate each component using @findByAnnotation
	WebDriver driver;
	@FindBy(id="ap_email")//un
	WebElement un_textfield;
	
	@FindBy(id="continue")//continue
	WebElement continue_button;
	
	@FindBy(name="password")//Pwd
	WebElement pwd_textfield;
	
	@FindBy(id="signInSubmit")//signin
	WebElement signin_button;
	
	//step 2- creating separate method for each component
	
	public void un1()
	{
		un_textfield.sendKeys("monaligaikwad25.mg@gmail.com");
		
	}
	public void conti()
	{
		continue_button.click();
		
	}
	public void pwd()
	{
		pwd_textfield.sendKeys("Monali@2512");
		
	}
	public void sign()
	{
		signin_button.click();
		
	}
	
	//step 3- init componrnt using pagefactory class
	
	public Amazon_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
