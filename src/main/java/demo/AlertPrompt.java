package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v111.page.model.DialogType;

public class AlertPrompt {
    ChromeDriver driver;
    public void alertPrompt()
    {
        this.driver = TestCases.TestCases();
        // Navigate to URL  https://www.w3schools.com/js/tryit.aspfilename=tryjs_prompt
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.findElement(By.xpath("//*[contains(text(),'Accept all')]")).click();
        // Switch to frame  Using Locator "Name" iframeResult
        driver.switchTo().frame("iframeResult");
        // Click on "Try it" button Using Locator "XPath" //button[text()='Try it']
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        // Printing the text on alert
        System.out.println("The text present on alert prompt : "+driver.switchTo().alert().getText());
        // Entering "Nikita" in alert input box  
        driver.switchTo().alert().sendKeys("Nikita");
        // Accepting the Alert  
        driver.switchTo().alert().accept();
        // Checking the Name is printed Using Locator "ID" demo
        String text = driver.findElement(By.id("demo")).getText();
        if(text.contains("Nikita"))
        {
            System.out.println("In printed text my name is present");
        }
        else
        {
            System.out.println("In printed text my name is not present");
        }
        System.out.println(text);
        
    }
}
