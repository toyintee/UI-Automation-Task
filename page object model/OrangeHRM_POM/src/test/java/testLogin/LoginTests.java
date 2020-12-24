package testLogin;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import testSetup.setupTests;

public class LoginTests extends setupTests {
    //My Tests
    @Test (priority = 1)
    public void testALoginPanel ()
    {
        loginPage.verifyLoginPanel();
    }
    @Test (priority = 2)
    public void testACompanyLogo ()
    {
        loginPage.verifyCompanyLogo();
    }

    @Test (priority = 3)
    public void testAForgotPassword ()
    {
        loginPage.verifyForgotPassword();
    }

    @Test (priority = 4)
    public void VerifyLogin() throws InterruptedException
    {
        String username = "Admin";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword("admin123");

        //Handler for DashboardPage
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
    }
    public void testAPageTitle () throws InterruptedException {

        Thread.sleep(5000);
    }

}
