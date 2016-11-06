package co.uk.autotrader.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.uk.autotrader.helper.Helper;

public class SearchForACar extends Helper 
{
@Before
public void setup() throws Exception
{
	launchBrowser("Chrome");
}

	@After
	public void teardown() throws Exception 
	{
     closeBrowser();
     }

	
	@Test
	public void SearchForACarTest() 
	{

	}


	

}
