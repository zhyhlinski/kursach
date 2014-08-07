package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestAddToCartAndRemove extends BaseTest {
	public void runTest() {
		String finame;
		logger.step(1);
		browser.navigate(site);
		browser.waitForPageToLoad();
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
		ecr = new EbaySearchResultsForm();
		logger.step(13);
		ecr.clickPriceShipHighest();
		logger.step(14);
		ecr = new EbaySearchResultsForm();
		logger.step(15);
		finame = ecr.getFirstItemName();
		ecr.clickFirstItem();
		logger.step(16);
		EbayItemForm ecfif = new EbayItemForm();
		logger.step(17);
		ecfif.firstItemAssert(finame);
		logger.step(18);
		ecfif.clickAddToCart();
		logger.step(19);
		EbayShoppingCartForm escf = new EbayShoppingCartForm();
		logger.step(20);
		escf.nameOfItemAssert(finame);
		logger.step(21);
		escf.clickRemove();
		logger.step(22);
		escf = new EbayShoppingCartForm();
		logger.step(23);
		escf.emptyShoppingCartAssert();
	}
}