package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestMenuOnMainForm extends BaseTest{
	public void runTest() {
		logger.step(1);
		browser.navigate(site);
		browser.waitForPageToLoad();
		logger.step(2);
		EbayMainForm emf = new EbayMainForm();
		logger.step(3);
		emf.mouseOverElectronics();
		logger.step(4);
		emf.iphoneAssert();	
	}
}