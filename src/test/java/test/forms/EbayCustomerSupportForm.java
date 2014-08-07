package test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class EbayCustomerSupportForm extends BaseForm{
	private static String formlocator="//div[@class='pagewidth']//tr/td[contains(text(),'Customer Support')]";
	private Button btnContactEbay = new Button (By.id("cstbw_1"),"Contact eBay");
	private Button btnHowToPay = new Button (By.id("1_0_l2"),"How to pay for items");
	private Label lbHowToPay = new Label(By.xpath("//div[contains(@class,'tabbable')]//tbody//span[contains(text(),'How to pay for items')]"),"How to pay for items text");//contains(text(),'How to pay for items')
	
	public void clickHowToPay() {
		mouseOverBying();
		btnHowToPay.click();
		browser.waitForPageToLoad();
	}
	public void clickContactEbay() {
		btnContactEbay.click();
		browser.waitForPageToLoad();
	}
	public void mouseOverBying()
	{
		mouseOver(By.id("0_t"));
	}
	public void howToPayAssert(){
		assert(lbHowToPay.isPresent(10));
	}
	public EbayCustomerSupportForm() {
		super(By.xpath(formlocator), "Customer Support");
	}
}