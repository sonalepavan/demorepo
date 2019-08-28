package ej.scenarios;

import java.io.IOException;

import org.apache.log4j.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ej.result.HTMLReportGenerator;

public class Login extends Config
{
	final static Logger logger=Logger.getLogger(Login.class);


	
	
	@When("^user opens the browser$")
	public void OpenBrowser() throws IOException
	{
		try
		{
			//WebDriver driver;
			
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Jar\\geckodriver_win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			System.out.println("Status:PASS, Step Number:"+(Config.counter++)+" StepName: ###When user opens the browser###,"+" Exception:NA");
			String message="Status:PASS, Step Number:"+(Config.counter++)+" StepName: ###When user opens the browser###,"+" Exception:NA";
			Thread.sleep(2000);
			HTMLReportGenerator.StepDetails("PASS","When user opens the browser","Exception:NA",Config.CaptureScreenshot(Config.screenpath+"When user opens the browser"+".jpeg"));
			logger.info(message);
		
		//System.out.println("check it " +Hookable.BeforeScenario(scenobj));	
		//String sname=Hookable.BeforeScenario(scenobj).toString();
		//System.out.println("scenario  "+Hookable.sname);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL, Step Number:"+(Config.counter++)+"StepName: ###When user opens the browser###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL, Step Number:"+(Config.counter++)+"StepName: ###When user opens the browser###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL","When user opens the browser","Exception:"+ex.getLocalizedMessage(),Config.CaptureScreenshot(Config.screenpath+"When user opens the browser"+".jpeg"));
			//HTMLReportGenerator.StepDetails("FAIL","When user opens the browser","Exception:"+ex.getLocalizedMessage(),Config.screenpath+"When user opens the browser"+".jpeg");

			logger.error(message);
		}
	}
	@And("^user enter the url \"(.*)\"$")
	public void EnterUrl(String url) throws IOException
	{
		try
		{
			//WebDriver driver = null;
			driver.get(url);
			Thread.sleep(3000);
			System.out.println("Status:PASS, Step Number:"+(Config.counter++)+"StepName:###And user enter the url "+url+"###,Exception:NA");
			System.out.println("###And user enter the url \"(.*)\"###");
			String message="Status:PASS, Step Number:"+(Config.counter++)+"StepName:###And user enter the url "+url+"###,Exception:NA";
			//HTMLReportGenerator.StepDetails("PASS","And user enter the url "+url,"Exception:NA",Config.screenpath+"And user enter the url"+url+".jpeg");
			HTMLReportGenerator.StepDetails("PASS","And user enter the url "+url,"Exception:NA",Config.CaptureScreenshot(Config.screenpath+"And user enter the url"+".jpeg"));

			logger.info(message);
			
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###And user enter the url \"http://localhost:90/finsys\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###And user enter the url \"http://localhost:90/finsys\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL","And user enter the url "+url,"Exception: "+ex.getLocalizedMessage(),Config.CaptureScreenshot(Config.screenpath+"And user enter the url"+".jpeg"));
			logger.error(message);
			
		}
		
	}
	
	@Given("^user is on the application login page$")
	
