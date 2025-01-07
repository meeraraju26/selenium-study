package Tests;

import Library.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void VerifyLogin() throws InterruptedException {

        WebElement lnkSignin = driver.findElement(By.linkText("Sign In"));
        lnkSignin.click();
        driver.findElement(By.name("login[username]"))
                .sendKeys("26nov93kukku@gmail.com");
        driver.findElement(By.name("login[password]"))
                .sendKeys("08Nov@2020");
        driver.findElement(By.id("send2")).click();
        Thread.sleep(4000);
        String ExpectedMsg = "Welcome, Meera Raju!";
        String ActualMsg = driver.findElement(By.className("logged-in")).
                getText();
        Assert.assertEquals(ActualMsg,ExpectedMsg,"Login Failed");
    }

    @Test
    public void VerifyTitle()
    {
        String ExpectedTitle = "Home Page";
        String ActaulTitle =driver.getTitle();
        Assert.assertEquals(ExpectedTitle,ActaulTitle,"Incorrect Title");
    }
}
