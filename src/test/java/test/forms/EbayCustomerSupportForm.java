package test.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
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
	}
	public void clickContactEbay() {
		btnContactEbay.click();
	}
	public void mouseOverBying() {
		RemoteWebDriver driver = browser.getDriver();
    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(By.id("0_t"));
      	actions.moveToElement(menuHoverLink);
    	actions.perform();	
	}
	public void howToPayAssert(){
		assert(lbHowToPay.isPresent(10));
	}
	public EbayCustomerSupportForm() {
		super(By.xpath(formlocator), "Customer Support");
	}
}