package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //sleep for 5 seconds

        //maximize the window
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        //enter the email and password
        driver.findElement(By.id("username")).sendKeys("toyin");
        driver.findElement(By.id("password")).sendKeys("typepassword");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div/div/div/div/div/div/div/form/button")).click();
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        LoginTest test = new LoginTest();
        test.setUp();
    }

    public void tearDown() {
        driver.quit ();
    }
}
