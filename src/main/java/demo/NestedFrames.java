package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class NestedFrames {
    ChromeDriver driver;
    public void nestedFrames()
    {
        this.driver = TestCases.TestCases();
        // Navigate to the url  https://the-internet.herokuapp.com/nested_frames
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        // Swithcing to the parent frame Using Locator "Name" frame-top
        driver.switchTo().frame("frame-top");
        // Swithcing to the first frame Using Locator "Name" frame-left
        driver.switchTo().frame("frame-left");
        // Printing the text of first frame  Using Locator "XPath" //html/body
        System.out.println("The text present on top left frame : "+driver.findElement(By.xpath("//html/body")).getText());
        // Switching to parent frame
        driver.switchTo().parentFrame();
        // Switching to second frame Using Locator "Name" frame-middle
        driver.switchTo().frame("frame-middle");
        // Printing the text of second frame  Using Locator "XPath" //html/body/div
        System.out.println("The text present on top middle frame : "+driver.findElement(By.xpath("//html/body/div")).getText());
        // Switching to parent frame
        driver.switchTo().parentFrame();
        // Switching to third frame Using Locator "Name" frame-right
        driver.switchTo().frame("frame-right");
        // Printing the text of third frame Using Locator "XPath" //html/body
        System.out.println("The text present on top right frame : "+driver.findElement(By.xpath("//html/body")).getText());
        // Switching to parent frame Using Locator "Name" frame-top
        driver.switchTo().defaultContent();
        // Switching to bottom frame Using Locator "Name" frame-bottom
        driver.switchTo().frame("frame-bottom");
        // Printing the text of bottom frame Using Locator "XPath" //html/body
        System.out.println("The text present on bottom frame : "+driver.findElement(By.xpath("//html/body")).getText());
        driver.switchTo().defaultContent();
    }
}
