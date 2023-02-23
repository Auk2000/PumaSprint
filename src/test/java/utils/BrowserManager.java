package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Homepage;

public class BrowserManager {

    private WebDriver driver;
   private  Homepage homepage;


    public WebDriver getDriver(){
        return driver;
    }
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();

    }
}

