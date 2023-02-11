import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class Typos extends BaseTest{
    @Test
    public void typosTest() {
        driver.get("http://the-internet.herokuapp.com/typos");
        String withOrWithoutTypoText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]"))
                .getText();
        assertEquals(withOrWithoutTypoText, "Sometimes you'll see a typo, other times you won't.",
                "Error: the word 'won,t' is misspelled");
    }
}
