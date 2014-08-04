package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestGoToMyEbay extends BaseTest {
	public void runTest() {
		TestSignIn tsi = new TestSignIn();
		tsi.runTest();
		logger.step(8);
		EbayMainForm emf = new EbayMainForm();
		logger.step(9);
		emf.clickMyEbay();
		browser.waitForPageToLoad();
		logger.step(10);
		EbayMyEbayForm emef = new EbayMyEbayForm();
		logger.step(11);
		emef.summaryAssert();
	}
}
