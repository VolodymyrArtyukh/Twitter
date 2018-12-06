package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import settings.BaseTest;

public class TestCaseLogIn extends BaseTest
{

    @Test
    public void testCaseLogin()
    {
        HomePage twitterHomePage = new HomePage(driver);
        twitterHomePage.enterLogInCredentials("","");

        LoginPage twitterLoginPage = twitterHomePage.clickLogInButton();

    }

}
