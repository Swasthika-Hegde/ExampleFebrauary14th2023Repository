package com.sgtesting.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		close();
	}
	private static void launch()
	{
		oBrowser=new ChromeDriver();
	}
	private static void navigate()
	{
		try
		{


			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		oBrowser.close();
	}
}
