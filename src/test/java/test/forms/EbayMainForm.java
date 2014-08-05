package test.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

//import com.steadystate.css.parser.Locatable;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbayMainForm extends BaseForm{
	private Button btnCustomerSupport = new Button (By.linkText("Customer Support"),"Customer Support");
	private Button btnSignIn = new Button (By.linkText("Sign in"),"Sign in");
	private Button btnSignOut = new Button (By.linkText("Sign out"),"Sign out");
	private Button btnCameras = new Button (By.xpath("//a[contains(@title,'Electronics') and contains(.,'Cameras & Photo')]"),"Cameras & Photo button");
	private Button btnSearch = new Button (By.id("gh-btn"),"Search button");
	private Button btnIphone = new Button (By.xpath("//a[contains(@title,'Electronics') and contains(.,'iPhone')]"),"Iphone button");
	private Button btnMyEbay = new Button (By.linkText("My eBay"),"My ebay button");
	private Button btnMessages = new Button (By.linkText("Messages"),"Messages button");
	private Button btnShoppingCart = new Button (By.id("gh-cart-i"),"Shopping Cart button");
	private TextBox txbSearchBar = new TextBox(By.id("gh-ac"),"search bar");
	private Label lbusername = new Label(By.xpath("//span[contains(@class,'ds3pHTxt')]"),"text: You've signed out...");
	
	public void mouseOver(By by)
	{
		RemoteWebDriver driver = browser.getDriver();
    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(by);
      	actions.moveToElement(menuHoverLink);
    	actions.perform();	
	}
	public void mouseOverElectronics()
	{
		final String labelLocatorOrId = "//a[contains(@class,'rt') and contains(.,'Electronics')]";
		mouseOver(By.xpath(labelLocatorOrId));
	}
	public void mouseOverCameras()
	{
		mouseOver(By.xpath("//a[contains(@title,'Electronics') and contains(.,'Cameras & Photo')]"));
	}
	public void mouseOverMyEbay() {
    	mouseOver(By.linkText("My eBay"));
	}
	public void mouseOverAccountMenu() {
    	mouseOver(By.id("gh-ug"));
	}	
	public void clickCustomerSupport() {
		btnCustomerSupport.click();
	}
	public void clickMyEbay() {
		btnMyEbay.click();
	}
	public void clickShoppingCart() {
		btnShoppingCart.click();
	}
	public void clickMessages() {
		btnMessages.click();
	}
	public void clickCameras() {
		btnCameras.isPresent(10);
		RemoteWebDriver driver = browser.getDriver();
		driver.findElementByXPath("//a[contains(@title,'Electronics') and contains(.,'Cameras & Photo')]").click();
		//mouseOverCameras();
		//
		//btnCameras.click();
	}
    public void clickSignIn() {
    	btnSignIn.click();
    }
    public void clickSignOut() {
    	mouseOverAccountMenu();
    	btnSignOut.click();
    }   
    public void searchFor(String text) {
    	txbSearchBar.type(text);
    	btnSearch.click();
    }
	public void signInAssert(String username){
		final Label lbusername = new Label(By.xpath("//a[contains(.,'"+username+"')]"),"username text");
		assert(lbusername.isPresent());
	}
	public void camerasAssert(){
		assert(btnCameras.isPresent(10));
	}
	public void iphoneAssert(){
		assert(btnIphone.isPresent(10));
	}
	public void signOutAssert(){
		assert(lbusername.isPresent());
	}
	public EbayMainForm() {
		super(By.id("gh-ac"), "Ebay main form");
	}


}
