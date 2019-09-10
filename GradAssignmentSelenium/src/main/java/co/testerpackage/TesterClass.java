package co.testerpackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import co.browserfactory.*;
import co.uipackage.MenuUITest;


 
public class TesterClass extends HelperClass{

	public TesterClass(){
	}
 
	@Test
	public void returnTicket() {
		try {
			System.out.println("Started The Test");
			driver.get("https://www.qbe.com/au");
			System.out.println("The Browser is open on to QBE");
			MenuUITest  MenuUI = PageFactory.initElements(driver, MenuUITest.class);
			MenuUI.MenuUIWordpress();
			System.out.println("menu button click worked");
			
			
			
			
			
			
			
			
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
}