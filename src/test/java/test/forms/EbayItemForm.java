
package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class EbayItemForm extends BaseForm{
	private static String formlocator="//div[@id='CenterPanelInternal']//form[contains(@name,'viactiondetails')]";
	private Button btnAddToCart = new Button (By.id("isCartBtn_btn"),"Add to cart button");
	private Label firstItemName = new Label(By.xpath("//h1[contains(@id,'itemTitle')]"),"First item name text");

	public void clickAddToCart() {
		assert(btnAddToCart.isPresent());
		btnAddToCart.click();
	}
	public void firstItemAssert(String itemName)
	{
		assert(firstItemName.getText().equals(itemName));
	}
	
	public EbayItemForm() {
		super(By.xpath(formlocator), "Digital Cameras Results");
	}
}