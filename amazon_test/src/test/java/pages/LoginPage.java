package pages;

import example.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseTest {
    WebDriver driver;

    private LoginPage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(className = "a-input-text a-span12 auth-autofocus auth-required-field auth-require-claim-validation")
    private WebElement username;

    @FindBy(id = "continue")
    private WebElement devametgirisbutton;

    @FindBy(className = "a-input-text a-span12 auth-autofocus auth-required-field")
    private WebElement sifregiris;

    @FindBy(id = "signInSubmit")
    private WebElement girisbutton;


    public void hesapUsername(String email){
        username.sendKeys(email);
    }
    public void hesapusernamegiris(){
        devametgirisbutton.click();
    }

    public void hesapsifregiris(String sifre){
        sifregiris.sendKeys(sifre);
    }
    public void hesapgirişbutton(){
        girisbutton.click();
    }





}
