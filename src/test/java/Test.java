import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
   public static WebDriver driver;


    @org.testng.annotations.Test
   public void openGoogle() {

        /*// instead of system set property for webdriver.chrome.driver and set compatible chromedriver drivers below line use this
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");


        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");*/


    }


    @org.testng.annotations.Test
    public void openSC(){

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.sc.com/in/bank-with-us/online-banking-login/");
        driver.findElement(By.xpath("//button[@title='Login']")).click();
        WebElement OnlineBanking = driver.findElement(By.xpath("//a[@title='Online Banking Login']"));
        if(OnlineBanking.isDisplayed()){
            OnlineBanking.click();
        }
        //driver.findElement(By.xpath("//a[@title='Continue to Login']")).click();



    }
}
