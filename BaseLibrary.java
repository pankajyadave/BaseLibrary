package BaseLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake.Result;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import ScreenshotUtility.Screenshotutility;

public class BaseLibrary
{
	public static WebDriver driver=new ChromeDriver();
		//public static WebDriver driver = new FirefoxDriver();
		//public static WebDriver driver=new InternetExplorerDriver();

	public void GetlaunchURL(String url)
	{
		//System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		driver.get(url);
		driver.manage().window().maximize();
// implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// implicit wait 
	}

// below method used for close the browser======================
	@AfterSuite
	public void TearDown()
	{
		//driver.quit();
	}
//  ======================
	
// below code for take screenshot after every method =====================
	
//	@AfterMethod
/*	public void Resultanalysis_Screenshot(ITestResult result)
	{
		try 
		{
			String methodname=result.getMethod().getMethodName();
			if(result.isSuccess())
			{
				Screenshotutility.getscreenshot("passedtest", methodname);
			}
			else if(result.getStatus()==ITestResult.FAILURE)
			{
				Screenshotutility.getscreenshot("failedtest", methodname);
			}
			else if(result.getStatus()==ITestResult.SKIP)
			{
				Screenshotutility.getscreenshot("skiptest", methodname);
			}
			
		} catch (Exception e) {
			System.out.println("Issue in Resultanalysis_Screenshot "+e);
		}
	}
// ==========================================================================
*/}
