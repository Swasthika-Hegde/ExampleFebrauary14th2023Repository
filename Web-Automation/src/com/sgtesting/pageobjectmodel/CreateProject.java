package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProject {
	public CreateProject(WebDriver oBrowser)
	{
		PageFactory.initElements( oBrowser, this);
	}
	//webelement for dropdown
	@FindBy(className="downIcon")
	private WebElement dropdown;
	public WebElement getDropDown()
	{
		return dropdown;
	}
	//new project
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement project;
	public WebElement getProject()
	{
		return project;
	}
	//projectname
	private WebElement projectPopup_projectNameField;
	public WebElement getPName()
	{
		return projectPopup_projectNameField;
	}
	//description
	private WebElement projectPopup_projectDescriptionField;
	public WebElement getDescription()
	{
		return projectPopup_projectDescriptionField;
	}
	//createproject
	@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]/div/span")
	private WebElement save;
	public WebElement getSave()
	{
		return save;
	}
	//edit
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement edit;
	public WebElement getEdit()
	{
		return edit;
	}
	//action
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement action;
	public WebElement getAction()
	{
		return action;
	}
	//del
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement del;
	public WebElement getDel()
	{
		return del;
	}
	//confirm
	@FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")
	private WebElement confirm;
	public WebElement getConfirm()
	{
		return confirm;
	}
}
