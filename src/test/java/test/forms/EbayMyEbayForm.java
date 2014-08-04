package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbayMyEbayForm extends BaseForm {
	private static String formlocator="//body";
	//My eBay: Summary
	private Label lbSummary = new Label(By.xpath("//div[contains(@id,'GlobalNavigation')]//tbody//b[@id='mainContent']/h1[@class='th-tih']"),"text: My eBay: Summary");
	private Label lbMessages = new Label(By.xpath("//div[@id='msgpanel']//span/h2[@class='g-m g-m0 myw-tl']"),"text: All Messages");
	
	public void summaryAssert(){
		assert(lbSummary.isPresent());
	}
	public void messagesAssert(){
		assert(lbMessages.isPresent());
	}
	public EbayMyEbayForm() {
		super(By.xpath(formlocator), "My google form");
	}
}