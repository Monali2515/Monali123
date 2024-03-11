package source_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Search
{
	//step1= locate the element using @Find annotavtion
	//(//i[@ class='a-icon a-icon-checkbox'])[3]
	WebDriver driver;
	
	@FindBy(xpath="//input[@ type='text']")
	WebElement search_field;
	
	@FindBy(id="nav-search-submit-button")
	WebElement search_button;
	
	//create method for each elemtn
	
	public void search()
	{
		search_field.sendKeys("Shoe");
	}
	public void searchbtn()
	{
		search_button.sendKeys(Keys.ENTER);
	}
	
	//step3 = init componrnt using pagefactory class
	
	public Amazon_Search (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
