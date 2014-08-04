package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestFindFirstCameraResult extends BaseTest {
	public String finame;
	public void runTest() {
		String site = "http://www.ebay.com/";
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
	public String getFirstItemName(){
		return finame;
	}
}