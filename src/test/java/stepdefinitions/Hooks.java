package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Hooks {
	
    public static WebDriver driver;

    static String sysprojectpath = System.getProperty("user.dir");
    
    @Before
    public void openBrowser()  {
    	System.out.println("Called openBrowser");
        System.setProperty("webdriver.chrome.driver",
                sysprojectpath + "//drivers//chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    }

     
    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void closeBrowser( ) {

        driver.quit();
    }
    
}