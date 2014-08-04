package test.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbaySearchResultsForm extends BaseForm{
	private static String formlocator="//div[contains(@id,'Center')]//div[contains(@id,'Results')]";
	private Button btnBuyItNow = new Button (By.xpath("//div[@class='pnl-b frmt']/a[contains(@title,'Buy It Now')]"),"Buy It Now button");
	private Button btnFirstItem = new Button (By.xpath("//div/table[contains(@r,'1')]//div[@class='ittl']/h3/a"),"First item button");
	private Button btnPriceShipHighest = new Button (By.linkText("Price + Shipping: highest first"),"Price + Shipping: highest first");
	//
	private Label lbSearchResult = new Label(By.xpath("//div[contains(@id,'cbrt')]//span[@class='kwcat']"),"results for text");
	
	
	public void mouseOverSortMenu() {
		RemoteWebDriver driver = browser.getDriver();
    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(By.xpath("//div[contains(@id,'Center')]//div[contains(@class,'cbrt')]//ul[@class='sel']/li"));
      	actions.moveToElement(menuHoverLink);
    	actions.perform();	
	}	
	
	public void clickPriceShipHighest() {
		mouseOverSortMenu();
		btnPriceShipHighest.click();
    } 
	public String getFirstItemName()
	{
		return btnFirstItem.getText();
	}
	public void clickFirstItem() {
		btnFirstItem.click();
    } 
	public void clickBuyItNow() {
		btnBuyItNow.click();
    } 
	
	public void searchAssert(String search_str){
		assert(lbSearchResult.getText().equals("results for "+search_str));
	}
	
	public EbaySearchResultsForm() {
		super(By.xpath(formlocator), "Search Results");
	}
}