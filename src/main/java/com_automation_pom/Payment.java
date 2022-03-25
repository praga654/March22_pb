package com_automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Pay by check.']")private WebElement pay;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement con;
	@FindBy(xpath="//a[@title='Back to orders']")private WebElement con1;
	public Payment(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getPay() {
		return pay;
	}
	public WebElement getCon() {
		return con;
	}
	public WebElement getCon1() {
		return con1;
	}
	

}

		
	
	


