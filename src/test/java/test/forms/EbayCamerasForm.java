package test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class EbayCamerasForm extends BaseForm{
	private static String formlocator="//div[@class='content']/div/img[contains(@alt, 'Cameras & Camcorders')]";
	private Button btnDigitalCameras = new Button (By.xpath("//div[@class='nav']//a[contains(.,'Digital Cameras')]"),"Digital Cameras button");
    
	public void clickDigitalCameras() {
		btnDigitalCameras.click();
		browser.waitForPageToLoad();
    } 
	
	public EbayCamerasForm() {
		super(By.xpath(formlocator), "Ebay Cameras form");
	}

}