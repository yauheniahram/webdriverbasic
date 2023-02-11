import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown extends BaseTest {
    @Test
    public void dropDownTest() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement element1 = driver.findElement(By.xpath("//select[@id='dropdown']/option[@value='1']"));
        element1.click();
        Assert.assertEquals(element1.isSelected(), true, "Option 1 is selected");
        WebElement element2 = driver.findElement(By.xpath("//select[@id='dropdown']/option[@value='2']"));
        element2.click();
        Assert.assertEquals(element2.isSelected(), true, "Option 2 is selected");
    }
}