package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbayDigitalCamerasForm extends BaseForm{
	private static String formlocator="//div[@id='Body']//nav[contains(@role, 'navigation')]//li/span[contains(@aria-label,'Digital Cameras')]";
	
	//private Button btnRefineResults = new Button (By.xpath("//div[@class='nav']//a[contains(.,'Digital Cameras')]"),"Refine Results button");
	private Button btnRefineResults = new Button (By.linkText("Refine results"),"Refine Results button");
	
	public void clickDigitalCameras() {
		btnRefineResults.click();
    } 
	
	public EbayDigitalCamerasForm() {
		super(By.xpath(formlocator), "Items from Digital Cameras");
	}
}