package com.bridgelabz.selenium.page;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{

    /* @Description - Using FindBy for locating elements */

    @FindBy (xpath = "//input[@id='username']")
    WebElement userId;
    @FindBy (xpath = "//input[@id='password']")
    WebElement userPass;
    @FindBy (xpath = "//button[normalize-space()='Sign in']")
    WebElement loginButton;

    /* @Description - Called parameterized constructor */

    public LoginPage (WebDriver driver) {
        PageFactory.initElements (driver, this);
    }

    /* Defining all the user actions (Methods)
     * that can be performed in the LinkedIn page
     * This method is to set Email in the email text box
     * This method is to set Password in the password text box
     * This method is to click on Next Button */

    public void loginToApplication () throws InterruptedException {
        userId.sendKeys ("abc@gmail.com");
        Thread.sleep (1200);
        userPass.sendKeys ("JayHindJayBharat");
        loginButton.click ();
        Thread.sleep (3000);
    }
}
