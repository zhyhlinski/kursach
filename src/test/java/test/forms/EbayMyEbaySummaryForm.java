package test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;

public class EbayMyEbaySummaryForm extends BaseForm {
	private static String formlocator="//div[contains(@id,'GlobalNavigation')]//b[@id='mainContent']/h1[contains(text(),'My eBay: Summary')]";
	public EbayMyEbaySummaryForm() {
		super(By.xpath(formlocator), "My Ebay Summary Form");
	}
}