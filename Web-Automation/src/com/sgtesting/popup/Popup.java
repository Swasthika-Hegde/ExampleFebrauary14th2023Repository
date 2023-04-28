package com.sgtesting.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	private static WebDriver oBrowser=null;
	public static void main(String [] args)
	{
		launcbrowser();
		navigate();
		popupBrowser();
		//getpopupsCount();
	}
	private static void launcbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "H:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
	private static void popupBrowser()
	{
		try
		{
			System.out.println("before click on link, number of popup:"+getpopupsCount());
			oBrowser.findElement(By.linkText("actiTIME INC.")).click();
			System.out.println("after click on link, number of popups:" +getpopupsCount());
			Thread.sleep(2000);
			if(getpopupsCount()>0)
			{
				handlePopups();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static int getpopupsCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
		
	}
	private static void handlePopups()
	{
		try
		{
	
			String parentBrowser=oBrowser.getWindowHandle();
			System.out.println("parent browser:"+parentBrowser);
			Object childPopups[]=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<childPopups.length;i++)
			{
				String childBrowser=childPopups[i].toString();
				System.out.println("child browser"+childPopups[i]);
				oBrowser.switchTo().window(childBrowser);
				String title=oBrowser.getTitle();
				System.out.println("title of child browser"+title);
				String url=oBrowser.getCurrentUrl();
				System.out.println("url of child browser"+url);
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("try free")).click();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
