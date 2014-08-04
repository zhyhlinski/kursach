package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbaySignOutForm extends BaseForm{
	private static String formlocator="//div[contains(@id,'AreaTitle')]//span[contains(text(),'ve signed out. See you again soon!')]";

	public EbaySignOutForm() {
		super(By.xpath(formlocator), "Ebay sign out form");
	}
}
