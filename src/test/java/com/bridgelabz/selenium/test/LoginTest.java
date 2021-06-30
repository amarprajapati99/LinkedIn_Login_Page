package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.page.LoginPage;
//import com.bridgelabz.selenium.page.SignUpPage;
import com.bridgelabz.selenium.page.SignUpPage;
import com.bridgelabz.selenium.utility.HomePage;
import com.bridgelabz.selenium.utility.MyPost;
import com.bridgelabz.selenium.utility.SignOut;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class LoginTest extends BaseClass{

    @Test
    public void registration_page() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage (driver);
        signUpPage.sendUserDetails ();
    }

    @Test
    public void loginTo_Application_WithValid_Details () throws InterruptedException {
        LoginPage loginPage = new LoginPage (driver);
        loginPage.loginToApplication ();
        String actualUrl = driver.getCurrentUrl ();
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals (actualUrl,expectedUrl);
        String title = driver.getTitle ();
        String expectedTitle = "Feed | LinkedIn";
        Assert.assertEquals (title,expectedTitle);
    }

    @Test
    public void sendData_Into_Searchbar() throws InterruptedException {
        LoginPage loginPage = new LoginPage (driver);
        loginPage.loginToApplication ();
        HomePage homePage = new HomePage (driver);
        homePage.sendText ();
        String actualUrl = driver.getCurrentUrl ();
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals (actualUrl,expectedUrl);
        String title = driver.getTitle ();
        String expectedTitle = "Feed | LinkedIn";
        Assert.assertEquals (title,expectedTitle);
    }

    @Test
    public void postTest() throws InterruptedException, AWTException {
        LoginPage loginPage = new LoginPage (driver);
        loginPage.loginToApplication ();
        MyPost post = new MyPost(driver);
        post.sharePost();
    }

    @Test
    public void  photoTest() throws InterruptedException, AWTException {
        LoginPage loginPage = new LoginPage (driver);
        loginPage.loginToApplication ();
        MyPost imgPost = new MyPost(driver);
        imgPost.sharePhoto();
    }

    @Test
    public void likeTest() throws AWTException, InterruptedException {
        LoginPage loginPage = new LoginPage (driver);
        loginPage.loginToApplication ();
        MyPost myPost= new MyPost(driver);
        myPost.likePost();
    }
    @Test
    public void clickOnMe_Click_SignOut() throws InterruptedException {
        LoginPage loginPage = new LoginPage (driver);
        loginPage.loginToApplication ();
        SignOut signOut = new SignOut (driver);
        signOut.setClickOnMe ();
        String actualUrl = driver.getCurrentUrl ();
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals (actualUrl,expectedUrl);
        String title = driver.getTitle ();
        String expectedTitle = "Feed | LinkedIn";
        Assert.assertEquals (title,expectedTitle);
    }

}

