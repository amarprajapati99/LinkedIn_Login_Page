package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.page.LoginPage;
import com.bridgelabz.selenium.utility.DashBoard;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{

    @Test
    public void loginTo_Application_WithValid_Details () throws InterruptedException {
        LoginPage loginPage = new LoginPage (driver);
        loginPage.loginToApplication ();
    }
    @Test
    public void sendData_Into_Searchbar() throws InterruptedException {
        DashBoard dashBoard = new DashBoard (driver);
        dashBoard.sendText ();

    }
}
