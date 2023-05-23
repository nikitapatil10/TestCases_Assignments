package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class LinkedInPhotoUpload {
    ChromeDriver driver;
    public void linekedInPhotoUpload() throws InterruptedException, AWTException
    {
       // Navigate to linkedin url https://www.linkedin.com/home
       driver.get("https://www.linkedin.com/home");
       // Enter the username in "Email or phone" textbox Using Locator "ID" session_key
       driver.findElement(By.id("session_key")).sendKeys("example@abc.com");
       // Enter the password in "Password" textbox Using Locator "ID" session_password
       driver.findElement(By.id("session_password")).sendKeys("*************");
       // Click on "Sign in" button Using Locator "XPath"
       // //input[@value='homepage-basic_sign-in-submit']/following-sibling::button
       driver.findElement(By.xpath("//input[@value='homepage-basic_sign-in-submit']/following-sibling::button"))
               .click();
       // Click on photo button Using Locator "XPath" (//button[@aria-label='Add a
       // photo'])[1]
       driver.findElement(By.xpath("(//button[@aria-label='Add a photo'])[1]")).click();
       Thread.sleep(2000);
       Robot robot = new Robot();
       StringSelection filepath = new StringSelection("Downloads\\image.jpeg");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
       Thread.sleep(2000);
       robot.keyPress(KeyEvent.VK_CONTROL);
       Thread.sleep(2000);
       robot.keyPress(KeyEvent.VK_V);
       Thread.sleep(2000);
       robot.keyRelease(KeyEvent.VK_CONTROL);

       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(2000);
       // WebElement photo =
       // driver.findElement(By.xpath("//div[@class='image-sharing-detour-container__upload-media-button']"));
       // photo.sendKeys("//Users//vinisworld//Desktop//image.png");
       // Click on Done button Using Locator "XPath"
       // //div[@class='share-box-footer__main-actions']/button[2]
       driver.findElement(By.xpath("//*[text()='Done']")).click();
       // Check that the photo is posted successfuly Using Locator "XPath"
       // //*[text()='Post successful.']
       driver.findElement(By.xpath("//*[text()='Post']")).click();
       boolean status = driver.findElement(By.xpath("/*[text()='Post successful.']")).isDisplayed();
       System.out.println(status);
    }
}
