package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestGoToMessages extends BaseTest {
	public void runTest() {
		TestSignIn tsi = new TestSignIn();
		tsi.runTest();
		logger.step(8);
		EbayMainForm emf = new EbayMainForm();
		logger.step(9);
		emf.mouseOverMyEbay();
		logger.step(10);
		emf.clickMessages();
		logger.step(11);
		browser.waitForPageToLoad();
		logger.step(12);
		EbayMyEbayForm emef = new EbayMyEbayForm();
		logger.step(13);
		emef.messagesAssert();
	}
}