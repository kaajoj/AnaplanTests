import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertEquals;


public class Task2 {

    private WebDriver driver;

    @Before
    public void settings(){
        driver = TestSuite.driver;
    }

    @Test
    public void task2() {
        // 1)
        // add checking if opacity = 1

        // 2)
        driver.findElement(By.linkText("Detailed Demand Review")).click();

        // 3)
        assertEquals("Detailed Demand Review", driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[4]/div/div/span[2]")).getText());

    }

}
