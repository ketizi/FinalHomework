import StepObject.SentMessageSteps;
import Utils.ChromeRunner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DataObject.MessageFieldData.*;


public class Contact extends ChromeRunner {
    SoftAssert softAssertion;

    @Test(priority = 1)
    public void sentMessage() throws InterruptedException {

        SentMessageSteps step1 = new SentMessageSteps(driver);
        step1.contactButton();
        step1.nameField( name1 );
        step1.emailField( email1 );
        step1.messageField( message1 );
        step1.sumbitButton();
        Thread.sleep(5000);

    }

    @Test
    public void FaqQuestion ()  {

        SentMessageSteps step2 = new SentMessageSteps(driver);
        step2.contactButton();
        step2.questionButton();

    }

    @Test
    public void testSoftAsser() {
        By contactButton = By.xpath("//a[@href=\"/contact\"]");
        driver.findElement(contactButton).click();

        softAssertion = new SoftAssert();

        softAssertion.assertEquals(driver.getTitle(), "\"საბა\" - კონტაქტი");
        softAssertion.assertTrue(driver.getCurrentUrl().contains("contact"));


    }

    }




