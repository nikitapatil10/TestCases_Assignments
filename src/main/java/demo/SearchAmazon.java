package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAmazon {
    ChromeDriver driver;
    public void searchAmazon()
    {
        // Session 4 Activity 1
        this.driver = TestCases.TestCases();
        // Navigate to google URL.  https://www.google.com/
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[text()='Accept all']")).click();
        // Locate the locator for the search box Using Locator "ID" APjFqb
        // Click on the search box Using Locator "ID" APjFqb
        driver.findElement(By.id("APjFqb")).click();
        // Enter the text as "amazon" in search box Using Locator "ID" APjFqb
        driver.findElement(By.id("APjFqb")).sendKeys("amazon");
        // Locate the locator for the google search button Using Locator "XPath" //div[@class='lJ9FBc']/center/input[1]
        // Click on the google search button Using Locator "XPath" //div[@class='lJ9FBc']/center/input[1]
        driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[1]")).click();
        // Locate the locator for the value which return after searching amazon as amazon.in or amazon.com Using Locator "XPath" (//h3[contains(text(),'Amazon.com')])[1]
        // Printing the result wheather the text is displayed or not  
        boolean status = driver.findElement(By.xpath("(//h3[contains(text(),'Amazon.com')])[1]")).isDisplayed();
        System.out.println(status);
    }
}
