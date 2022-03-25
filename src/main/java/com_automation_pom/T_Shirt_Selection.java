package com_automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_Shirt_Selection {
	public WebDriver driver;
	@FindBy(id="layered_id_attribute_group_2")private WebElement size;
	@FindBy(id="selectProductSort")private WebElement drp1;
	@FindBy(xpath="//img[@title=\"Faded Short Sleeve T-shirts\"]")private WebElement pic;
	@FindBy(xpath="//i[@class='icon-plus']")private WebElement quantity;
	@FindBy(xpath="//button[@name='Submit']")private WebElement adToCart;
	public T_Shirt_Selection(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getsize() {
		return size;
	}
	public WebElement getDrp1() {
		return drp1;
	}
	public WebElement getPic() {
		return pic;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getAdToCart() {
		return adToCart;
	}
	

}
