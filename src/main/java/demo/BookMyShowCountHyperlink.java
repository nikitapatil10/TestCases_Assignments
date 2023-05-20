package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShowCountHyperlink {
    ChromeDriver driver;
    public void bookMyShowCountHyperlink()
    {
        this.driver = TestCases.TestCases();
        // Navigate to URL  https://in.bookmyshow.com/explore/home/chennai
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        // Locate the locator for hyperlink by using  Using Locator "Tag Name" a
        List<WebElement> list = driver.findElements(By.tagName("a"));
        // Get count of the hyperlinks Using Locator "Tag Name" a
        System.out.println("Total count of HyperLinks present on webpage : "+list.size());
    }
}
