package TNpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class FirstTN 
{
	public WebDriver driver;
	public WebElement element;
  @Test
  public void okkk() 
  {

	  element=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		element.sendKeys("dummyfm");
		
		element=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		element.sendKeys("passw0rd");
		
		element=driver.findElement(By.xpath("//a[contains(.,'Login')]"));
		element.click();
  }
  @BeforeMethod
  public void beforeMethod() 
  {

	   // Create a new instance of the Firefox driver

		System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Jar\\geckodriver_win32\\geckodriver.exe");
		//driver=new FirefoxDriver();
	 
	      driver = new FirefoxDriver();
	 
	      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      //Launch the Online Store Website
	 
	      driver.get("http://localhost:90/finsys");
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
	// Close the driver
	  
      driver.quit();
	  
  }

}
