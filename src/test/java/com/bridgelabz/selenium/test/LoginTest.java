package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.page.LoginPage;
//import com.bridgelabz.selenium.page.SignUpPage;
import com.bridgelabz.selenium.utility.DashBoard;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
    /*
    @Test
    public void SignUp_ToRegistration_page() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage (driver);
        signUpPage.sendUserDetails ();
    } */

    @Test
    public void loginTo_Application_WithValid_Details () throws InterruptedException {
        LoginPage loginPage = new LoginPage (driver);
        loginPage.loginToApplication ();
    }
    @Test
    public void sendData_Into_Searchbar() throws InterruptedException {
        DashBoard dashBoard = new DashBoard (driver);
        dashBoard.sendText ();
        String actualUrl = driver.getCurrentUrl ();
        System.out.println ("Your are here");
        System.out.println (actualUrl);
       // driver.navigate ().refresh ();
    }
}
