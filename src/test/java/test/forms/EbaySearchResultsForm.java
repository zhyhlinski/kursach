package test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class EbaySearchResultsForm extends BaseForm{
	//private static String formlocator="//div[contains(@id,'Center') and contains(@class,'rr_present')]//span[@class='kwcat']/b[contains(.,'Digital Cameras')]";
	private static String formlocator="//body";
	//private Button btnBuyItNow = new Button (By.linkText("Buy It Now"),"Buy It Now button");
	private Button btnBuyItNow = new Button (By.xpath("//div[@class='pnl-b frmt']/a[contains(@title,'Buy It Now')]"),"Buy It Now button");
	private Button btnFirstItem = new Button (By.xpath("//div/table[contains(@r,'1')]//div[@class='ittl']/h3/a"),"First item button");
	
	private Label lbSearchResult = new Label(By.xpath("//div[contains(@id,'cbrt')]//span[@class='kwcat']"),"results for text");
	
	
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
		//System.out.println(lbSearchResult.getText());
		assert(lbSearchResult.getText().equals("results for "+search_str));

	}
	
	public EbaySearchResultsForm() {
		super(By.xpath(formlocator), "Search Results");
	}
}