package co.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BrowserFactory {
	WebDriver driver;

	public void RenewGreenSlipTest(WebDriver driver) {
		this.driver= driver;
	}
	
	
	
	public void BrowserStart() throws Throwable{
		System.out.println("The Test has started");
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");					     
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qbe.com/au");
		
	}
	
//	public void titleCheck() throws Throwable{
//		String expectedTitle = "QBE Insurance Group - NSW Green Slips";
//		String actualTitle = driver.getTitle();
//		System.out.println("This title is correct");
//		
//	}
	
}
