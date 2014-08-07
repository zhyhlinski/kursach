package test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class EbayDigitalCamerasForm extends BaseForm{
	private static String formlocator="//div[@id='Body']//nav[contains(@role, 'navigation')]//li/span[contains(@aria-label,'Digital Cameras')]";
	private Button btnRefineResults = new Button (By.linkText("Refine results"),"Refine Results button");
	
	public void clickRefineResults() {
		btnRefineResults.click();
		browser.waitForPageToLoad();
    } 
	
	public EbayDigitalCamerasForm() {
		super(By.xpath(formlocator), "Items from Digital Cameras");
	}
}