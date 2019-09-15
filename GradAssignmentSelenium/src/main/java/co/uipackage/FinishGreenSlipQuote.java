package co.uipackage;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class FinishGreenSlipQuote {
	WebDriver driver;

	public FinishGreenSlipQuote(WebDriver driver) {
		this.driver=driver;
}
	@FindBy(how=How.CSS,using=".glyphicon-chevron-right")
	@CacheLookup
		WebElement FinishButtonClick;	

	
	
	

	
	public void FinishButtonWordpress() throws InterruptedException {
		Thread.sleep(3000);
		FinishButtonClick.click();
		Thread.sleep(3000);
		
		 
		 
	}
	
}