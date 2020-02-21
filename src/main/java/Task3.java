import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertEquals;


public class Task3 {

    private WebDriver driver;

    @Before
    public void settings(){
        driver = TestSuite.driver;
    }

    @Test
    public void task3() {
        // 1)


//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/ul/li/div/a")));


//        driver.findElement(By.id("testWait"));
    }

//    @After
//    public void close(){
//        if (driver != null) {
//            driver.quit();
//        }
//        driver.quit();
//    }

}
