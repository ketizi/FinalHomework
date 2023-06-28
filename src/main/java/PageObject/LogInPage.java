package PageObject;

import org.openqa.selenium.By;

public class LogInPage {
    protected By

           logInButton =By.xpath("//a[text()=\"შესვლა\"]\n"),
           passwordButton = By.name("//*[@id=\"auth-login-new\"]/form/div[4]/input"),
           emailButton = By.name("//*[@id=\"auth-login-new\"]/form/div[3]/input"),
           finalLogInButton = By.xpath("//*[@id=\"auth-login\"]\n");


}
