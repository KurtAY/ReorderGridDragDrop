package dragdroppackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Tester {

	private WebDriver webDriver;
	private ActionPage actionPage;
	String web = "http:\\DemoQA.com";

	@Before
	public void before() {
		webDriver = new ChromeDriver();
		actionPage = PageFactory.initElements(webDriver, ActionPage.class);
	}

	@Test
	public void test() {
		webDriver.manage().window().maximize();
		webDriver.navigate().to(web);

		actionPage.clickSortable();

		actionPage.clickDisplayGrid();

		Actions builder = new Actions(webDriver);

		Action dragAndDrop12 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number1)
				.release(actionPage.number1).build();

		dragAndDrop12.perform();

		Action dragAndDrop11 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number2)
				.release(actionPage.number2).build();

		dragAndDrop11.perform();

		Action dragAndDrop10 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number3)
				.release(actionPage.number3).build();

		dragAndDrop10.perform();

		Action dragAndDrop9 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number4)
				.release(actionPage.number4).build();

		dragAndDrop9.perform();

		Action dragAndDrop8 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number5)
				.release(actionPage.number5).build();

		dragAndDrop8.perform();

		Action dragAndDrop6 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number6)
				.release(actionPage.number6).build();

		dragAndDrop6.perform();

		Action dragAndDrop5 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number7)
				.release(actionPage.number7).build();

		dragAndDrop5.perform();

		Action dragAndDrop4 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number8)
				.release(actionPage.number8).build();

		dragAndDrop4.perform();

		Action dragAndDrop3 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number9)
				.release(actionPage.number9).build();

		dragAndDrop3.perform();

		Action dragAndDrop2 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number10)
				.release(actionPage.number10).build();

		dragAndDrop2.perform();

		Action dragAndDrop1 = (Action) builder.clickAndHold(actionPage.number12).moveToElement(actionPage.number11)
				.release(actionPage.number11).build();

		dragAndDrop1.perform();

	}

	@After
	public void after() {

	}
}
