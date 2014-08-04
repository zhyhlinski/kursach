package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbayMyEbayMessagesForm extends BaseForm {
	private static String formlocator="//div[@id='msgpanel']//span/h2[contains(text(),'All messages')]";

	public EbayMyEbayMessagesForm() {
		super(By.xpath(formlocator), "My Ebay Messages Form");
	}
}