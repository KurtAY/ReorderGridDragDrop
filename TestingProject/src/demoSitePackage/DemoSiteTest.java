package demoSitePackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteTest {

	String web = "http:\\TheDemoSite.co.uk";
	String testDataPath = "C://excelpath";
	String testDataFile = "TestData.xlsx";
	
	private WebDriver webDriver;
	
	@Before
	public void before() {
		webDriver = new ChromeDriver();
	}
	
	@Test
	public void test() {
		
	}
	
	@After
	public void after() {
		
	}
}
