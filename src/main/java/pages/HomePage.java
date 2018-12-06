package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{

    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    private final String USERNAME = "yourName";
    private final String PASSWORD = "yourPassword";

    private By emailFieldLocator = By.name("session[username_or_email]");
    private By passwordFieldLocator = By.name("session[password]");
    private By loginButtonLocator = By.linkText("Log In");


    public void enterLogInCredentials(String myUsername, String myPassword)
    {
        driver.findElement(emailFieldLocator).sendKeys(USERNAME);
        driver.findElement(passwordFieldLocator).sendKeys(PASSWORD);
    }

    public LoginPage clickLogInButton()
    {
        driver.findElement(loginButtonLocator).click();
        return new LoginPage(driver);
    }
}
