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
	private static String formlocator="//body";//body[starts-with(., 'sz')]

	private Button btnSignIn = new Button (By.linkText("Sign in"),"Sign in");
	private Button btnSignOut = new Button (By.linkText("Sign out"),"Sign out");
	private Button btnMenu = new Button (By.id("gh-ug"),"Drop down menu");
	private Button btnCameras = new Button (By.xpath("//a[contains(@title,'Electronics') and contains(.,'Cameras & Photo')]"),"Cameras & Photo button");
	private Button btnSearch = new Button (By.id("gh-btn"),"Search button");
	private Button btnIphone = new Button (By.xpath("//a[contains(@title,'Electronics') and contains(.,'iPhone')]"),"Iphone button");
	//private Button btnMyEbay = new Button (By.id("gh-eb-My"),"My ebay button");
	private Button btnMyEbay = new Button (By.linkText("My eBay"),"My ebay button");
	private Button btnSummary = new Button (By.linkText("Summary"),"My ebay button");
	private Button btnMessages = new Button (By.linkText("Messages"),"Messages button");
	//
	private TextBox txbSearchBar = new TextBox(By.id("gh-ac"),"search bar");
	
	private Label lbusername = new Label(By.xpath("//span[contains(@class,'ds3pHTxt')]"),"text: You've signed out...");
	
	public void mouseOverElectronics()
	{
		final String labelLocatorOrId = "//a[contains(@class,'rt') and contains(.,'Electronics')]";
		RemoteWebDriver driver = browser.getDriver();
    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(By.xpath(labelLocatorOrId));
      	actions.moveToElement(menuHoverLink);
    	actions.perform();
	}
	
	public void mouseOverMyEbay() {
		RemoteWebDriver driver = browser.getDriver();
    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(By.linkText("My eBay"));
      	actions.moveToElement(menuHoverLink);
    	actions.perform();	
	}
	
	//Clicks
	public void clickMyEbay() {
		/*RemoteWebDriver driver = browser.getDriver();
    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(By.linkText("My eBay"));
    	actions.moveToElement(menuHoverLink);
    	actions.perform();
		browser.waitForPageToLoad();*/
		btnMyEbay.click();
	}
	public void clickMessages() {
		btnMessages.click();
	}
	public void clickCameras() {
		btnCameras.click();
	}
    public void clickSignIn() {
    	btnSignIn.click();
    }
    public void clickSignOut() {
    	btnMenu.click();
    	//browser.waitForPageToLoad();
    	btnSignOut.click();
    }   
    //#Clicks
    public void searchFor(String text) {
    	txbSearchBar.type(text);
    	btnSearch.click();
    }
    //Assert's
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
	//#Assert's
	
	public EbayMainForm() {
		
		//By.xpath(formlocator)
		super(By.id("gh-ac"), "Ebay main form");
	}


}
