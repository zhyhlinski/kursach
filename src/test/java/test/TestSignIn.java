package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestSignIn extends BaseTest {
	public void runTest() {
		logger.step(1);
		browser.navigate(site);
		browser.waitForPageToLoad();
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
	}
	
}

