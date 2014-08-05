package test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;

public class EbaySignOutForm extends BaseForm{
	private static String formlocator="//div[contains(@id,'AreaTitle')]//span[contains(text(),'ve signed out. See you again soon!')]";

	public EbaySignOutForm() {
		super(By.xpath(formlocator), "Ebay sign out form");
	}
}
