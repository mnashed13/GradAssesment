package co.browserfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BroswserFactory {
public static WebDriver driver;
	
	public void BrowserFactory() {
		
	}
public static WebDriver getDriver() {
	
	if(driver == null) {
    System.setProperty("webdriver.chrome.driver","C:\\New folder\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");					     
	driver = new ChromeDriver();
	System.out.println("In top chrome ");
	System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	}
	return driver;
	
}

public static WebDriver getDriver(String browserName) {
	
	if(driver == null) {
    System.setProperty("webdriver.chrome.driver","C:\\New folder\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");					        
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("In bottom chrome");
//	System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
//	driver = new FirefoxDriver();

	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(100000000, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(100000000, TimeUnit.SECONDS);
	}
	return driver;	
	}


}
