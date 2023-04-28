package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser {
	public static WebDriver oBrowser=null;
	public static Objectmap om=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeflyoutWind();
		createuser();
		deleteuser();
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
	private static void createuser()
	{
	try
	{
		//usertab
		oBrowser.findElement(om.getLocator("userstab")).click();
		//add
		oBrowser.findElement(om.getLocator("adduser")).click();
		//fname
		oBrowser.findElement(om.getLocator("firstname")).sendKeys("demo");;
		//lname
		oBrowser.findElement(om.getLocator("lastname")).sendKeys("User1");
		//email
		oBrowser.findElement(om.getLocator("email")).sendKeys("u1@demo.com");
		//username
		oBrowser.findElement(om.getLocator("username")).sendKeys("user1");
		//pwd
		oBrowser.findElement(om.getLocator("pwd")).sendKeys("user1");
		//pwdcopy
		oBrowser.findElement(om.getLocator("pwdCopy")).sendKeys("user1");
		Thread.sleep(2000);
		//save
		oBrowser.findElement(om.getLocator("save")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	private static void deleteuser()
	{
	try
	{
		//selectuser
		oBrowser.findElement(om.getLocator("seluser")).click();
		Thread.sleep(2000);
		//deluser
		oBrowser.findElement(om.getLocator("del")).click();
		Thread.sleep(2000);
		Alert oAlert=oBrowser.switchTo().alert();
		String content=oAlert.getText();
		System.out.println(content);
		oAlert.accept();
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
