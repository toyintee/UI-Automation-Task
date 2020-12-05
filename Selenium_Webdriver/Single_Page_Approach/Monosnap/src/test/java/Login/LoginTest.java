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
        driver.get("https://monosnap.com/");
        //sleep for 5 seconds
        Thread.sleep(5000);
        //maximize the window
        driver.manage().window().maximize();
        System.out.println (driver.getTitle());
        driver.manage ().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //find the signin icon first and click it
        driver.findElement(By.className("headButton")).click();

        //enter email
        driver.findElement(By.className("w-100")).sendKeys("toyintee@mailinator.com");

        //enter password
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[2]")).sendKeys("typepassword$@");

        //locate button field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();

    }

    public static void main(String[] args) throws InterruptedException {
        LoginTest test = new LoginTest();
        test.setUp();
    }

    public void tearDown() {
        driver.quit ();
    }
}

