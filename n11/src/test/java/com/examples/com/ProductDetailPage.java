package com.examples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage {
    private final WebDriver driver;
    private final By addToBaketLocator=By.className("addBasketUnify");

    public ProductDetailPage(WebDriver driver){
        this.driver=driver;
    }
    public void addToCart(){
        driver.findElement(addToBaketLocator).click();
    }
}
