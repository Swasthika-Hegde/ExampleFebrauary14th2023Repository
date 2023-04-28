package com.sgtesting.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyUser {

	public ModifyUser(WebDriver oBrowser)
	{
		PageFactory.initElements( oBrowser, this);
	}
	//find user
	@FindBy(xpath="//span[text()='User1, demo']")
	private WebElement FindUser;
	public WebElement getFindUser()
	{
		return FindUser;
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
		//webelement for save
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]")
		private WebElement save;
		public WebElement getSave()
		{
			return save;
		}
}