import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task2 {

    private WebDriver driver;

    @Before
    public void settings(){
        driver = TestSuite.driver;
    }

    @Test
    public void task2() {
        driver.findElement(By.linkText("Detailed Demand Review")).click();

        driver.findElement(By.id("testWait"));
    }

    @After
    public void close(){
        if (driver != null) {
            driver.quit();
        }
        driver.quit();
    }

}
