package com.sgtesting.pageobjectmodel;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateCustomerDemo {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static CreateCustomer custPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createcust();
		deletecust();
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
			custPage=new CreateCustomer(oBrowser);
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
	private static void createcust()
	{
		try
		{
			//tasks
			custPage.getTasks().click();
			Thread.sleep(2000);
			//dropdown
			custPage.getDropDown().click();
			Thread.sleep(2000);
			custPage.getCust().click();
			Thread.sleep(5000);
			custPage.getCustName().sendKeys("lotus");
			//Thread.sleep(5000);
			custPage.getCustDesc().sendKeys("lotus is flower");
			Thread.sleep(5000);
			custPage.getSave().click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecust()
	{
		try
		{
			custPage.getSelect().click();
			Thread.sleep(2000);
			custPage.getAction().click();
			Thread.sleep(2000);
			custPage.getDel().click();
			Thread.sleep(2000);
			custPage.getConfirm().click();
			Thread.sleep(5000);

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

