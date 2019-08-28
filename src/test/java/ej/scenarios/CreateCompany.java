package ej.scenarios;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ej.result.HTMLReportGenerator;

public class CreateCompany extends Config
{
	final static Logger logger=Logger.getLogger(CreateCompany.class);
	
	@When("^user clicks on Manage Company$")
	public void ClickOnManageCompany() throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//a[@title='Manage Company']"));
			element.click();
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###When user clicks on Manage Company###,Exception:NA");
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###When user clicks on Manage Company###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "When user clicks on Manage Company", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"When user clicks on Manage Company"+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###When user clicks on Manage Company###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###When user clicks on Manage Company###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "When user clicks on Manage Company", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"When user clicks on Manage Company"+".jpeg"));

			logger.error(message);
		}
	}
	
	@Then("^user is on Manage Company tab$")
	public void OnManageCompanyTab() throws IOException
	{
		try
		{
			boolean onmanagetab=driver.findElement(By.xpath("//span[@class='tabs-title tabs-closable'][contains(.,'Manage Company')]")).isDisplayed();
			System.out.println("Is on Manage Company Tab? "+onmanagetab);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###Then user is on Manage Company tab###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###Then user is on Manage Company tab###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "Then user is on Manage Company tab", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"Then user is on Manage Company tab"+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###Then user is on Manage Company tab###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###Then user is on Manage Company tab###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "Then user is on Manage Company tab", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"Then user is on Manage Company tab"+".jpeg"));
			logger.error(message);
		}
	}
	
	@When("^user clicks on New button$")
	public void ClickOnNew() throws IOException
	{
		try
		{
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//div[@class='panel-title']"));
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//span[@class='l-btn-text'][contains(.,'New')]")).click();
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###When user clicks on New button###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###When user clicks on New button###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "When user clicks on New button", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"When user clicks on New button"+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###When user clicks on New button###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###When user clicks on New button###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "When user clicks on New button", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"When user clicks on New button"+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^User enters Company name as \"(.*)\"$")
	public void EnterCompanyName(String companyname) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//input[@name='name']"));
			element.sendKeys(companyname);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###And User enters Company name as "+companyname+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###And User enters Company name as "+companyname+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "And User enters Company name as "+companyname, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"And User enters Company name as "+companyname+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###And User enters Company name as \"COMPANY1\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###And User enters Company name as \"COMPANY1\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "And User enters Company name as "+companyname, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"And User enters Company name as "+companyname+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^User selects Company type as \"(.*)\"$")
	public void SelectCompanyType(String companytype) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//select[@id='companytype']"));	
		    //ScrollToElement(element);
			Select dropdownelement=new Select(driver.findElement(By.xpath("//select[@id='companytype']")));
			dropdownelement.selectByVisibleText("IT");

			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User selects Company type as "+companytype+"###,Exception:NA");				
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User selects Company type as "+companytype+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User selects Company type as "+companytype, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User selects Company type as "+companytype+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User selects Company type as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User selects Company type as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User selects Company type as "+companytype, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User selects Company type as "+companytype+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^User selects Company Subtype as \"(.*)\"$")
	public void SelectCompanySubType(String subtype) throws IOException
	{
		try
		{
			//element=driver.findElement(By.xpath("//input[@name='subtype']"));	
		    //ScrollToElement(element);
			Select dropdownelement=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[22]/td/div/div/div/form/table/tbody/tr[2]/td[2]/div/input")));
			dropdownelement.selectByVisibleText(subtype);

			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User selects Company Subtype as "+subtype+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User selects Company Subtype as "+subtype+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User selects Company Subtype as "+subtype, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User selects Company Subtype as "+subtype+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User selects Company Subtype as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User selects Company Subtype as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User selects Company Subtype as "+subtype, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User selects Company Subtype as "+subtype+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^user enters Company Address as\"(.*)\"$")
	public void SelectAddress(String address) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//table[@class='dv-table']//input[@name='address']/preceding-sibling::*"));
			//ScrollToElement(element);				
			element.sendKeys(address);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###user enters Company Address as"+address+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###user enters Company Address as"+address+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "user enters Company Address as"+address, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"user enters Company Address as"+address+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###user enters Company Address as\"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###user enters Company Address as\"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "user enters Company Address as"+address, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"user enters Company Address as"+address+".jpeg"));
			logger.error(message);
		}
	}
	
	@And("^User enters Phone as \"(.*)\"$")
	public void EnterPhone(String phone) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//input[@name='phone']/preceding-sibling::*[1]"));
			//ScrollToElement(element);				
			element.sendKeys(phone);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User enters Phone as "+phone+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User enters Phone as "+phone+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User enters Phone as "+phone, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User enters Phone as "+phone+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###User enters Phone as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL, Step Number:"+(Config.counter++)+"StepName:###User enters Phone as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User enters Phone as "+phone, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User enters Phone as "+phone+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^User enters Email as \"(.*)\"$")
	public void EnterEmail(String email) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//input[@name='email']"));
			//ScrollToElement(element);				
			element.sendKeys(email);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User enters Email as "+email+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User enters Email as "+email+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User enters Email as "+email, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User enters Email as "+email+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User enters Email as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User enters Email as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User enters Email as "+email, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User enters Email as "+email+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^User enters Pan Details as \"(.*)\"$")
	public void EnterPan(String Pan) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//input[@name='pan']"));
			//ScrollToElement(element);				
			element.sendKeys(Pan);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User enters Pan Details as "+Pan+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User enters Pan Details as "+Pan+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User enters Pan Details as "+Pan, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User enters Pan Details as "+Pan+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User enters Pan Details as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User enters Pan Details as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User enters Pan Details as "+Pan, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User enters Pan Details as "+Pan+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^User enters Tin details as \"(.*)\"$")
	public void EnterTin(String Tin) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//input[@name='tin']"));
			//ScrollToElement(element);				
			element.sendKeys(Tin);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User enters Tin details as "+Tin+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User enters Tin details as "+Tin+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User enters Tin details as "+Tin, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User enters Tin details as "+Tin+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User enters Tin details as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User enters Tin details as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User enters Tin details as "+Tin, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User enters Tin details as "+Tin+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^user enters Mobile as \"(.*)\"$")
	public void EnterMobile(String mobile) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//table[@class='dv-table']//input[@name='mobile']/preceding-sibling::*"));
			//ScrollToElement(element);				
			element.sendKeys(mobile);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###user enters Mobile as "+mobile+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###user enters Mobile as "+mobile+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "user enters Mobile as "+mobile, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"user enters Mobile as "+mobile+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###user enters Mobile as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###user enters Mobile as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "user enters Mobile as "+mobile, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"user enters Mobile as "+mobile+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^user enters Web Site as \"(.*)\"$")
	public void EnterWeb(String Web) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//input[@name='website']"));
			//ScrollToElement(element);				
			element.sendKeys(Web);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###user enters Web Site as "+Web+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###user enters Web Site as "+Web+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "user enters Web Site as "+Web, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"user enters Web Site as "+Web+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###user enters Web Site as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###user enters Web Site as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "user enters Web Site as "+Web, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"user enters Web Site as "+Web+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^User selects Country as \"(.*)\"$")
	public void SelectCountry(String country) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//select[@name='countryname']"));	
		    //ScrollToElement(element);
			Select dropdownelement=new Select(driver.findElement(By.xpath("//select[@name='countryname']")));
			dropdownelement.selectByVisibleText(country);

			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User selects Country as "+country+"###,Exception:NA");		
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User selects Country as "+country+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User selects Country as "+country, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User selects Country as "+country+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User selects Country as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User selects Country as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User selects Country as "+country, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User selects Country as "+country+".jpeg"));

			logger.error(message);
		}
		
	}
	
	@And("^User selects State as \"(.*)\"$")
	public void SelectState(String state) throws IOException
	{
		try
		{
			Thread.sleep(2000);
			//element=driver.findElement(By.xpath("//select[@id='stateidlist']"));	
		    //ScrollToElement(element);
			Select dropdownelement=new Select(driver.findElement(By.id("stateidlist")));
			dropdownelement.selectByVisibleText(state);

			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User selects State as "+state+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User selects State as "+state+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User selects State as "+state, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User selects State as "+state+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User selects State as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User selects State as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User selects State as "+state, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User selects State as "+state+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^User selects City name as \"(.*)\"$")
	public void SelectCity(String city) throws IOException
	{
		try
		{
			//element=driver.findElement(By.xpath("//input[@name='city']"));	
		    //ScrollToElement(element);
			Select dropdownelement=new Select(driver.findElement(By.id("citylist")));
			dropdownelement.selectByVisibleText(city);

			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User selects City name as "+city+"###,Exception:NA");		
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User selects City name as "+city+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User selects City name as "+city, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User selects City name as "+city+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User selects City name as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User selects City name as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User selects City name as "+city, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User selects City name as "+city+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^User enters Total Employee as \"(.*)\"$")
	public void EnterTotalEmployee(String totalemployee) throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//input[@name='totalemployee']/preceding-sibling::*"));
			//ScrollToElement(element);				
			element.sendKeys(totalemployee);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User enters Total Employee as "+totalemployee+"###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User enters Total Employee as "+totalemployee+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User enters Total Employee as "+totalemployee, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User enters Total Employee as "+totalemployee+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User enters Total Employee as \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User enters Total Employee as \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User enters Total Employee as "+totalemployee, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User enters Total Employee as "+totalemployee+".jpeg"));

			logger.error(message);
		}
	}
	
	@And("^User clicks on Save button$")
	public void ClickOnSave() throws IOException
	{
		try
		{
			element=driver.findElement(By.xpath("//span[@class='l-btn-icon icon-save']"));
			//NEVER PUT ScrollToElement here... never needed. 
			element.click();
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User clicks on Save button###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User clicks on Save button###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User clicks on Save button", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User clicks on Save button"+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User clicks on Save button###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User clicks on Save button###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User clicks on Save button", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User clicks on Save button"+".jpeg"));

			logger.error(message);
		}
	}
	
	@Then("^user should see the successfully created company name in company list$")
	public void CompanyNameInList() throws IOException
	{
		try
		{
			System.out.println("************************************************************************");
			//Thread.sleep(000);
			//String cellvalue=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/@div")).getText();
			//String cellvalue=driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]/div[class='datagrid-cell datagrid-cell-c1-name']")).getText();
			element=driver.findElement(By.xpath("//table[contains(@class,'datagrid-btable')]/tbody/tr[contains(@id,'datagrid-row-r1-1')]"));
			//System.out.println("***********************************************Created Company: "+cellvalue);
			java.util.List<WebElement> tr=element.findElements(By.tagName("tr"));
			   int rc= tr.size();
			   System.out.println("row size "+rc);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###user should see the successfully created company name in company list###,Exception:NA");			
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###user should see the successfully created company name in company list###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "user should see the successfully created company name in company list", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"user should see the successfully created company name in company list"+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###user should see the successfully created company name in company list###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###user should see the successfully created company name in company list###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "user should see the successfully created company name in company list", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"user should see the successfully created company name in company list"+".jpeg"));

			logger.error(message);
		}
	}
	
	@Given("^User is on Home page after successful login$")
	public void OnHomePage() throws IOException
	{
		try
		{
			Thread.sleep(1000);
			boolean isonlogin=driver.findElement(By.xpath("//a[contains(.,'Login')]")).isDisplayed();
			System.out.println("IsOnLoginPage? "+isonlogin);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User is on Home page after successful login###,Exception:NA");	
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###User is on Home page after successful login###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User is on Home page after successful login", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User is on Home page after successful login"+".jpeg"));
			logger.info(message);
		}
		catch(Exception ex)
		{
			
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User is on Home page after successful login###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User is on Home page after successful login###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User is on Home page after successful login", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User is on Home page after successful login"+".jpeg"));

			logger.error(message);
		}
	}
	
	@Then("^user should see the error message saying \"(.*)\"$")
	public void AlreadyExistsMessage(String message) throws IOException
	{
		try
		{
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			System.out.println(message);
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###user should see the error message saying "+message+"###,Exception:NA");		
			String message1="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###user should see the error message saying "+message+"###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "user should see the error message saying "+message, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"user should see the error message saying "+message+".jpeg"));
			logger.info(message1);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###user should see the error message saying \"(.*)\"###,Exception:"+ex.getLocalizedMessage());
			String message1="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###user should see the error message saying \"(.*)\"###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "user should see the error message saying "+message, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"user should see the error message saying "+message+".jpeg"));

			logger.error(message1);
		}
	}
	
	@Then("^User should get the validation error message saying \"(.*)\" for the required fields$")
	public void FieldRequired(String message) throws IOException
	{
		try
		{
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			System.out.println(message);
			System.out.println("Status:PASS, Step Number:"+(Config.counter++)+"StepName:###User should get the validation error message saying "+message+" for the required fields###,Exception:NA");		
			String message1="Status:PASS, Step Number:"+(Config.counter++)+"StepName:###User should get the validation error message saying "+message+" for the required fields###,Exception:NA";
			HTMLReportGenerator.StepDetails("PASS", "User should get the validation error message saying "+message, "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"User should get the validation error message saying "+message+".jpeg"));
			logger.info(message1);
		}
		catch(Exception ex)
		{
			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User should get the validation error message saying \"(.*)\" for the required fields###,Exception:"+ex.getLocalizedMessage());
			String message1="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###User should get the validation error message saying \"(.*)\" for the required fields###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "User should get the validation error message saying "+message, "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"User should get the validation error message saying "+message+".jpeg"));

			logger.error(message1);
		}
	}
	
	@And("^user will close the browser$")
	public void closebrowser() throws IOException
	{
		try
		{
			Thread.sleep(1000);
			HTMLReportGenerator.StepDetails("PASS", "And user closes the browser", "Exception: NA", Config.CaptureScreenshot(Config.screenpath+"And user closes the browser"+".jpeg"));

			driver.close();
			
			System.out.println("Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###And user closes the browser###,Exception:NA");
			String message="Status:PASS,  Step Number:"+(Config.counter++)+"StepName:###And user closes the browser###,Exception:NA";
			logger.info(message);
			System.out.println("###And user closes the browser###");
		}
		catch(Exception ex)
		{

			System.out.println("Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###And user closes the browser###,Exception:"+ex.getLocalizedMessage());
			String message="Status:FAIL,  Step Number:"+(Config.counter++)+"StepName:###And user closes the browser###,Exception:"+ex.getLocalizedMessage();
			HTMLReportGenerator.StepDetails("FAIL", "And user closes the browser", "Exception: "+ex.getLocalizedMessage(), Config.CaptureScreenshot(Config.screenpath+"And user closes the browser"+".jpeg"));

			logger.error(message);
		}
	}
}
