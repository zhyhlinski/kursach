package test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class EbaySignInForm extends BaseForm{
	private TextBox tblogin = new TextBox(By.id("userid"),"login");
	private TextBox tbpass = new TextBox(By.id("pass"),"password");
	private Button btnSignIn = new Button (By.id("sgnBt"),"Sign in");
	public void signIn(String un,String pw)
	{
		fillUsername(un);
		fillPassword(pw);
		clickSignIn();
	}
	public void fillUsername(String un)
	{
		tblogin.type(un);
	}
	public void fillPassword(String pw)
	{
		tbpass.type(pw);
	}	
	public void clickSignIn()
	{
		btnSignIn.click();
		browser.waitForPageToLoad();
	}
	public EbaySignInForm() {
		super(By.id("userid"), "Ebay Sign in form");
	}
}