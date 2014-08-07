package webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * An abstract class that describes the basic test application contains
 * methods for logging and field test settings (options)
 */
public abstract class BaseTest extends BaseEntity{

 /**
  * To override.
  */
	public String site, login, pass, firstname, searchtext;
	@Test
	 @Parameters({"siteUrl", "searchtext","login","pass","firstname"})
	 public void readParams(String siteUrl, String searchtext, String login, String pass, String firstname) throws Throwable {
	  this.site = siteUrl;
	  this.login = login;
	  this.pass = pass;
	  this.searchtext = searchtext;
	  this.firstname = firstname;
	  xTest();
	 }
	
	 @Parameters()
	
 public abstract void runTest();

 /**
  * Test
  * @throws Throwable Throwable
  */
 
 

 public void xTest() throws Throwable {
  Class<? extends BaseTest> currentClass = this.getClass();
  
  try {
   logger.logTestName(currentClass.getName());
   runTest();
   logger.logTestEnd(currentClass.getName());
  } catch (Throwable e) {
   
    logger.warn("");
    logger.warnRed(getLoc("loc.test.failed"));
    logger.warn("");
    throw e;
   }
  
 }

 /**
  * Format logging
  * @param message Message
  * @return Message
  */
 protected String formatLogMsg(final String message) {
  return message;
 }

}