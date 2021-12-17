package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    private By logoDemo;
    private By speakersImg;
    private By tabletsImg;

    public void goToHome(){
        driver.findElement(logoDemo).click();
    }

}
