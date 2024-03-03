package org.example.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class Hooks {
    public static WebDriver driver;
    @Before
    public static void open_browser(){
//        String browser = System.getProperty("user.dir") + File.separator + "src"
//                + File.separator + "main" + File.separator
//                + "resources" + File.separator + "chromedriver.exe";
//        String browser=System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe";
        /***********************************************************/
//        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/Downloads/chromedriver-linux64(1)/chromedriver-linux64/chromedriver");
//        WebDriver  driver=new ChromeDriver();
        /*********************************************************/
//        String firfox=System.getProperty("user.dir")+"/src/main/resources/geckodriver";
//        System.setProperty("webdriver.gecko.driver",firfox);
        System.setProperty("webdriver.gecko.driver","/home/hash-pc-8/Downloads/geckodriver-v0.34.0-linux32/geckodriver");
////        driver=new EdgeDriver();
//        //Creating an object of EdgeDriver
       WebDriver  driver = new FirefoxDriver();
        driver.manage().window().maximize();

        //Deleting all the cookies
        driver.manage().deleteAllCookies();
        //Specifiying pageLoadTimeout and Implicit wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        WebDriverManager.firefoxdriver().setup();
//        driver=new FirefoxDriver();
        driver.get("https://gdawel.app/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().maximize();
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

    }

//    @After
//    public static void quit_browser(){
//        driver.quit();
//    }
}
