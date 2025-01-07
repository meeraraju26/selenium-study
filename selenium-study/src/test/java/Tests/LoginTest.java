package Tests;

import Library.TestBase;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void VerifyLogin() throws InterruptedException
    {
        String email = "26nov93kukku@gmail.com";
        String password = "08Nov@2020";
        String fullName= "Meera Raju";
        LoginPage loginpage = new LoginPage(driver);
        loginpage.login(email,password,true,fullName);
    }

    @Test
    public void VerifyTitle()
    {
        String ExpectedTitle = "Home Page";
        String ActaulTitle =driver.getTitle();
        Assert.assertEquals(ExpectedTitle,ActaulTitle,"Incorrect Title");
    }
}
