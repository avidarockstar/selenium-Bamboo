package com.trigent.selenium;

import genericlib.Driver;
import genericlib.constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobejectfactory.Login;

public class demoTest {
	
	WebDriver d;
	Login l;
	
	@Test
	public void firstTest(){
		
		d=Driver.getDriver();
		d.get(constant.URL);
		Login lg=PageFactory.initElements(d, Login.class);
		lg.logintoApp();
		System.out.println("hi");
		//sks
		
		
		
	}

}
