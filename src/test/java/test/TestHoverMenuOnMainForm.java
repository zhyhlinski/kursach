package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.forms.*;
import webdriver.BaseTest;

public class TestHoverMenuOnMainForm extends BaseTest{
	String site, login, pass, firstname, stext;
	 @Test
	 @Parameters({"siteUrl", "searchtextblog","login","pass","firstname"})
	 public void readParams(String siteUrl, String stext, String login, String pass, String firstname) throws Throwable {
	  this.site = siteUrl;
	  this.login = login;
	  this.pass = pass;
	  this.stext = stext;
	  this.firstname = firstname;
	  xTest();
	 }
	 @Override
	 @Parameters()
	public void runTest() {
		//String site = "http://www.ebay.com/";
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