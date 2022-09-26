package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".ico-login")
	private WebElement Login;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="RememberMe")
	private WebElement remember;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath=("//button[@class='button-1 login-button']"))
	private WebElement loginButton;
	
	public WebElement Login() {
		return Login;
	}
	
	public WebElement email() {
		return email;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement remember() {
		return remember;
	}
	
	public WebElement loginButton() {
		return loginButton;
	}
}
