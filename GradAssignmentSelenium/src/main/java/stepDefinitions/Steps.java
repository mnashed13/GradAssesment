package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import co.browserfactory.BroswserFactory;
import co.browserfactory.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps{
	public WebDriver driver;
	
	
	@Given("^open the google chrome browser and start the application$")
	public void open_the_google_chrome_browser_and_start_the_application() throws Throwable{
		System.out.println("The Test has started");
	 driver = Hooks.driver;
//		System.setProperty("webdriver.chrome.driver","C:\\New folder\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");					     
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		
	}
	@When("^I go to the homepage$")
	public void I_go_to_the_homepage() throws Throwable{
		System.out.println("Started The Test");
		driver.get("https://www.qbe.com/au");
	}
	@Then("^I am on the homepage and click on Car and vehicle in the menu bar$")
	public void I_am_on_the_homepage_and_click_on_Car_and_vehicle_in_the_menu_bar() throws Throwable{
	WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Car & Vehicle')]"));
	element.click();	
	}
	
	@When("^when I arrive to the drop down menu we can click on CTP$")
	public void when_I_arrive_to_the_dropdown_menu_we_can_click_on_CTP() throws Throwable{
		WebElement CTP = driver.findElement(By.cssSelector(".c-mega-menu__dropdown:nth-child(1) .list-group-item:nth-child(2) > .hyperlink"));
		CTP.click();
	}
	@When("^the user clicks on the NSW$")
	public void the_user_clicks_on_the_NSW() throws Throwable{
		WebElement NSWButton = driver.findElement(By.cssSelector(".c-columnContent__content:nth-child(1) > .c-columnContent__buttonContent:nth-child(2) > .c-columnContent__hyperlink"));
		NSWButton.click();
		
	} 
	
	

	
}
	
	

