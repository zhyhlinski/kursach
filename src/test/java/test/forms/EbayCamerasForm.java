package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbayCamerasForm extends BaseForm{
	private static String formlocator="//div[@class='content']/div/img[contains(@alt, 'Cameras & Camcorders')]";

	private Button btnDigitalCameras = new Button (By.xpath("//div[@class='nav']//a[contains(.,'Digital Cameras')]"),"Digital Cameras button");
    
	public void clickDigitalCameras() {
		btnDigitalCameras.click();
    } 
	
	public EbayCamerasForm() {
		super(By.xpath(formlocator), "Ebay Sign in form");
	}

}