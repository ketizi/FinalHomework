package StepObject;

import PageObject.ContactPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SentMessageSteps extends ContactPage {
    WebDriver driver;
    public SentMessageSteps(WebDriver driver2){
        driver = driver2;
    }

    public void contactButton(){
        driver.findElement(contactButton).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/contact\"]")));

    }
    public void nameField(String name1){
        driver.findElement(nameField).sendKeys(name1);
    }
    public void emailField(String email1){
        driver.findElement(emailField).sendKeys(email1);
    }
    public void messageField(String message1) {
        driver.findElement(messageField).sendKeys(message1);
    }
    public void sumbitButton(){
        driver.findElement(submitButton).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successMessage")));

    }
    public void questionButton(){
        driver.findElement(questionButton).click();

   //     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
   //     wait.until(ExpectedConditions.elementToBeClickable(By.id("questionButton"))); // ეს ბაგს იწვევს და ფინალურ პროექტში გამოვიყენებ.
    }


}
