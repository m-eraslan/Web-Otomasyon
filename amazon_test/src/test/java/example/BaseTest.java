package example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    SoftAssert softAssert;
    JavascriptExecutor js;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        softAssert=new SoftAssert();
        js=(JavascriptExecutor)driver;
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
        softAssert.assertAll();
    }
}
