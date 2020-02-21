import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Task1 {

    private WebDriver driver;
    private String url;
    private String user;
    private String userPass;

    @Before
    public void settings(){
//        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();

        url = "https://us1a.app.anaplan.com/";
        user = "selenium_recrutation@source-corp.com";
        userPass = "K.nowak_0221";
        String title = "Supply Chain – For tests";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void login() throws InterruptedException {
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
        driver.getTitle();

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
