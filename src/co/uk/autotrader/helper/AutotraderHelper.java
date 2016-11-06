package co.uk.autotrader.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.uk.autotrader.pages.AutotraderHomePage;

public class AutotraderHelper 
{
   private static WebDriver driver;
   
   static
   {
	   driver = null;
   }
   
   public static WebDriver ChromeBrowserLocation()
   {
	 System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
	 
	 return new ChromeDriver();
   }
   
   public static  void LaunchBrowser()
   {
	   driver = ChromeBrowserLocation();
   }
   
   public static void CloseBrowser()
   {
	   driver.close();
	   driver.quit();
   }
   
   public static void LaunchUrl(String url)
   {
	   driver.navigate().to(url);
	   driver.manage().window().maximize();
   }
   
   public AutotraderHomePage GivenINavigateToHomepage()
   {
	   LaunchUrl("http://www.autotrader.co.uk/");
	   
	   return new AutotraderHomePage();
   }
}
