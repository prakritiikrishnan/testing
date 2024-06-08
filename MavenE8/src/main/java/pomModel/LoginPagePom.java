package pomModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom {

	public LoginPagePom (WebDriver driver) { 
		PageFactory.initElements (driver, this);
	}

	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(linkText = "Log out") 
	private WebElement logoutLink;
	
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	@FindBy(id="Email")
	private WebElement emailTextField;
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRememberMeCheckbox() {
		return rememberMeCheckbox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(id="Password")
	private WebElement passwordTextField;
	

	@FindBy(id="RememberMe")
	private WebElement rememberMeCheckbox;

	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;

	
	
	
	
}
