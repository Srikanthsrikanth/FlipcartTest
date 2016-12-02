package com.modelclasses;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class LoginPageModel {
	
	WebDriver driver;
	
	public LoginPageModel(WebDriver driver) {
    
		this.driver= driver;
	}

	@FindBy(how=How.XPATH,using="//a[(@class='_2k0gmP') and (@data-aid='Login')]")
	WebElement login;
	@FindBy(how= How.XPATH,using="//input[@class='_2zrpKA']") 
	WebElement id;
	@FindBy(how=How.XPATH,using="//input[@class='_2zrpKA _3v41xv']") 
	WebElement password;
	@FindBy(how=How.CLASS_NAME,using="//*[(@class='_2AkmmA _1LctnI _7UHT_c')]") 
	WebElement login_Button;
	@Test
	public void getLogin(String uName,String pass) throws InterruptedException
  {
	  
	  
	  
	  login.click();
	  id.sendKeys(uName);
	  password.sendKeys(pass);
	  
	  Thread.sleep(3000);
	  login_Button.click();
	  Thread.sleep(3000);
  }
	
	  
  }