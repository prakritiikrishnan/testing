package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPagePom {
	public RegisterPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}

	

	public WebElement getMaleRadio() {
		return maleRadio;
	}

	public void setMaleRadio(WebElement maleRadio) {
		this.maleRadio = maleRadio;
	}

	public WebElement getFemaleRadio() {
		return femaleRadio;
	}

	public void setFemaleRadio(WebElement femaleRadio) {
		this.femaleRadio = femaleRadio;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	

	@FindBy(id = "gender-male")
	private WebElement maleRadio;
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadio;
	
	@FindBy(id = "FirstName")
	private WebElement firstName;

	@FindBy(id = "LastName")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}



	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}



	public WebElement getEmail() {
		return email;
	}



	public void setEmail(WebElement email) {
		this.email = email;
	}



	public WebElement getPassword() {
		return password;
	}



	public void setPassword(WebElement password) {
		this.password = password;
	}



	public WebElement getConfpassword() {
		return Confpassword;
	}



	public void setConfpassword(WebElement confpassword) {
		Confpassword = confpassword;
	}



	public WebElement getRegisterButton() {
		return RegisterButton;
	}



	public void setRegisterButton(WebElement registerButton) {
		RegisterButton = registerButton;
	}


	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement Confpassword;
	
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement RegisterButton;
	
}

