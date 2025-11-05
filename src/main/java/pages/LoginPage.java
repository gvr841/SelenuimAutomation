package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By usernameTextBox=By.id("Email");
	private By passwordTextBox=By.id( "Password");
	//private By loginButton=By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");

	//private By loginButton = By.xpath("//button[text()='LOG IN']");
	private By loginButton = By.xpath("//button[@type='submit']");

private By remembermechkbox=By.id( "RememberMe");
	
	public LoginPage(WebDriver driver)
		{

		this.driver=driver;
	}


public void enterusername(String username)
{
	driver.findElement(usernameTextBox).clear();
	driver.findElement(usernameTextBox).sendKeys(username);

}

public void enterpasswordname(String password)
{

	driver.findElement(passwordTextBox).clear();
	driver.findElement(passwordTextBox).sendKeys(password);
}

	public void rememberme() {
	    if (!driver.findElement(remembermechkbox).isSelected()) {
	        driver.findElement(remembermechkbox).click();
	    }
	}





public void clickbutton() {
	driver.findElement(loginButton).click();
}


}





