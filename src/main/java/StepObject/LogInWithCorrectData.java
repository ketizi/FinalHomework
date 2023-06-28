package StepObject;

import PageObject.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInWithCorrectData extends LogInPage {
    WebDriver driver;

    public LogInWithCorrectData (WebDriver driver3){
        driver = driver3;
    }

    public void logInButton () {
        driver.findElement(logInButton).click();
    }
    public void emailButton (String logInField) {
        driver.findElement(emailButton).sendKeys(logInField);
    }
    public void passwordButton (String passwordField) {
        driver.findElement(passwordButton).sendKeys(passwordField);
    }
    public void finalLogInButton () {
        driver.findElement(finalLogInButton).click();
    }
}
