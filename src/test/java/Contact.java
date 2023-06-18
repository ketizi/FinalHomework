import StepObject.SentMessageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;
import static DataObject.MessageFieldData.*;

public class Contact extends ChromeRunner {

    @Test
    public void sentMessage()  {

        SentMessageSteps step1 = new SentMessageSteps(driver);
        step1.contactButton();
        step1.nameField( name1 );
        step1.emailField( email1 );
        step1.messageField( message1 );
        step1.sumbitButton();

    }

    @Test
    public void FaqQuestion ()  {

        SentMessageSteps step2 = new SentMessageSteps(driver);
        step2.contactButton();
        step2.questionButton();

    }
}


