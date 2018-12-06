package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest
{
    protected WebDriver driver;
    private final String HOME_URL = "https://www.twitter.com";

    @BeforeClass
    public void setProperties()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

    }


    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get(HOME_URL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
