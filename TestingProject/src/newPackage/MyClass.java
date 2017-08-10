/*package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class MyClass {

	
	public static void main(String[] args) {

		String web = "http://toolsqa.wpengine.com/automation-practice-form/";
		MyClassNavigation myClassNav = new MyClassNavigation();
		
		// Create web driver
		WebDriver webDriver = new ChromeDriver();
		myClassNav = PageFactory.initElements(webDriver, MyClassNavigation.class);

		webDriver.manage().window().maximize();
		
		// Get to website
		webDriver.navigate().to(web);
		
		//TypeName
		myClassNav.iTypeFName();
		myClassNav.iTypeLName();
		
		//wait
		
		
		//  Select female
	
		
		//something to wait
		waitingTime();
		
		// select the years of exp
		myClassNav.iSelectExp();
		
		//something to wait
		waitingTime();
		
		// select the job
		myClassNav.iSelectProfession();
		
		// wait
		waitingTime();
		
		// select tool
		myClassNav.iSelectTool();


		webDriver.quit();
	}
	public static void waitingTime() { try { Thread.sleep(2500); } catch
		  (InterruptedException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }
	}

	

}



*/





/*
 * -----------------------------------------------------------------------------
 * ------------------------------------------- public static void main(String[]
 * args) {
 * 
 * WebDriver webDriver = new ChromeDriver();
 * 
 * // Maximise the screen webDriver.manage().window().maximize();
 * 
 * // Open the QA page String web = "http:\\www.DemoQA.com";
 * webDriver.navigate().to(web);
 * 
 * waitingTime();
 * 
 * // Click on registration link
 * webDriver.findElement(By.cssSelector("#menu-item-374 > a")).click();
 * 
 * waitingTime();
 * 
 * // Come back to the homepage clicking back button
 * webDriver.navigate().back();
 * 
 * waitingTime();
 * 
 * // Go back to reg page using forward webDriver.navigate().forward();
 * 
 * waitingTime();
 * 
 * // Type name in
 * webDriver.findElement(By.cssSelector("#name_3_firstname")).sendKeys("Nigga");
 * waitingTime();
 * webDriver.findElement(By.cssSelector("#name_3_lastname")).sendKeys("Charles")
 * ;
 * 
 * //Go back to homepage webDriver.navigate().to(web);
 * 
 * waitingTime();
 * 
 * //refresh webDriver.navigate().refresh();
 * 
 * webDriver.quit(); }
 * 
 * public static void waitingTime() { try { Thread.sleep(2500); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * } }
 */
/*--------------------------------------------------------------------------------------------------------------------------
  
 public static void main(String[] args) throws InterruptedException {
 

	String web = "http://www.store.demoqa.com";

	// Create a new instance of the Firefox driver
	WebDriver webDriver = new ChromeDriver();

	// Launch the Online Store Website
	webDriver.get(web);

	// Print a Log In message to the screen
	System.out.println("Successfully opened the website www.Store.Demoqa.com");

	// Wait for 5 Sec
	Thread.sleep(5000);

	// Get title
	String title = webDriver.getTitle();

	// Get length of title
	int titleLength = webDriver.getTitle().length();

	// Print title and length
	System.out.println("Title: " + title + "\nTitle length: " + titleLength);

	// Store the URL as a string
	String theURL = webDriver.getCurrentUrl();

	// verfiy if correct page or not
	if (theURL.equals(web)) {
		System.out.println("Verification Successful. This is the correct page");
	} else {
		System.out.println("Verification Failed. Expected URL is: " + web);
	}

	// Storing Page Source in String variable
	String pageSource = webDriver.getPageSource();

	// Storing Page Source length in Int variable
	int pageSourceLength = pageSource.length();

	// Printing length of the Page Source on console
	System.out.println("Total length of the Pgae Source is : " + pageSourceLength);

	// Close the driver
	webDriver.quit();
}
}
*/