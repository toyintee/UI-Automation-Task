package SetUp;

import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SetUpTests {

    //Create a WebDriver object
    private WebDriver driver;
    //Create a Login Object
    protected LoginPage loginPage;


    @BeforeTest
    public void setUp()
    {
        //Selenium WebDriver needs this executable in order to in orser to know which browser to run your test
        //Browser setup for Chrome
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        //Instantiate WebDriver object
        driver = new ChromeDriver();

        //Any activity you want to do concerning your automated test can now be done using the driver

        //Launch the application
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");

        //Maximize window size
        driver.manage().window().maximize();

        //Initialize the login page after launching the browser - Handle
        loginPage = new LoginPage(driver);
    }

    @AfterTest
    public void closeBrowser()
    {
        //".close" would close the window while ".quit" would exit the session.
        driver.quit();
    }
}

