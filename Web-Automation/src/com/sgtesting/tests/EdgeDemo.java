package com.sgtesting.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class EdgeDemo {
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{

			oBrowser=new EdgeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
