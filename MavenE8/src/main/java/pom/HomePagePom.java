package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {

	public HomePagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}

	public WebElement getBookLink() {
		return bookLink;
	}

	public void setBookLink(WebElement bookLink) {
		this.bookLink = bookLink;
	}

	public WebElement getWelcomeText() {
		return WelcomeText;
	}

	public void setWelcomeText(WebElement welcomeText) {
		WelcomeText = welcomeText;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public void setJewelryLink(WebElement jewelryLink) {
		this.jewelryLink = jewelryLink;
	}

	public WebElement getGiftcard() {
		return giftcard;
	}

	public void setGiftcard(WebElement giftcard) {
		this.giftcard = giftcard;
	}

	@FindBy(id = "small-searchterms")
	private WebElement searchBox;
	
	@FindBy(partialLinkText = "Books")
	private WebElement bookLink;
	
	@FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
	private WebElement WelcomeText;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText = "Gifts Card")
	private WebElement giftcard;
	
	@FindBy(linkText = "Register")
	private WebElement registerlink;

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public void setRegisterlink(WebElement registerlink) {
		this.registerlink = registerlink;
	}


}
