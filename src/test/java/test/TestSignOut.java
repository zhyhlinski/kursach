package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestSignOut extends BaseTest {

	
	public void runTest() {
		TestSignIn tsi = new TestSignIn();
		tsi.runTest();
		logger.step(8);
		EbayMainForm emf = new EbayMainForm();
		logger.step(9);
		emf.clickSignOut();
		browser.waitForPageToLoad();
		logger.step(10);
		emf = new EbayMainForm();
		logger.step(11);
		emf.signOutAssert();
	}
	
}