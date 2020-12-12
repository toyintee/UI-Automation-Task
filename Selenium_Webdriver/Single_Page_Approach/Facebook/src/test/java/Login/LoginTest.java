package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
        driver.findElement(By.id("email")).sendKeys("tydamsel4u@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("typepassword");

        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
    }

    @Test(priority = 1)
    public void testSuccessfulLogin(){
        if (driver.getCurrentUrl().contains("https://web.facebook.com/"))
            //pass
            System.out.println("The Login Page was successful!");
        else
            //false
            System.out.println("The Login URL is correct!");
    }

    @Test(priority = 2)
    public void testSuccessfulLogout() throws InterruptedException {
        //click profile button
        driver.findElement (By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/i")).click();

        //click on the logout button
        driver.findElement (By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[5]")).click();

        if(driver.getCurrentUrl().contains("https://web.facebook.com/?stype=lo&jlou=Afes85ITsPasi9OCxYbY_fHfw3k8sU1FDJsnMg8rMNGyvlcYtpk3fxseEOIecYuGyHb-wvy3tvBEQyOz3RZ2g65rtd_t62AghPb9cX8mMNTZwA&smuh=39637&lh=Ac_lzm8dH3VyrgaFRyg"))
            //show that we have successfully logout
            System.out.println("You have successfully Logged Out");
        else
            System.out.println("you are yet to log out!");
    }

    @Test(priority = 3)
    public void testNegativeLogin(){
        driver.findElement(By.id("email")).sendKeys("performanc@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("admin12");
        driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).click();
        String expectedErrorMessage = "is not associated with any Facebook account";
        String actualErrorMessage = driver.findElement(By.xpath("//*[@id=\"u_0_9\"]/div/div[2]/p/strong")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
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
