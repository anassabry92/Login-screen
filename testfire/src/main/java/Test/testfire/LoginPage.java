package Test.testfire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage
{
	
	private WebDriver driver;
	private String username="";
	private String password="";
	
	@Test
    public void login() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://testfire.net/login.jsp");
		
		//enter username
		driver.findElement(By.id("uid")).sendKeys(username);
		
		//enter password
		driver.findElement(By.id("passw")).sendKeys(password);
		
		//login button
		driver.findElement(By.name("btnSubmit")).click();
    }
}
