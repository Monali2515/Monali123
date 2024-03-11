package source_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Sort_product 
{
	//Step 1 location the element using @FindBy annotation
	WebDriver driver;
	@FindBy(xpath="(//i[@ class='a-icon a-icon-checkbox'])[3]")
	WebElement brand1;
	
	@FindBy(xpath="(//i[@ class='a-icon a-icon-checkbox'])[4]")
	WebElement brand2;
	
	@FindBy(xpath="(//i[@ class='a-icon a-icon-checkbox'])[5]")
	WebElement brand3;
	
	//sep2 Create saperate method for each element
	
	public void asian()
	{
		brand1.click();
	}
	public void campus()
	{
		brand2.click();
	}
	public void sparx()
	{
		brand3.click();
	}
	// step3 initialize each elemt using pagefactory clas
	
	public Amazon_Sort_product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
