import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        Task1.class,
        Task2.class,

})


public class TestSuite {
    public static WebDriver driver;


    @BeforeClass
    public static void setUp() {
//        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
//        driver = new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}

