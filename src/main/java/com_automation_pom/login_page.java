package com_automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	public WebDriver driver;
	
@FindBy(id="email") private WebElement email;
@FindBy(id="passwd") private WebElement pass;
@FindBy(id="SubmitLogin") private WebElement sub;
public login_page(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver1, this);
	
}
public WebElement getEmail() {
	return email;
}
public WebElement getPass() {
	return pass;
}
public WebElement getSub() {
	return sub;
}

}