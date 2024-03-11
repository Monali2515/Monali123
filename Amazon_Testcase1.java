package test_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import source_Amazon.Amazon_Login;
import source_Amazon.Amazon_Search;
import source_Amazon.Amazon_Sort_product;

public class Amazon_Testcase1 
{
	@Test
	public void loginfumctionality()
	{
		
	
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Amazon_Login l1 = new Amazon_Login(driver);
	l1.un1();
	l1.conti();
	l1.pwd();
	l1.sign();
	
	Amazon_Search as1 = new Amazon_Search(driver);
	as1.search();
	as1.searchbtn();
	
	Amazon_Sort_product a1= new Amazon_Sort_product(driver);
	a1.asian();
	a1.campus();
	a1.sparx();
	
	}
	
	
	
}
