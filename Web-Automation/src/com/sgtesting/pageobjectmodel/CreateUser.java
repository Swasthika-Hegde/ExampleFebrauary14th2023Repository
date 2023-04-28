package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUser {

	public CreateUser(WebDriver oBrowser)
	{
		PageFactory.initElements( oBrowser, this);
	}
	/*WebElements for user name text feild
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
	}*/
	//webelement for user tab
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement USERS;
	public WebElement getTUser()
	{
		return USERS;
	}
	//webelement for add user
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement aUser;
	public WebElement getAuser()
	{
		return aUser;
	}
	//webelement for firstname
	private WebElement firstName;
	public WebElement getfname()
	{
		return firstName;
	}
	//webelement for lname
	private WebElement lastName;
	public WebElement getlname()
	{
		return lastName;
	}
	//webelement for email
	private WebElement email;
	public WebElement getEmail()
	{
		return email;
	}
	//webelement for userName
	private WebElement username;
	public WebElement getUser()
	{
		return username;
	}
	//webelement for pwd
	private WebElement password;
	public WebElement getUPassword()
	{
		return password;
	}
	//webelement for pwd copy
	private WebElement passwordCopy;
	public WebElement getPasswordCopy()
	{
		return passwordCopy;
	}
	//webelement for save user
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement saveUser;
	public WebElement getSaveUser()
	{
		return saveUser;
	}
	//webelement for delete
	@FindBy(xpath="//span[text()='User1, demo']")
	private WebElement FindUser;
	public WebElement getFindUser()
	{
		return FindUser;
	}
	
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement delUser;
	public WebElement getDelUser()
	{
		return delUser;
	}
	
	/*//webElement for logoutlink
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}

	}*/

}
