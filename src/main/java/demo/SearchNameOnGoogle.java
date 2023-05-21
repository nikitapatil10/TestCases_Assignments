package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchNameOnGoogle {
    ChromeDriver driver;
    public void searchNameOnGoogle()
    {
        this.driver = TestCases.TestCases();
        // Navigate to the google URL.  https://www.google.com/
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[text()='Accept all']")).click();
        // Locate the locator for the search box Using Locator "Name" q
        // Click on the search box Using Locator "Name" q
        driver.findElement(By.name("q")).click();
        // Enter the text "nikita" in search box Using Locator "Name" q
        driver.findElement(By.name("q")).sendKeys("nikita");
        // Locate the locator for the google search button Using Locator "XPath" (//input[@value='Google Search'])[1]
        // Click on the google search button Using Locator "XPath" (//input[@value='Google Search'])[1]
        driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
        // Locate the locator for the links present on Webpage Using Locator "Tag Name" h3
        List<WebElement> list = driver.findElements(By.tagName("h3"));
        // Get the text of that links Using Locator "Tag Name" h3
        int count =0;
        for(WebElement l : list)
        {
            if(l.getText().contains("nikita") || l.getText().contains("Nikita"))
            {
                count = count + 1;
            }
        }
        // Count the total number of links which contains text as "nikita' Using Locator "Tag Name" h3
        System.out.println("Total number of links present on webpage which contains my name : "+count);
    }
    
}
