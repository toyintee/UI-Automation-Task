package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    //import Webdriver
    private WebDriver driver;

    //setting the driver controller
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Using By as a locator for elements
    private By Username = By.id("username");

    public void enterUsername(String uName)
    {
        //find the username element
        driver.findElement (Username).sendKeys (uName);
    }
    public void enterUserpassword (String pwd)
    {
        WebElement passwordField= driver.findElement (By.id("password"));
       passwordField.sendKeys(pwd);
}

    public DashboardPage ClickLoginButton () throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        Thread.sleep(5000);
        return new DashboardPage(driver);
    }


}



