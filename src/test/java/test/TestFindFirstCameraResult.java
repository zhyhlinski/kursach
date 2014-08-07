package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestFindFirstCameraResult extends BaseTest {
	public void runTest() {
		String finame;
		logger.step(1);
		browser.navigate(site);
		browser.waitForPageToLoad();
		logger.step(2);
		EbayMainForm emf = new EbayMainForm();
		logger.step(3);
		emf.mouseOverElectronics();
		logger.step(4);
		emf.clickCameras();
		logger.step(5);
		EbayCamerasForm ecf = new EbayCamerasForm();
		logger.step(6);
		ecf.clickDigitalCameras();
		logger.step(7);
		EbayDigitalCamerasForm edcf = new EbayDigitalCamerasForm();
		logger.step(8);
		edcf.clickRefineResults();
		logger.step(9);
		EbaySearchResultsForm ecr = new EbaySearchResultsForm();
		logger.step(10);
		ecr.clickBuyItNow();
		logger.step(11);
		ecr = new EbaySearchResultsForm();
		logger.step(12);
		ecr.clickPriceShipHighest();
		logger.step(13);
		ecr = new EbaySearchResultsForm();
		logger.step(14);
		finame = ecr.getFirstItemName();
		ecr.clickFirstItem();
		logger.step(15);
		EbayItemForm ecfif = new EbayItemForm();
		logger.step(16);
		ecfif.firstItemAssert(finame);
	}
}