import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class NotificationMessages extends BaseTest{
    @Test
    public void notificationMessagesTest() {
        driver.get("http://the-internet.herokuapp.com/notification_message");
        driver.findElement(By.cssSelector(".example a")).click();
        String message = driver.findElement(By.cssSelector(".flash")).getText();
        assertEquals(message, "Action unsuccesful, please try again\n" + "×");
    }
}
