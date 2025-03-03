package pages;

import example.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SepetPage extends BaseTest {
    WebDriver driver;

    private SepetPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(id = "sc-subtotal-amount-buybox")
    private WebElement urun;

    public String urunDogrulama(){
        return urun.getText();
    }

}
