package ej.scenarios;

import java.io.File;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import ej.result.HTMLReportGenerator;

public class Hookable 
{	
	final static Logger logger=Logger.getLogger(Login.class);

	@Before
	public static void  BeforeScenario(Scenario obj) throws UnknownHostException
	{
		
		System.out.println("**************WITHIN BEFORE SCENARIO*****************");
		//System.out.println("Scenario Name: "+obj.getName());//PRINTS SCENARIO NAME.
		//System.out.println(logger.);
		Login.logger.info(obj.getName());
		
		Config.counter=1;
		
		int count=0;
		boolean b;
		while((b=new File("C:\\sonal"+count+".html").exists()))
		{
			//System.out.println("Within while loop .... b is "+b);
			count++;
		}
		
		HTMLReportGenerator.TestSuiteStart("C:\\sonal"+count+".html", "ejagruti");
		
		//System.out.println("Get status is "+obj.getStatus());
		HTMLReportGenerator.TestCaseStart(obj.getName(), obj.getId()+"   "+obj.getStatus()+"  "+obj.getSourceTagNames().toString());
		//System.out.println("object id "+obj.getId());
		//System.out.println("get class "+obj.getClass());
		System.out.println("*********END WITHIN BEFORE SCENARIO*****************");
		
		
	}
	@After
	public void AfterScenario(Scenario obj)
	{
		System.out.println("*******************WITHIN AFTER SCENARIO************************");
		System.out.println(obj.getClass()+" After");
		//System.out.println("get class "+obj.getClass());
		//System.out.println("Gett status is "+obj.getStatus());
		
		//System.out.println("object id "+obj.getId());
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
		System.out.println("*******************END WITHIN AFTER SCENARIO************************");
	}

}
