package Library;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
  protected String website="https://magento.softwaretestingboard.com/";
  protected WebDriver driver;
    @BeforeSuite
    public void beforeSuite()
  {
      WebDriverManager.chromedriver().setup();
  }

  @BeforeMethod
    public void beforeMethod()
  {
      driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(website);
  }
  @AfterMethod
    public void afterMethod()
  {
      driver.close();
  }
}
