package ej.scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Config 
{
	public static WebDriver driver=null;
	static WebElement element=null;
    public static int counter=0;
    public static String screenpath="E:\\Screenshots\\";
    
    public static String CaptureScreenshot(String objectImagePath) throws IOException
	{
		  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshotFile, new File(objectImagePath));
		  return objectImagePath.toString();
		  
	}
}
