package pages;
import example.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TabBarPage extends BaseTest {

    WebDriver driver;
    Actions actions;
    private TabBarPage(WebDriver driver){
        this.driver=driver;
    }
    private TabBarPage(Actions actions){
        this.actions=actions;
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement hesapadı;

    @FindBy(id = "glow-ingress-line1")
    private WebElement isim;

    @FindBy(className = "nav-action-inner")
    private WebElement giris;

    @FindBy(id = "nav-cart-count")
    private WebElement sepetgörüntü;

    @FindBy(name = "field-keywords")
    private WebElement searchbox;



    public void hesapduruş(){
        actions.moveToElement(hesapadı).perform();
    }
    public String setIsim(){
        return isim.getText();
    }
    public void girisButton(){
        giris.click();
    }
    public void sepettabbar(){
        sepetgörüntü.click();
    }
    public void Searchboxwrite(String seachwrite){
        searchbox.sendKeys(seachwrite+ Keys.ENTER);
    }



}
