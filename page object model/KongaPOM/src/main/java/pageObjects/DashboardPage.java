package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DashboardPage {
    //create a webDriver object for this class
    private WebDriver driver;

    //create a constructor
    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }
    //locate elements
    private By logout   = By.linkText("Logout");
    private By account =By.className("a391f_3X97l");
    private By category = By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[3]/div/a[2]");
    private By laptop = By.className("_2d663_Ov43s");
    private By apple = By.xpath("//*[@id=\"mainContent\"]/section[2]/section/div/section/div[2]/div[2]/ul/li[5]/a/ul/li[1]/a/label/span");
    private By type1 = By.linkText("Apple Macbook Air 13inch Intel Core I...");
    private By type2 =By.linkText("Apple Macbook Air 2017 13\" Core I5 8g...");
    private By type3 = By.xpath("//*[@id=\"mainContent\"]/section[2]/section/section/section[2]/section/ul/li[11]/div/div/div[1]/a[1]/picture/img");
    private By type4 = By.xpath("//*[@id=\"mainContent\"]/section[2]/section/section/section[2]/section/ul/li[17]/div/div/div[1]/a[1]/picture/img");
    private By type5 = By.xpath("//*[@id=\"mainContent\"]/section[2]/section/section/section[2]/section/ul/li[19]/div/div/div[1]/a[1]/picture/img");
    private By me = By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/a/span");

    //functions to interact with the element
    public void clickWelcomeAdmin() throws InterruptedException{
        //wait for ten seconds before executing the action
        Thread.sleep(10000);
        driver.getCurrentUrl();
    }


}
