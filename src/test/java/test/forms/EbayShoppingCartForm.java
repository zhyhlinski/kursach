package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbayShoppingCartForm extends BaseForm{
	private static String formlocator="//body//div/h2[contains(text(), 'Your eBay Shopping Cart')]";
	//private Button btnRemove = new Button (By.linkText("Remove")),"First item remove button");
	
	private Button btnRemove = new Button (By.xpath("//div[@class='tr']/a[contains(@class,'action actionLink')]"),"First item remove button");
	
	private Label lbEmptyShoppengCart = new Label(By.xpath("//div[contains(@id,'centralarea')]//div[contains(@id,'CARTSection')]//div[contains(text(),'Your shopping cart is empty')]"),"Your shopping cart is empty, but it doesn't have to be.");
	public void emptyShoppingCartAssert(){
		assert(lbEmptyShoppengCart.isPresent());
	}
	public void clickRemove() {
		btnRemove.click();
	}
	public EbayShoppingCartForm() {
		super(By.xpath(formlocator), "Ebay Shopping Cart");
	}
}