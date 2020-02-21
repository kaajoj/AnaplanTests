import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;


public class Task3 {

    private WebDriver driver;
//    private String filter;

    @Before
    public void settings(){
        driver = TestSuite.driver;


//        filter = "H1 FY20";
    }

    @Test
    public void task3() {
        // 1)
        driver.findElement(By.xpath("//span[@id='uniqName_51_11']/span[3]")).click();
        driver.findElement(By.id("dijit__TreeNode_4_label")).click();
//        WebElement changeDate = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div[4]/div/div[1]/span[2]/span/span/span[2]"));
//        changeDate.click();
//        changeDate.sendKeys(filter);

//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/ul/li/div/a")));


        driver.findElement(By.id("testWait"));
    }

//    @After
//    public void close(){
//        if (driver != null) {
//            driver.quit();
//        }
//        driver.quit();
//    }

}
