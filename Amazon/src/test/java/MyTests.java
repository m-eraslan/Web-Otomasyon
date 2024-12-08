import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
/*
Amazon web sayfasında search kısmında iphone yazısını aramak cıkan sonucu karşılaştırmak ve daha sonra
bir ürünü seçip sepete ekleyip sepete eklenip eklenmediğini sorgulamak.
 */
public class MyTests {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test01(){
        driver.get("https://www.amazon.com.tr/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("İphone"+ Keys.ENTER);
        WebElement resultWe = driver.findElement(By.xpath("//*[@id='search']/span/div/h1/div/div[1]/div/div/span[3]"));
        Assert.assertTrue(resultWe.isDisplayed());
    }
    @Test
    public void test02(){
        driver.findElement(By.id("sp-cc-accept")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/span/div/div/div[2]/span/a/div/img")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        String count=driver.findElement(By.id("nav-cart-count")).getText();
        Assert.assertFalse(count.equals("0"));

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }



}
