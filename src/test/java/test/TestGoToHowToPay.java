 package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestGoToHowToPay extends BaseTest {
	public void runTest() {
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
		emf.clickCustomerSupport();
		browser.waitForPageToLoad();
		logger.step(9);
		EbayCustomerSupportForm ecsf = new EbayCustomerSupportForm();
		logger.step(10);
		ecsf.clickContactEbay();
		logger.step(11);
		ecsf = new EbayCustomerSupportForm();
		logger.step(12);
		ecsf.clickHowToPay();
		logger.step(13);
		ecsf = new EbayCustomerSupportForm();
		logger.step(14);
		ecsf.howToPayAssert();
	}
	
}