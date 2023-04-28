package com.sgtesting.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyCustomer {
	public ModifyCustomer(WebDriver oBrowser)
	{
		PageFactory.initElements( oBrowser, this);
	}
	//webelement to selectuser

	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement Findcust;
	public WebElement getFindCust()
	{
		return Findcust;
	}

	//webelement to dropdown

	//find user
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement Status;
	public WebElement getStatus()
	{
		return Status;
	}
	//webelement to archive

	//find user
	@FindBy(xpath="/html/body/div[23]/div[2]/div")
	private WebElement SelStatus;
	public WebElement getSelStatus()
	{
		return SelStatus;
	}
	//webelement to cancel

	//find user
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement Cancel;
	public WebElement getCancel()
	{
		return Cancel;
	}
}
