package test;

import test.forms.*;
import webdriver.BaseTest;

public class DemoTest extends BaseTest {

	
	public void runTest() {
		/*logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		TutSearchForm tsf = new TutSearchForm();
		tsf.assertLogo();
		logger.step(3);
		tsf.searchFor("A1QA");
		logger.step(4);
		browser.waitForPageToLoad();
		logger.step(5);
		tsf.searchAssert();*/

	/*	logger.step(1);
		browser.navigate("http://www.ebay.com/");
		browser.waitForPageToLoad();
		logger.step(2);
		EbayMainForm emf = new EbayMainForm();
		logger.step(3);
		emf.clickSignIn();
		browser.waitForPageToLoad();
		logger.step(4);
		EbaySignInForm esif = new EbaySignInForm();
		logger.step(5);
		esif.signIn("gemul@alivance.com", "itransitiona1qa");
		browser.waitForPageToLoad();
		logger.step(6);
		emf.signInAssert("Kot");
		logger.step(7);
		emf.clickMyEbay();
		logger.step(8);
		browser.waitForPageToLoad();*/
		
		//Test 1. Loging in and check that it really logged in
		/*logger.step(1);
		browser.navigate("http://www.ebay.com/");
		logger.step(2);
		//browser.waitForPageToLoad();
		EbayMainForm emf = new EbayMainForm();
		logger.step(3);
		emf.clickSignIn();
		logger.step(4);
		//browser.waitForPageToLoad();
		logger.step(5);
		EbaySignInForm esif = new EbaySignInForm();
		logger.step(6);
		esif.fillUsername("zomox@walkmail.net");
		logger.step(7);
		esif.fillPassword("itransitiona1qa");
		logger.step(8);
		esif.clickSignIn();
		logger.step(9);
		//browser.waitForPageToLoad();
		//emf = new EbayMainForm();
		logger.step(10);
		emf.signInAssert("Kot");
		logger.step(11);
		emf.clickSignOut();
		logger.step(12);
		EbaySignOutForm esof = new EbaySignOutForm();
		logger.step(13);
		esof.signOutAssert();*/
		
	
		
		//Search for text and check that result contain ...
		/*String stext= "ipod 32gb 5g";
		logger.step(1);
		browser.navigate("http://www.ebay.com/");
		logger.step(2);
		EbayMainForm emf = new EbayMainForm();
		logger.step(3);
		emf.searchFor(stext);
		logger.step(4);
		browser.waitForPageToLoad();
		logger.step(5);
		EbaySearchResults ecr = new EbaySearchResults();
		logger.step(6);
		ecr.searchAssert(stext);*/
		
		//Test4 - наводим на Electronics, нажимаем камеры, проверяем что перешли в камеры
		/*logger.step(1);
		browser.navigate("http://www.ebay.com/");
		logger.step(2);
		EbayMainForm emf = new EbayMainForm();
		logger.step(3);
		emf.mouseOverObject(browser.getDriver(),"//a[contains(@class,'rt') and contains(.,'Electronics')]",0);
		logger.step(4);
		//emf.camerasAssert();
		//logger.step(5);
		emf.clickCameras();
		logger.step(6);
		EbayCamerasForm ecf = new EbayCamerasForm();
		logger.step(7);
		ecf.camerasAssert();
		logger.step(8);
		ecf.clickDigitalCameras();
		logger.step(9);
		//browser.waitForPageToLoad();
		EbayDigitalCamerasForm edcf = new EbayDigitalCamerasForm();
		logger.step(10);
		edcf.clickDigitalCameras();
		logger.step(11);
		EbaySearchResults ecr = new EbaySearchResults();
		logger.step(12);
		ecr.clickBuyItNow();
		browser.waitForPageToLoad();
		logger.step(13);
		//ecr = new ebayCamerasResults();
		//logger.step(14);
		String finame = ecr.getFirstItemName();
		//System.out.print(finame);
		ecr.clickFirstItem();
		logger.step(14);
		EbayItemForm ecfif = new EbayItemForm();
		logger.step(15);
		ecfif.firstItemAssert(finame);*/
		//browser.waitForPageToLoad();
	}



}
