package com.bridgelabz.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass{
    public static WebDriver driver;

    /* @Description - To open LinkedIn page
     *  To maximize chrome browser */
    @BeforeTest
    public void setUp () throws InterruptedException {
        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
        driver.get ("https://www.linkedin.com/login");
        driver.manage ().window ().maximize ();
        //driver.manage().deleteAllCookies();
        Thread.sleep (1200);
    }

    public void tearDown () {
        driver.close ();
    }
}
