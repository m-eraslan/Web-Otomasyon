package com.examples.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TabBarPage {

    private final WebDriver driver;

    private final By searchBoxLocator=By.id("searchData");
    private final By basketTotalNumberLocater=By.className("iconsBasketWhite");

    public TabBarPage(WebDriver driver){
        this.driver=driver;
    }
    public void search(String searchword){
        driver.findElement(searchBoxLocator).sendKeys(searchword+ Keys.ENTER);
    }
    public String getBasketTotalNumber(){
        return driver.findElement(basketTotalNumberLocater).getText();
    }


}
