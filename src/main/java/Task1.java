import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

    private WebDriver driver;
    private String url;
    private String user;
    private String userPass;
    private String title;


    @Before
    public void settings(){
        driver = TestSuite.driver;

        url = "https://us1a.app.anaplan.com/";
        user = "selenium_recrutation@source-corp.com";
        userPass = "K.nowak_0221";
        title = "Anaplan - Supply Chain - For tests";
    }

    @Test
    public void task1() {
        driver.get(url);

        // 1)
        WebElement login = driver.findElement(By.id("username"));
        login.clear();
        login.sendKeys(user);

        WebElement pass = driver.findElement(By.id("password"));
        pass.clear();
        pass.sendKeys(userPass);
        pass.sendKeys(Keys.ENTER);

        // 2)
        driver.findElement(By.xpath("//div[@id='tiles']/div/ul/li/div/div[2]")).click();

        // 3)
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/ul/li/div/a")));

        String currentTitle = driver.getTitle();
        Assert.assertEquals("Page title assert", currentTitle, title);

    }

//    @After
//    public void close(){
//        if (driver != null) {
//            driver.quit();
//        }
//        driver.quit();
//    }

}
