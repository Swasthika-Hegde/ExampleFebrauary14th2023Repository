package com.sgtesting.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyProject {
	public ModifyProject(WebDriver oBrowser)
	{
		PageFactory.initElements( oBrowser, this);
	}
	//webelement to edit

		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement FindProj;
		public WebElement getFindProj()
		{
			return FindProj;
		}
	//webelement to dropdown
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]/div")
		private WebElement DropDown;
		public WebElement getDropDown()
		{
			return DropDown;
		}
	//webelement to archive
		@FindBy(xpath="/html/body/div[26]/div[2]/div")
		private WebElement Select;
		public WebElement getSelect()
		{
			return Select;
		}
	//webelement to	cancel
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
		private WebElement cancel;
		public WebElement getCancel()
		{
			return cancel;
		}
	
}
