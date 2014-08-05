package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.forms.*;
import webdriver.BaseTest;

public class TestAddToCartAndRemove extends BaseTest {
	String site, login, pass, firstname, searchtext;
	 @Test
	 @Parameters({"siteUrl", "searchtext","login","pass","firstname"})
	 public void readParams(String siteUrl, String searchtext, String login, String pass, String firstname) throws Throwable {
	  this.site = siteUrl;
	  this.login = login;
	  this.pass = pass;
	  this.searchtext = searchtext;
	  this.firstname = firstname;
	  xTest();
	 }
	 @Override
	 @Parameters()
	public void runTest() {
		String finame;
		logger.step(1);
		browser.navigate(site);
		logger.step(2);
		EbayMainForm emf = new EbayMainForm();
		logger.step(3);
		emf.clickSignIn();
		logger.step(4);
		EbaySignInForm esif = new EbaySignInForm();
		logger.step(5);
		esif.signIn(login, pass);
		logger.step(6);
		emf = new EbayMainForm();
		logger.step(7);
		emf.signInAssert(firstname);
		logger.step(8);
		emf.searchFor(searchtext);
		logger.step(9);
		EbaySearchResultsForm ecr = new EbaySearchResultsForm();
		logger.step(10);
		ecr.searchAssert(searchtext);
		logger.step(11);
		ecr.clickBuyItNow();
		logger.step(12);
		ecr.clickPriceShipHighest();
		finame = ecr.getFirstItemName();
		logger.step(13);
		ecr.clickFirstItem();
		logger.step(14);
		EbayItemForm ecfif = new EbayItemForm();
		logger.step(15);
		ecfif.firstItemAssert(finame);
		logger.step(16);
		ecfif.clickAddToCart();
		logger.step(17);
		EbayShoppingCartForm escf = new EbayShoppingCartForm();
		logger.step(18);
		escf.clickRemove();
		logger.step(19);
		escf.emptyShoppingCartAssert();
	}
}