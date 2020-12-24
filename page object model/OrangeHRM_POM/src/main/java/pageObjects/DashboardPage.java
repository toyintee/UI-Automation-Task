package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //create a webDriver object for this class
    private WebDriver driver;

    //create a constructor
    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }
    //locate elements
    private By welcomeAdmin = By.id("welcome");
    private By logout   = By.linkText("Logout");
    private By CheckingMatthews= By.xpath("//*[@id=\"task-list-group-panel-menu_holder\"]/table/tbody/tr[10]/td/a");

    //functions to interact with the element
    public void clickWelcomeAdmin() throws InterruptedException{
        //wait for ten seconds before executing the action
        Thread.sleep(10000);
        driver.findElement(welcomeAdmin).click();
    }
    public boolean getLeaveRequest() throws InterruptedException {
        Thread.sleep(3000);
        //find the logout and click on the logout button
        driver.findElement(CheckingMatthews).getText();
        return false;
    }
    public LoginPage clickLogout() throws InterruptedException
    {
        //Wait for 3 seconds before executing the action
        Thread.sleep(3000);
        driver.findElement(logout).click();
        return new LoginPage(driver);
    }


}
