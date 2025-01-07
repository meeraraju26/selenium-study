package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    String website="https://magento.softwaretestingboard.com/";

    @Test
    public void launchbroswer() throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get(website);
        driver.manage().window().maximize();
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
        driver.close();
    }
}
