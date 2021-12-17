package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver driver;

    private By logoDemo;
    private By speakersImg;
    private By tabletsImg;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        logoDemo = By.cssSelector(".logoDemo");
        speakersImg = By.id("speakersImg");
        tabletsImg = By.id("tabletsImg");
    }


    // Actions using those elements I previously listed
    public void ();

