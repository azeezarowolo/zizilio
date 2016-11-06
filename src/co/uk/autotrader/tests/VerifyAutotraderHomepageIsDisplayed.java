package co.uk.autotrader.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.uk.autotrader.helper.AutotraderHelper;

public class VerifyAutotraderHomepageIsDisplayed extends AutotraderHelper
{
  @Before
  public void setup()
  {
	LaunchBrowser();  
  }
  @After
  public void teardown()
  {
	CloseBrowser();  
  }
  
  @Test
  public void VerifyAutotraderHomepageIsDisplayedTest()
  {
	GivenINavigateToHomepage();  
  }
}
