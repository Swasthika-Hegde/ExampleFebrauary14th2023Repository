package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ModifyUserDemo {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static CreateUser cPage=null;
	public static ModifyUser mPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createuser();
		modify();
		deleteuser();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "H:\\ExampleAutomation\\"+"Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
			cPage=new CreateUser(oBrowser);
			mPage=new ModifyUser(oBrowser);
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
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void createuser()
	{
		try
		{
			//user tab
			cPage.getTUser().click();
			Thread.sleep(5000);
			//add user
			cPage.getAuser().click();
			Thread.sleep(5000);
			//fname
			cPage.getfname().sendKeys("demo");
			//Thread.sleep(5000);
			//lname
			cPage.getlname().sendKeys("User1");
			//mail
			cPage.getEmail().sendKeys("u@l.com");
			//username
			cPage.getUser().sendKeys("user1");
			//pwd
			cPage.getUPassword().sendKeys("user1");
			//pwd copy
			cPage.getPasswordCopy().sendKeys("user1");
			Thread.sleep(5000);
			//save
			cPage.getSaveUser().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modify()
	{
		try
		{
			//user
			mPage.getFindUser().click();
			Thread.sleep(2000);
			//pwd
			mPage.getUPassword().sendKeys("java");
			//pwd copy
			Thread.sleep(2000);
			mPage.getPasswordCopy().sendKeys("java");
			//save
			mPage.getSave().click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			//user
			cPage.getFindUser().click();
			Thread.sleep(5000);
			//deluser
			cPage.getDelUser().click();
			Thread.sleep(5000);
			//alert
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
			oPage.getLogout().click();
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