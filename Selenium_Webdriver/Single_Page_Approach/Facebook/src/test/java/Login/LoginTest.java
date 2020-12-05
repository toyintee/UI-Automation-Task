package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //sleep for 5 seconds
        Thread.sleep(5000);
        //maximize the window
        driver.manage().window().maximize();
        System.out.println (driver.getTitle());
        driver.manage ().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //enter the email and password
        driver.findElement(By.id("email")).sendKeys("tydamsel4u@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("typepassword");

        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        LoginTest test = new LoginTest();
        test.setUp();
    }

    public void tearDown() {
        driver.quit ();
    }
}
