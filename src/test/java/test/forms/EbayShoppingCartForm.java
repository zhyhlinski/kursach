package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbayShoppingCartForm extends BaseForm{
	private static String formlocator="//div[@class='scCont']//div[@class='fl']";
	
	public EbayShoppingCartForm() {
		super(By.xpath(formlocator), "Ebay Shopping Cart");
	}
}