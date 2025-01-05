package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    String website="https://magento.softwaretestingboard.com/";

    @Test
    public void launchbroswer()
    {
        WebDriver driver =new ChromeDriver();
        driver.get(website);
        driver.manage().window().maximize();
        driver.close();
    }
}
