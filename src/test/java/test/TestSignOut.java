package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.forms.*;
import webdriver.BaseTest;

public class TestSignOut extends BaseTest {
	String site, login, pass, firstname, stext;
	 @Test
	 @Parameters({"siteUrl", "searchtextblog","login","pass","firstname"})
	 public void readParams(String siteUrl, String searchtextblog, String login, String pass, String firstname) throws Throwable {
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
		/*String site = "http://www.ebay.com/";
		String login = "zomox@walkmail.net";
		String pass = "itransitiona1qa";
		String firstname = "Kot";*/
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
		emf.clickSignOut();
		browser.waitForPageToLoad();
		logger.step(9);
		emf = new EbayMainForm();
		logger.step(10);
		emf.signOutAssert();
	}
	
}