package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.forms.*;
import webdriver.BaseTest;

public class TestAddToCartFirstCameraResult extends BaseTest {
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
		emf.mouseOverElectronics();
		logger.step(9);
		emf.camerasAssert();
		logger.step(10);
		emf.clickCameras();
		logger.step(11);
		EbayCamerasForm ecf = new EbayCamerasForm();
		logger.step(12);
		ecf.clickDigitalCameras();
		logger.step(13);
		EbayDigitalCamerasForm edcf = new EbayDigitalCamerasForm();
		logger.step(14);
		edcf.clickDigitalCameras();
		logger.step(15);
		EbaySearchResultsForm ecr = new EbaySearchResultsForm();
		logger.step(16);
		ecr.clickBuyItNow();
		logger.step(17);
		ecr.clickPriceShipHighest();
		finame = ecr.getFirstItemName();
		ecr.clickFirstItem();
		logger.step(18);
		EbayItemForm ecfif = new EbayItemForm();
		logger.step(19);
		ecfif.firstItemAssert(finame);
		logger.step(20);
		ecfif.clickAddToCart();
		logger.step(21);
		EbayShoppingCartForm escf = new EbayShoppingCartForm();
		logger.step(22);
		escf.clickRemove();
		logger.step(23);
		escf.emptyShoppingCartAssert();

	}
}