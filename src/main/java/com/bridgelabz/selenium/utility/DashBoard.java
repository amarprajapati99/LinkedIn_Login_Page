package com.bridgelabz.selenium.utility;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard extends BaseClass{

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement textSearch;
    public DashBoard (WebDriver driver) {
        PageFactory.initElements (driver, this);
    }
    /* @Description - send.Keys method is to set the data in to the search box
     * actions.sendKeys (Keys.ENTER).perform () method is used to perform keyboard events*/
    
    public void sendText() throws InterruptedException {
        textSearch.sendKeys ("tata consultancy services");
        Actions actions = new Actions (driver);
        actions.sendKeys (Keys.ENTER).perform ();
        Thread.sleep (1200);
    }
}
