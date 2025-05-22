import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class firstTest {
   public static WebDriver driver;

    @Test
    public void openGoogle() {
        /*// instead of system set property for webdriver.chrome.driver and set compatible chromedriver drivers below line use this
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");*/
    }

    @Test
    public void openSC() {
        // Setup ChromeDriver using WebDriverManager for automatic driver management
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://www.sc.com/in/");
            // Use WebDriverWait for synchronization
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Login']"))).click();
            WebElement onlineBanking = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Online Banking Login']")));
            if (onlineBanking.isDisplayed()) {
                onlineBanking.click();
            }
            // Optionally, wait for the next page or element to ensure navigation
            // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Continue to Login']")));
        } finally {
            // Ensure the driver quits even if the test fails
            driver.quit();
        }
    }
}
