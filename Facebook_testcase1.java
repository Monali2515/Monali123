package test.facebook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.facebook.Login_Facebook;

public class Facebook_testcase1
{
	@Test
	public void Login_to_fb()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Login_Facebook lf1 = new Login_Facebook(driver);
		lf1.email_un();
		lf1.pwd();
		lf1.login();
		
		
		
	}
}
