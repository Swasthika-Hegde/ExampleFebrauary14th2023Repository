package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements( oBrowser, this);
	}
	//WebElements for user name text feild
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//webelements for password textfeild
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	//webelement for login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	//webelement for flyout window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//webelement for user tab
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement tUser;
	public WebElement getTUser()
	{
		return tUser;
	}
	
	//webElement for logoutlink
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}
