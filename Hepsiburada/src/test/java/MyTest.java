import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyTest {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test01(){
        driver.get("https://www.hepsiburada.com/");
        Actions actions=new Actions(driver);
        WebElement tabelektronik = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]/span[1]"));
        actions.moveToElement(tabelektronik).perform();
        WebElement tabbilgisayartablet = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
        actions.moveToElement(tabbilgisayartablet).perform();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
    }
    @Test
    public void test02(){
        Actions actions1=new Actions(driver);
        WebElement tab1=driver.findElement(By.xpath("//*[@id=\"i1\"]/div/a/div[2]"));
        actions1.moveToElement(tab1).perform();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]/div[2]/button[1]/div[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(800,0)");
        driver.findElement(By.id("shoppingCart")).click();
        String count=driver.findElement(By.id("basket-item-count")).getText();
        Assert.assertTrue(count.equals("1"));

    }

}
