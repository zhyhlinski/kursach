
package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbayItemForm extends BaseForm{
	private static String formlocator="//body/div[@id='Body']";
	private Button btnAddToCart = new Button (By.id("isCartBtn_btn"),"Add to cart button");
	private Label firstItemName = new Label(By.xpath("//h1[contains(@id,'itemTitle')]"),"First item name text");

	public void clickAddToCart() {
		btnAddToCart.click();
	}
	public void firstItemAssert(String itemName)
	{
		assert(firstItemName.getText().equals(itemName));
	}
	
	public EbayItemForm() {
		super(By.xpath(formlocator), "Digital Cameras Results");
	}
}//isCartBtn_btn