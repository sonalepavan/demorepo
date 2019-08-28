package ej.scenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice 
{
	public static WebDriver driver;
	public static WebElement element;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Jar\\geckodriver_win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://in.ebay.com/");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("children watch");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		Thread.sleep(2000);
	
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println("Total links: "+linklist.size());
//		
		for(int i=0;i<linklist.size();i++)
		{
			String linktext=linklist.get(i).getText();
			System.out.println(linktext);
		}
//		
	}

}
