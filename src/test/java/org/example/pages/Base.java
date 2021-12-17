package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Base {

    protected WebDriver driver;

    //Se ejecuta antes de cada método de prueba
    @BeforeMethod
    public void beforeMethod() {

        //Set driver path
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Comfigure Chrome properties
        ChromeOptions options = new ChromeOptions();
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");

        //creating chromedriver object
        driver = new ChromeDriver(options);
        //navigate to the site
        driver.navigate().to("https://advantageonlineshopping.com/");
        //maximize the window

        driver.manage().window().maximize();

        //general wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    // Close the driver, quit browser
    @AfterMethod
    public void afterMethod() {
        driver.close();
        driver.quit();
    }





}
