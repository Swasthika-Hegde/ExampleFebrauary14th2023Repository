package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced1 {

	private static ChromeDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		adminLogin();
		minimizeFlyoutWindow();
		createUser1();
		logout();
		User1Login();				
		startExploring();			
		createUser2();
		logout();
		User2Login();
		startExploring();
		createUser3();
		logout();
		User3Login();				
		startExploring();
		logout();
		User2Login();
		modifyUser3Password();
		logout();
		user3ModifiedLogin();
		logout();
		User1Login();
		modifyUser2Password();	
		logout();
		user2ModifiedLogin();
		logout();
		adminLogin();
		modifyUser1Password();
		logout();
		user1ModifiedLogin(); 
		logout();
		user2ModifiedLogin();
		deleteUser3(); 	
		logout();
		user1ModifiedLogin();
		deleteUser2();
		logout();
		adminLogin();
		deleteUser1();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void adminLogin()
	{
		try{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutWindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createUser1()
	{
		try {
			//Creation of User1
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("demo.user1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createUser2()
	{
		try {
			//Creation of User2
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("demo.user2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createUser3()
	{
		try {
			//Creation of User3
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User3");
			oBrowser.findElement(By.name("email")).sendKeys("demo.user3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	

	private static void startExploring()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void User1Login()
	{
		try{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void User2Login()
	{
		try{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome2");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void User3Login()
	{
		try{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome3");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifyUser1Password()
	{
		try {
			//Modify password of User1
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//span[text()='User1, Demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Sample1");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Sample1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifyUser2Password()
	{
		try{
			//Modify password of User2
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//span[text()='User2, Demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Sample2");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Sample2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifyUser3Password()
	{
		try{
			//Modify password of User3
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//span[text()='User3, Demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Sample3");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Sample3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void user1ModifiedLogin()
	{
		try{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Sample1");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	private static void user2ModifiedLogin()
	{
		try{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Sample2");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void user3ModifiedLogin()
	{
		try{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Sample3");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser1()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//span[text()='User1, Demo']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(4000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUser2()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//span[text()='User2, Demo']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(4000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUser3()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//span[text()='User3, Demo']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(4000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	private static void logout()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeApplication() {
		try
		{
			oBrowser.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}



