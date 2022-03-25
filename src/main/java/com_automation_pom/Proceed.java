package com_automation_pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Proceed to checkout']")private WebElement pro;
	@FindBy(xpath="//a[@title='Proceed to checkout'])[2]")private WebElement pro1;
	@FindBy(xpath="//button[@name='processAddress']")private WebElement pro2;
	@FindBy(id="cgv")private WebElement check;
	@FindBy(xpath="//button[@name='processCarrier']")private WebElement pro3;
	public Proceed(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	public WebElement getPro() {
		return pro;
	}
	public WebElement getPro1() {
		return pro1;
	}
	public WebElement getPro2() {
		return pro2;
	}
	public WebElement getCheck() {
		return check;
	}
	public WebElement getPro3() {
		return pro3;
	}
	

}
