package com.examples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
    private final WebDriver driver;
    private final By resultTextLocator= By.className("resultText");
    private final By productNameLocator = By.className("productName");

    public ResultPage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getResultWebElement(){
        return driver.findElement(resultTextLocator);
    }
    public void clickToFirstProduct(){
        driver.findElement(productNameLocator).click();
    }
}
