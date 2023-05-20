package demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInTextPost {
    ChromeDriver driver;
    public void linkedInTextPost()
    {
        this.driver = TestCases.TestCases();
        // Navigate to LinkedIn URL   https://www.linkedin.com/home
        driver.get("https://www.linkedin.com/home");
        // Enter the username in "Email or phone" textbox  Using Locator "ID" session_key
        driver.findElement(By.id("session_key")).sendKeys("example@abc.com");
        // Enter the password in "Password" textbox Using Locator "ID" session_password
        driver.findElement(By.id("session_password")).sendKeys("*************");
        // Click on "Sign In" button Using Locator "XPath" //input[@value='homepage-basic_sign-in-submit']/following-sibling::button
        driver.findElement(By.xpath("//input[@value='homepage-basic_sign-in-submit']/following-sibling::button")).click();
        // Clicking on Profile Icon Using Locator "XPath" //*[@class='global-nav__icon global-nav__icon--small']
       
        driver.findElement(By.xpath("//*[@class='global-nav__icon global-nav__icon--small']")).click();
        // Click on "View Profile" button Using Locator "XPath" //*[text()='View Profile']
        driver.findElement(By.xpath("//*[text()='View Profile']")).click();
        // Print the count of "Who's viewed your profile"  Using Locator "XPath" //*[contains(text(),'profile views')][1]
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
        System.out.println("Printing total count of Who's viewed your profile : "+driver.findElement(By.xpath("//*[contains(text(),'profile views')][1]")).getText());
        // Print the count of "Impressions of your post" Using Locator "XPath" //*[contains(text(),'post impressions')][1]
        System.out.println("Printing total count of Who's viewed your profile : "+driver.findElement(By.xpath("//*[contains(text(),'post impressions')][1]")).getText());
        // Back to home page using back
        js.executeScript("window.scrollBy(0,0)");
        driver.navigate().back();
       
        // Click on start post button Using Locator "XPATH" //div[@class='share-box-feed-entry__top-bar']/button
        driver.findElement(By.xpath("//div[@class='share-box-feed-entry__top-bar']/button")).click();
        // Click on dropdown button Using Locator "XPath" //*[@class='share-unified-settings-entry-button__lockup-content artdeco-entity-lockup__content ember-view']
        driver.findElement(By.xpath("//*[@class='share-unified-settings-entry-button__lockup-content artdeco-entity-lockup__content ember-view']")).click();
        // Select option Connections only Using Locator "ID" CONNECTIONS_ONLY
        driver.findElement(By.id("CONNECTIONS_ONLY")).click();
        driver.findElement(By.xpath("//*[text()='Done']")).click();
        // Enter a message in texbox Using Locator "XPath" //div[@class='editor-content ql-container']
        driver.findElement(By.xpath("//div[@class='editor-content ql-container']/div")).click();
        driver.findElement(By.xpath("//div[@class='editor-content ql-container']/div")).sendKeys("Automated message");
        // Click on post Using Locator "XPath" //*[text()='Post']
        driver.findElement(By.xpath("//*[text()='Post']")).click();
        // Checking the post is posted successfully uploaded Using Locator "XPath" //*[text()='Post successful.']
        System.out.println("The text is successfully posted : "+driver.findElement(By.xpath("//*[text()='Post successful.']")).isDisplayed());
    }
}
