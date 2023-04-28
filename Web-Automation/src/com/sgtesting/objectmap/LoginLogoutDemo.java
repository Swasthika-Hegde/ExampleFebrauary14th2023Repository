package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	public static WebDriver oBrowser=null;
	public static Objectmap om=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeflyoutWind();
		logout();
	}

	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			String fileName=".\\objectmap\\objectmap.properties";
			om=new Objectmap(fileName);
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try 
		{
			oBrowser.findElement(om.getLocator("LoginPageUsername")).sendKeys("admin");
			oBrowser.findElement(om.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(om.getLocator("loginpageloginbtn")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutWind()
	{
		try
		{
			oBrowser.findElement(om.getLocator("homepageflyoutWindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(om.getLocator("homepagelogoutlinktext")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



