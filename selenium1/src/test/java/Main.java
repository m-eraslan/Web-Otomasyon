import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
https://demoqa.com/ sitesinde
1.Web sayfası açılır
2.Elements başlığına gidilir.
3. Web Tables alt başlığına gidilir.
4.Add butonuna tıklanır.
5.Tüm gerekli bilgiler doldurulur.
6.Submit edilir
7.Quit ile proje bitirilir.

 */
public class Main {
    public static void main(String[]args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        JavascriptExecutor jsx =(JavascriptExecutor) driver;
        jsx.executeScript("window scrollBy(300)");

        WebElement elementsButton= driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        elementsButton.click();

        WebElement webTables = driver.findElement(By.xpath("//span[normalize-space()='Web Tables']"));
        webTables.click();

        WebElement addButton = driver.findElement((By.cssSelector("#addNewRecordButton")));
        addButton.click();

        WebElement firstName= driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.click();
        firstName.sendKeys("Mehmet");

        WebElement lastName= driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.click();
        lastName.sendKeys("Eraslan");

        WebElement email=driver.findElement(By.id("userEmail"));
        email.click();
        email.sendKeys("m.eraslan9745@gmil.com");
        WebElement age=driver.findElement(By.cssSelector("#age"));
        age.click();
        age.sendKeys("27");
        WebElement salary=driver.findElement(By.cssSelector("#salary"));
        salary.click();
        salary.sendKeys("20000");
        WebElement departman=driver.findElement(By.cssSelector("#department"));
        departman.click();
        departman.sendKeys("IT");
        WebElement submit=driver.findElement(By.cssSelector("#submit"));
        submit.click();


    }
}
