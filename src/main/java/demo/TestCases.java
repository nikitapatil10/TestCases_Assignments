package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    static ChromeDriver driver;
    public static ChromeDriver TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
        System.out.println("Start Test case: testCase");
        // SearchAmazon sa = new SearchAmazon();
        // sa.searchAmazon();

        // BookMyShowCountHyperlink bscp = new BookMyShowCountHyperlink();
        // bscp.bookMyShowCountHyperlink();

        // LinkedInTextPost litp = new LinkedInTextPost();
        // litp.linkedInTextPost();

        SearchNameOnGoogle snog = new SearchNameOnGoogle();
        snog.searchNameOnGoogle();
        
        System.out.println("end Test case: testCase");
    }


}
