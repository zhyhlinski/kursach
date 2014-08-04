package test;

import org.testng.annotations.Test;

import test.forms.*;
import webdriver.BaseTest;

public class TestSearch extends BaseTest {
	@Test
	public void runTest() {
		String site = "http://www.ebay.com/";
		String stext= "ipod 32gb 5g";
		logger.step(1);
		browser.navigate(site);
		browser.waitForPageToLoad();
		logger.step(2);
		EbayMainForm emf = new EbayMainForm();
		logger.step(3);
		emf.searchFor(stext);
		browser.waitForPageToLoad();
		logger.step(4);
		EbaySearchResultsForm ecr = new EbaySearchResultsForm();
		logger.step(5);
		ecr.searchAssert(stext);
	}
}