	public void Isonloginpage() throws IOException
	{
		try
		{
			Thread.sleep(1000);
			boolean isonlogin=driver.findElement(By.xpath("//a[contains(.,'Login')]")).isDisplayed();
			System.out.println("IsOnLoginPage? "+isonlogin);
			System.out.println("Status:PASS, Step Number:"+(Config.counter++)+"StepName:###Given user is on the application login page###,Exception:NA");
			String message="Status:PASS, Step Number:"+(Config.counter++)+"StepName:###Given user is on the application login page###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "Given user is on the application login page", "Exception:NA", Config.CaptureScreenshot(Config.screenpath+"Given user is on the application login page"+".jpeg"));
			logger.info(message);
			System.out.println("###Given user is on the application login page###");
		}
		catch(Exception ex)
		{
			
			System.out.println("Status:FAIL, Scenario Name: Step Number:"+(Config.counter++)+"StepName:###Given user is on the application login page###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL, Scenario Name: Step Number:"+(Config.counter++)+"StepName:###Given user is on the application login page###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "Given user is on the application login page", "Exception: "+ex.getLocalizedMessage(),Config.CaptureScreenshot(Config.screenpath+"Given user is on the application login page"+".jpeg"));
			logger.error(message);
		}
	}
	
	@When("^user enters \"(.*)\" as username$")
	public void EnterUsername(String username) throws IOException
	{
		try
		{
			Thread.sleep(1000);
			element=driver.findElement(By.xpath("//input[@placeholder='Username']"));
			element.sendKeys(username);
			System.out.println("Status:PASS, Step Number:"+(Config.counter++)+"StepName:###When user enters \"(.*)\" as username###,Exception:NA");
			String message="Status:PASS, Step Number:"+(Config.counter++)+"StepName:###When user enters \"(.*)\" as username###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "When user enters "+username+" as username", "Exception:NA", Config.CaptureScreenshot(Config.screenpath+"When user enters "+username+" as username"+".jpeg"));
			logger.info(message);
			System.out.println("###When user enters \"(.*)\" as username###");
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###When user enters \"(.*)\" as username###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###When user enters \"(.*)\" as username###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "When user enters "+username+" as username", "Exception: "+ex.getLocalizedMessage(), CaptureScreenshot(Config.screenpath+"When user enters "+username+" as username"+".jpeg"));
			logger.error(message);
		}
	}
	@And("^user enters \"(.*)\" as password$")
	public void EnterPassword(String password) throws IOException
	{
		try
		{
			Thread.sleep(1000);
			element=driver.findElement(By.xpath("//input[@placeholder='Password']"));
			element.sendKeys("passw0rd");
			System.out.println("Status:PASS, Step Number:"+(Config.counter++)+"StepName:###And user enters \"(.*)\" as password###,Exception:NA");
			String message="Status:PASS, Step Number:"+(Config.counter++)+"StepName:###And user enters \"(.*)\" as password###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "And user enters "+password+" as password", "Exception:NA", Config.CaptureScreenshot(Config.screenpath+"And user enters "+password+" as password"+".jpeg"));
			logger.info(message);
			System.out.println("###And user enters \"(.*)\" as password###");
		}
		catch(Exception ex)
		{

			System.out.println("Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###And user enters \"(.*)\" as password###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###And user enters \"(.*)\" as password###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "And user enters "+password+" as password", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"And user enters "+password+" as password"+".jpeg"));
			logger.error(message);
		}
	}
	@And("^user clicks on login button$")
	public void ClickOnButton() throws IOException
	{
		try
		{
			Thread.sleep(1000);
			element=driver.findElement(By.xpath("//a[contains(.,'Login')]"));
			element.click();
			System.out.println("Status:PASS, Step Number:"+(Config.counter++)+"StepName:###And user clicks on login button###,Exception:NA");
			String message="Status:PASS, Step Number:"+(Config.counter++)+"StepName:###And user clicks on login button###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "And user clicks on login button", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"And user clicks on login button"+".jpeg"));
			logger.info(message);
			System.out.println("###And user clicks on login button###");
		}
		catch(Exception ex)
		{

			
			System.out.println("Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###And user clicks on login button###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###And user clicks on login button###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "And user clicks on login button", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"And user clicks on login button"+".jpeg"));
			logger.error(message);
		}
	}
	@Then("^user is on the application home page$")
	public void Isonhomepage() throws IOException
	{
		try
		{	
			Thread.sleep(2000);
			boolean isonhome=driver.findElement(By.xpath("//a[contains(.,'LOGOUT')]")).isDisplayed();
			System.out.println("Is on Home Page? "+isonhome);
			System.out.println("Status:PASS, Step Number:"+(Config.counter++)+"StepName:###Then user is on the application home page###,Exception:NA");
			String message="Status:PASS, Step Number:"+(Config.counter++)+"StepName:###Then user is on the application home page###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "Then user is on the application home page", "Exception: Na", Config.CaptureScreenshot(Config.screenpath+"Then user is on the application home page"+".jpeg"));
			logger.info(message);
			System.out.println("###Then user is on the application home page###");
		}
		catch(Exception ex)
		{


			System.out.println("Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###Then user is on the application home page###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###Then user is on the application home page###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "Then user is on the application home page", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"Then user is on the application home page"+".jpeg"));
			logger.error(message);
		}
	}
	@And("^user gets the message starting with \"(.*)\" on the top$")
	public void Welcome(String Welcome) throws IOException
	{
		try
		{
			boolean welcome=driver.findElement(By.xpath("//span[contains(.,'Welcome dummy[FM]')]")).isDisplayed();
			System.out.println("Is Welcome Message Displayed on Home Page? "+welcome);
			

			System.out.println("Status:PASS, Step Number:"+(Config.counter++)+"StepName:###And user gets the message starting with \"(.*)\" on the top###,Exception:NA");
			String message="Status:PASS, Step Number:"+(Config.counter++)+"StepName:###And user gets the message starting with \"(.*)\" on the top###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "And user gets the message starting with "+Welcome+" on the top", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"And user gets the message starting with "+Welcome+" on the top"+".jpeg"));
			logger.info(message);
			System.out.println("###And user gets the message starting with \"(.*)\" on the top###");
		}
		catch(Exception ex)
		{


			System.out.println("Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###And user gets the message starting with \"(.*)\" on the top###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###And user gets the message starting with \"(.*)\" on the top###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "And user gets the message starting with "+Welcome+" on the top", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"And user gets the message starting with "+Welcome+" on the top"+".jpeg"));
			logger.error(message);
		}
		
	}
	@And("^user closes the browser$")
	public void closebrowser() throws IOException
	{
		try
		{
			Thread.sleep(1000);			
			System.out.println("Status:PASS, Step Number:"+(Config.counter++)+"StepName:###And user closes the browser###,Exception:NA");
			String message="Status:PASS, Step Number:"+(Config.counter++)+"StepName:###And user closes the browser###,Exception:NA";
			Thread.sleep(2000);
			HTMLReportGenerator.StepDetails("PASS", "And user closes the browser", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"And user closes the browser"+".jpeg"));
			driver.close();
			logger.info(message);
			System.out.println("###And user closes the browser###");
		}
		catch(Exception ex)
		{

			System.out.println("Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###And user closes the browser###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###And user closes the browser###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "And user closes the browser", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"And user closes the browser"+".jpeg"));
			logger.error(message);
		}
	}
	@Then("^user is not logged in and user is on login page$")
	public void sameloginpage() throws IOException
	{
		try
		{
			Thread.sleep(1000);
			boolean onsamelogin=driver.findElement(By.xpath("//a[contains(.,'Login')]")).isDisplayed();
			System.out.println("Is On Same Login Page? "+onsamelogin);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###Then user is not logged in and user is on login page###,Exception:NA");
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###Then user is not logged in and user is on login page###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "Then user is not logged in and user is on login page", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"Then user is not logged in and user is on login page"+".jpeg"));
			logger.info(message);
			System.out.println("###Then user is not logged in and user is on login page###");
		}
		catch(Exception ex)
		{

			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###Then user is not logged in and user is on login page###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###Then user is not logged in and user is on login page###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "Then user is not logged in and user is on login page", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"Then user is not logged in and user is on login page"+".jpeg"));
			logger.error(message);
		}
	}
	@And("^error message is displayed$")
	public void error() throws IOException
	{
		try
		{
			boolean errordisplayed=driver.findElement(By.xpath("//div[@id='error']")).isDisplayed();
			System.out.println("Error Displayed? "+errordisplayed);
			
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###And error message is displayed###,Exception:NA");
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###And error message is displayed###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "And error message is displayed", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"And error message is displayed"+".jpeg"));
			logger.info(message);
			System.out.println("###And error message is displayed###");
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###And error message is displayed###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###And error message is displayed###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "And error message is displayed", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"And error message is displayed"+".jpeg"));

			logger.error(message);
		}
	}

}
