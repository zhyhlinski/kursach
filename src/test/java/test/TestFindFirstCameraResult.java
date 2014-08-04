package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.forms.*;
import webdriver.BaseTest;

public class TestFindFirstCameraResult extends BaseTest {
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
		emf.mouseOverElectronics();
		logger.step(4);
		emf.camerasAssert();
		logger.step(5);
		emf.clickCameras();
		logger.step(6);
		EbayCamerasForm ecf = new EbayCamerasForm();
		logger.step(7);
		ecf.clickDigitalCameras();
		logger.step(8);
		EbayDigitalCamerasForm edcf = new EbayDigitalCamerasForm();
		logger.step(9);
		edcf.clickDigitalCameras();
		logger.step(10);
		EbaySearchResultsForm ecr = new EbaySearchResultsForm();
		logger.step(11);
		ecr.clickBuyItNow();
		logger.step(12);
		ecr.clickPriceShipHighest();
		finame = ecr.getFirstItemName();
		ecr.clickFirstItem();
		logger.step(13);
		EbayItemForm ecfif = new EbayItemForm();
		logger.step(14);
		ecfif.firstItemAssert(finame);
	}
}