package ej.result;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;
import java.io.IOException;

import ej.scenarios.Config;



public class HTMLReportGenerator extends Config{

	static ExtentReports report=null;
	static ExtentTest tcobj; 
	
	public static void TestSuiteStart(String ResultHTMLFilePath,String UserName) throws UnknownHostException
	{
		report=new ExtentReports(ResultHTMLFilePath,false,NetworkMode.OFFLINE);
		
		report
			.addSystemInfo("Host Name", InetAddress.getLocalHost().getHostName())
	        .addSystemInfo("Environment", "QA")
	        .addSystemInfo("User Name", UserName);
	}
	public static void TestSuiteEnd()
	{
		report.flush();report.close();
	}
	public static void TestCaseStart(String TestName,String Description)
	{
		tcobj=report.startTest(TestName, Description);
	}
	public static void TestCaseEnd()
	{
		report.endTest(tcobj);
		
	}
	
	public static void StepDetails(String Status,String StepName,String StepDetails,String objectImagePath)
	{
		
		//CaptureScreenshot(objectImagePath);
				
		
		String tbl=StepDetails+"<br>"+tcobj.addScreenCapture(objectImagePath);
		if(Status.equalsIgnoreCase("pass"))
		{		tcobj.log(LogStatus.PASS,StepName,tbl);}
		else if(Status.equalsIgnoreCase("fail"))
		{		tcobj.log(LogStatus.FAIL,StepName, tbl);}
		else if(Status.equalsIgnoreCase("error"))
		{		tcobj.log(LogStatus.ERROR,StepName, tbl);}
		else if(Status.equalsIgnoreCase("info"))
		{		tcobj.log(LogStatus.INFO,StepName, tbl);}
		else
		{tcobj.log(LogStatus.INFO,StepName, tbl);}
	
		
	}
	public static void main(String[] args) throws UnknownHostException 
	{
		//File newFile;
	
		
			
				StepDetails("pass","Launch Browser","Browser name: ff","Version:64");
				StepDetails("pass","Entr URL","http://localhost:90/finsys/login.html","");
				StepDetails("pass", "entervalid username", "username:manish","C:\\aj.jpeg");
				StepDetails("pass", "enter valid password", "pasword:qqqq","C:\\aj1.jpeg");
				StepDetails("pass","Click on Login button","","");
				StepDetails("pass","Is on home page?","","");
			
		
	
	

	}

}
