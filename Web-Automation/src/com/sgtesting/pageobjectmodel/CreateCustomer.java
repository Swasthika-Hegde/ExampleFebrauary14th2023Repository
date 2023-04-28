package com.sgtesting.pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomer {

	public CreateCustomer(WebDriver oBrowser)
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
	//webelement for tasks
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
	private WebElement tasks;
	public WebElement getTasks()
	{
		return tasks;
	}
	//webelement for dropdown
	@FindBy(className="downIcon")
	private WebElement dropDown;
	public WebElement getDropDown()
	{
		return dropDown;
	}
	//web element new customer
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement cust;
	public WebElement getCust()
	{
		return cust;
	}
	//webelement name
	private WebElement customerLightBox_nameField;
	public WebElement getCustName()
	{
		return customerLightBox_nameField;
	}
	//webelement description
	private WebElement customerLightBox_descriptionField;
	public WebElement getCustDesc()
	{
		return customerLightBox_descriptionField;
	}
	//webelement save
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
	private WebElement save;
	public WebElement getSave()
	{
		return save;
	}
	//webelement for select
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement select;
	public WebElement getSelect()
	{
		return select;
	}

	//webelement action
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement action;
	public WebElement getAction()
	{
		return action;
	}

	//webelement del
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div ")
	private WebElement del;
	public WebElement getDel()
	{
		return del;
	}

	//webelement confirm
	@FindBy(xpath="//*//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div ")
	private WebElement confirm;
	public WebElement getConfirm()
	{
		return confirm;
	}

	//webElement for logoutlink
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}


