package com.bridgelabz.selenium.page;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseClass{

    @FindBy(xpath = "//a[normalize-space()='Join now']")
    WebElement joinNow;
    @FindBy(xpath = "//input[@id='email-or-phone']")
    WebElement emailOrMobileNumber;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Agree & Join']")
    WebElement agreeJoin;
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement click;

    public SignUpPage (WebDriver driver) {
        PageFactory.initElements (driver, this);
    }
    public void sendUserDetails() throws InterruptedException {
        joinNow.click ();
        Thread.sleep (500);
        emailOrMobileNumber.sendKeys ("abc@gmail.com");
        Thread.sleep (500);
        password.sendKeys ("JayhindJayBharat0777");
        Thread.sleep (500);
        agreeJoin.click ();
        Thread.sleep (500);
        firstName.sendKeys ("Jay");
        Thread.sleep (500);
        lastName.sendKeys ("Hind");
        Thread.sleep (500);
        click.click ();
        Thread.sleep (1200);
    }
}
