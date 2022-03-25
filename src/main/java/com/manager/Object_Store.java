package com.manager;

import org.openqa.selenium.WebDriver;


import com_automation_pom.Payment;
import com_automation_pom.Proceed;
import com_automation_pom.Signin_Page;
import com_automation_pom.T_Shirt;
import com_automation_pom.T_Shirt_Selection;
import com_automation_pom.login_page;

public class Object_Store {
	public static WebDriver driver;
	private Signin_Page login;
	private login_page text;
	private T_Shirt ts;
	private T_Shirt_Selection tShirt;
	private Proceed click;
	private Payment pay;
	
	public Object_Store(WebDriver driver2) {
		this.driver=driver2;
	}
public Signin_Page getLogin() {
		if (login==null) {
			login=new Signin_Page(driver);
			}
		return login;
	}
public login_page getText() {
		if (text==null) {
			text=new login_page(driver);
			}
		return text;
	}
public T_Shirt getTs() {
		if (ts==null) {
			ts=new T_Shirt(driver);
			}
		return ts;
	}
public T_Shirt_Selection gettShirt() {
		if (tShirt==null) {
			tShirt=new T_Shirt_Selection(driver);
			}
		return tShirt;
	}
public Proceed getClick() {
		if (click==null) {
			click=new Proceed(driver);
			}
		return click;
	}
public Payment getPay() {
		if (pay==null) {
			pay=new Payment(driver);
			}
		return pay;
	}
	
}
