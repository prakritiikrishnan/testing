package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPagePom {

	public BookPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public WebElement getProductDropdown() {
		return productDropdown;
	}
	
	@FindBy(id = "products-orderby")
	private WebElement productDropdown;

}
