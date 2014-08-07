package test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class EbaySearchResultsForm extends BaseForm{
	private static String formlocator="//div[contains(@id,'Center')]//div[contains(@id,'Results')]";
	private Button btnBuyItNow = new Button (By.xpath("//div[@class='pnl-b frmt']/a[contains(@title,'Buy It Now')]"),"Buy It Now button");
	private Button btnFirstItem = new Button (By.xpath("//div/table[contains(@r,'1')]//div[@class='ittl']/h3/a"),"First item button");
	private Button btnPriceShipHighest = new Button (By.linkText("Price + Shipping: highest first"),"Price + Shipping: highest first");
	private Label lbSearchResult = new Label(By.xpath("//div[contains(@id,'cbrt')]//span[@class='kwcat']"),"results for text");
	private Button btnSortMenu = new Button (By.xpath("//div[contains(@id,'Center')]//div[contains(@class,'cbrt')]//ul[@class='sel']/li"),"Sort menu button");

	public void clickPriceShipHighest() {
		btnSortMenu.click();
		btnPriceShipHighest.isPresent(10);
		btnPriceShipHighest.click();
    } 
	public String getFirstItemName()
	{
		return btnFirstItem.getText();
	}
	public void clickFirstItem() {
		btnFirstItem.click();
		browser.waitForPageToLoad();
    } 
	public void clickBuyItNow() {
		btnBuyItNow.click();
		browser.waitForPageToLoad();
    } 
	
	public void searchAssert(String search_str){
		assert(lbSearchResult.getText().equals("results for "+search_str));
	}
	
	public EbaySearchResultsForm() {
		super(By.xpath(formlocator), "Search Results");
	}
}