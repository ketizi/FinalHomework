package PageObject;

import org.openqa.selenium.By;

public class ContactPage {
     protected By

             contactButton = By.xpath("//a[@href=\"/contact\"]"),
             nameField = By.name("name"),
             emailField = By.name("mail"),
             messageField = By.name("message"),
             submitButton = By.cssSelector("#bodyWrapper > div:nth-child(1) > div:nth-child(2) > div > div.fr > form > input.btn.fr"),
             questionButton = By.cssSelector("#bodyWrapper > div:nth-child(1) > div:nth-child(2) > div > a > div");

}


