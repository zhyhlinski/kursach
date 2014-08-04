package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.forms.*;
import webdriver.BaseTest;

public class TestAddToCartFirstCameraResult extends BaseTest {
	
	String site, login, pass, firstname, stext;
	 @Test
	 @Parameters({"siteUrl", "searchtextblog","login","pass","firstname"})
	 public void readParams(String siteUrl, String stext, String login, String pass, String firstname) throws Throwable {
	  this.site = siteUrl;
	  this.login = login;
	  this.pass = pass;
	  this.stext = stext;
	  this.firstname = firstname;
	  xTest();
	 }
	 @Override
	 @Parameters()
	
	public void runTest() {
		String finame;
		logger.step(1);
		browser.navigate(site);
		browser.waitForPageToLoad();
		logger.step(2);
		EbayMainForm emf = new EbayMainForm();
		logger.step(3);
		emf.clickSignIn();
		browser.waitForPageToLoad();
		logger.step(4);
		EbaySignInForm esif = new EbaySignInForm();
		logger.step(5);
		esif.signIn(login, pass);
		browser.waitForPageToLoad();
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
		ecf.camerasAssert();
		logger.step(13);
		ecf.clickDigitalCameras();
		logger.step(14);
		//browser.waitForPageToLoad();
		EbayDigitalCamerasForm edcf = new EbayDigitalCamerasForm();
		logger.step(15);
		edcf.clickDigitalCameras();
		logger.step(16);
		EbaySearchResultsForm ecr = new EbaySearchResultsForm();
		logger.step(17);
		ecr.clickBuyItNow();
		browser.waitForPageToLoad();
		logger.step(18);
		finame = ecr.getFirstItemName();
		ecr.clickFirstItem();
		logger.step(19);
		EbayItemForm ecfif = new EbayItemForm();
		logger.step(20);
		ecfif.firstItemAssert(finame);
		logger.step(21);
		ecfif.clickAddToCart();
		logger.step(22);
		browser.waitForPageToLoad();		
		logger.step(23);

	}
}