package com_automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='login']")private WebElement login;

	public Signin_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getsignin() {
		return login;
	}
	

}
