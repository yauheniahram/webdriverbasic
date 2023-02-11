import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void addRemoveElements(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElementButton.click();
        WebElement deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));
        Assert.assertTrue(deleteButton.isDisplayed(), "First Delete Button is displayed");
        System.out.println();
    }

    @Test
    public void addMoreThanOneDeleteElements(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        for (int i = 0; i < 3; i++){
            addElementButton.click();
        }
        WebElement deleteFirstButton = driver.findElement(By.xpath("//button[text()='Delete'][1]"));
        Assert.assertTrue(deleteFirstButton.isDisplayed(), "First Delete Button is displayed");
        WebElement deleteSecondButton = driver.findElement(By.xpath("//button[text()='Delete'][2]"));
        Assert.assertTrue(deleteSecondButton.isDisplayed(), "Second Delete Button is displayed");
        WebElement deleteThirdButton = driver.findElement(By.xpath("//button[text()='Delete'][3]"));
        Assert.assertTrue(deleteThirdButton.isDisplayed(), "Third Delete Button is displayed");
    }

    @Test
    public void removeElements(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        for (int i = 0; i < 3; i++){
            addElementButton.click();
        }
        WebElement deleteThirdButton = driver.findElement(By.xpath("//button[text()='Delete'][3]"));
        deleteThirdButton.click();
        Boolean isThirdDeleteButtonDisplayed = deleteThirdButton.isDisplayed();
        if (isThirdDeleteButtonDisplayed) {
            System.out.println("Pass! The Third Delete button is not displayed.");}
        else {
            System.out.println("Fail! The Third Delete button is displayed.");
        }
        WebElement deleteSecondButton = driver.findElement(By.xpath("//button[text()='Delete'][2]"));
        deleteSecondButton.click();
        Boolean isSecondDeleteButtonDisplayed = deleteSecondButton.isDisplayed();
        if (isSecondDeleteButtonDisplayed) {
            System.out.println("Pass! The Third Delete button is not displayed.");}
        else {
            System.out.println("Fail! The Third Delete button is displayed.");
        }
        WebElement deleteFirstButton = driver.findElement(By.xpath("//button[text()='Delete'][1]"));
        deleteFirstButton.click();
//        Assert.assertTrue(driver.findElements(By.xpath("//button[text()='Delete'][1]").isEmpty(), "Pass! The Third Delete button is not displayed."));
//        Assert.assertTrue();assertTrue(driver.findElements(By.className("commentEdit")).isEmpty());
    }
}