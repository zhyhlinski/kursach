package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestAddToCartFirstCameraResult extends BaseTest {
	public String finame;
	public void runTest() {
		TestSignIn tsi = new TestSignIn();
		tsi.runTest();
		logger.step(8);
		EbayMainForm emf = new EbayMainForm();
		logger.step(9);
		emf.mouseOverElectronics();
		logger.step(10);
		emf.camerasAssert();
		logger.step(11);
		emf.clickCameras();
		logger.step(12);
		EbayCamerasForm ecf = new EbayCamerasForm();
		logger.step(13);
		ecf.camerasAssert();
		logger.step(14);
		ecf.clickDigitalCameras();
		logger.step(15);
		//browser.waitForPageToLoad();
		EbayDigitalCamerasForm edcf = new EbayDigitalCamerasForm();
		logger.step(16);
		edcf.clickDigitalCameras();
		logger.step(17);
		EbaySearchResultsForm ecr = new EbaySearchResultsForm();
		logger.step(18);
		ecr.clickBuyItNow();
		browser.waitForPageToLoad();
		logger.step(19);
		//ecr = new ebayCamerasResults();
		//logger.step(14);
		finame = ecr.getFirstItemName();
		//System.out.print(finame);
		ecr.clickFirstItem();
		logger.step(20);
		EbayItemForm ecfif = new EbayItemForm();
		logger.step(21);
		ecfif.firstItemAssert(finame);
		logger.step(22);
		ecfif.clickAddToCart();
		logger.step(23);
		browser.waitForPageToLoad();		
		logger.step(24);

	}
}