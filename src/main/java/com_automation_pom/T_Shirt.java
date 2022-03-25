package com_automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_Shirt {
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='T-shirts'])[2]") private WebElement tShirt;

	public T_Shirt(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement gettShirt() {
		return tShirt;
	}
	

}


  