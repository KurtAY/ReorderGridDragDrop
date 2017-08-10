package dragdroppackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionPage {

	@FindBy(css = "#menu-item-151 > a")
	WebElement sortable;

	@FindBy(css = "#ui-id-3")
	WebElement displayGrid;

	@FindBy(css = "#sortable_grid > li:nth-child(1)")
	WebElement number1;

	@FindBy(css = "#sortable_grid > li:nth-child(2)")
	WebElement number2;

	@FindBy(css = "#sortable_grid > li:nth-child(3)")
	WebElement number3;

	@FindBy(css = "#sortable_grid > li:nth-child(4)")
	WebElement number4;

	@FindBy(css = "#sortable_grid > li:nth-child(5)")
	WebElement number5;

	@FindBy(css = "#sortable_grid > li:nth-child(6)")
	WebElement number6;

	@FindBy(css = "#sortable_grid > li:nth-child(7)")
	WebElement number7;

	@FindBy(css = "#sortable_grid > li:nth-child(8)")
	WebElement number8;

	@FindBy(css = "#sortable_grid > li:nth-child(9)")
	WebElement number9;

	@FindBy(css = "#sortable_grid > li:nth-child(10)")
	WebElement number10;

	@FindBy(css = "#sortable_grid > li:nth-child(11)")
	WebElement number11;

	@FindBy(css = "#sortable_grid > li:nth-child(12)")
	WebElement number12;

	public void clickSortable() {
		sortable.click();
	}

	public void clickDisplayGrid() {
		displayGrid.click();
	}

	public void click1() {
		number1.click();
	}

	public void click2() {
		number2.click();
	}

	public void click3() {
		number3.click();
	}

	public void click4() {
		number4.click();
	}

	public void click5() {
		number5.click();
		;
	}

	public void click6() {
		number6.click();
	}

	public void click7() {
		number7.click();
	}

	public void click8() {
		number8.click();
	}

	public void click9() {
		number9.click();
	}

	public void click10() {
		number10.click();
	}

	public void click11() {
		number11.click();
	}

	public void click12() {
		number12.click();
	}

}
