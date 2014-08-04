package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.forms.*;
import webdriver.BaseTest;

public class TestFindFirstCameraResult extends BaseTest {
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
		//String site = "http://www.ebay.com/";
		logger.step(1);
		browser.navigate(site);
		browser.waitForPageToLoad();
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
		ecf.camerasAssert();
		logger.step(8);
		ecf.clickDigitalCameras();
		logger.step(9);
		//browser.waitForPageToLoad();
		EbayDigitalCamerasForm edcf = new EbayDigitalCamerasForm();
		logger.step(10);
		edcf.clickDigitalCameras();
		logger.step(11);
		EbaySearchResultsForm ecr = new EbaySearchResultsForm();
		logger.step(12);
		ecr.clickBuyItNow();
		browser.waitForPageToLoad();
		logger.step(13);
		//ecr = new ebayCamerasResults();
		//logger.step(14);
		finame = ecr.getFirstItemName();
		//System.out.print(finame);
		ecr.clickFirstItem();
		logger.step(14);
		EbayItemForm ecfif = new EbayItemForm();
		logger.step(15);
		ecfif.firstItemAssert(finame);
	}
}