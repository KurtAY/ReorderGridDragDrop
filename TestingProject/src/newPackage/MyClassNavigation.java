//package newPackage;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class MyClassNavigation {
//	
//	@FindBy(css = "#content > form > fieldset > div:nth-child(4) > input[type=\"text\"]:nth-child(4)")
//	private WebElement typeFirstName;
//	
//	@FindBy(css = "#content > form > fieldset > div:nth-child(4) > input[type=\"text\"]:nth-child(6)")
//	private WebElement typeLastName;
//	
//	@FindBy(css = "#sex-1")
//	private WebElement selectFemale;
//
//	@FindBy(css = "#exp-2")
//	private WebElement selectExp;
//	
//	@FindBy(css = "#profession-1")
//	private WebElement selectProfession;
//	
//	@FindBy(css = "#tool-1")
//	private WebElement selectTool;
//	
//	//methods now
//	
//	public void iTypeFName() {
//		typeFirstName.sendKeys("Jimmy-Floyd");
//	}
//	
//	public void iTypeLName() {
//		typeLastName.sendKeys("Timbucktoo");
//	}
//	
//	public void iSelectFemale() {
//		selectFemale.click();
//	}
//	
//	public void iSelectExp() {
//		selectExp.click();
//	}
//	
//	public void iSelectProfession() {
//		selectProfession.click();
//	}
//	
//	public void iSelectTool() {
//		selectTool.click();
//	}
//}
