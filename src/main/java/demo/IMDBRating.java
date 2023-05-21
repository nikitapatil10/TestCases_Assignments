package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IMDBRating {
    ChromeDriver driver;
    public void imdbRating()
    {
        this.driver = TestCases.TestCases();
        // Navigate to the URL  https://www.imdb.com/chart/top
        driver.get("https://www.imdb.com/chart/top");
        // Sorting according to "IMDB" rating Using Locator "Name" sort
        WebElement dropDown = driver.findElement(By.name("sort"));
        Select sa = new Select(dropDown);
        sa.selectByValue("ir:descending");
        // Checking for highest IMDB rated movie Using Locator "XPath" //td[@class='ratingColumn imdbRating']/strong
        // Printing the name of the highes IMDB rated movie Using Locator "XPath" //td[@class='ratingColumn imdbRating']/strong
        List<WebElement> list = driver.findElements(By.xpath("//td[@class='ratingColumn imdbRating']/strong"));
        List<WebElement> l = driver.findElements(By.xpath("//td[@class='ratingColumn imdbRating']/preceding-sibling::td[1]"));
        for(int i = 0; i < list.size(); i++)
        {
            String val = list.get(i).getText();
            Double value = Double.parseDouble(val);
            if(value == 9.2)
            {
               System.out.println("The highest IMDB rated movie : "+l.get(i).getText());
            }
        }
        // Printing the total count of movies in table Using Locator "XPath" //tbody[@class='lister-list']/tr
        System.out.println("The total number of movies present in table : "+driver.findElements(By.xpath("//tbody[@class='lister-list']/tr")).size());
        // Sorting the movies table list acording to release date Using Locator "Name" sort
        sa.selectByValue("us:descending");
        // Printing the oldest movie name from the list Using Locator "XPath" //tr[250]/td[@class='titleColumn']/a
        System.out.println("The oldest movie name : "+driver.findElement(By.xpath("//tr[250]/td[@class='titleColumn']/a")).getText());
        // Printing the most recent movie name from the list Using Locator "XPath" //tr[1]/td[@class='titleColumn']/a
        System.out.println("The recent movie name : "+driver.findElement(By.xpath("//tr[1]/td[@class='titleColumn']/a")).getText());
        // Sorting the movie list according to the rating Using Locator "Name" sort
        sa.selectByValue("ir:descending");
        // Printing the most user rated movie name from the list Using Locator "XPath" //td[@class='ratingColumn imdbRating']/strong
        List<WebElement> userList = driver.findElements(By.xpath("//td[@class='ratingColumn imdbRating']/strong"));
        List<Integer> arrlist = new ArrayList<>();
        for(WebElement user : userList)
        {
             String[] noOfUsers = user.getAttribute("title").split(" ");
             String val = noOfUsers[3].replace(",", "");
             int value = Integer.parseInt(val);
             arrlist.add(value);
        }
     // System.out.println(arrlist.size());
     // System.out.println(Collections.max(arrlist));
     // System.out.println(arrlist.indexOf(Collections.max(arrlist))); 
        int highestUserRating = arrlist.indexOf(Collections.max(arrlist));
        System.out.println("The movie name which has most user ratings : "+driver.findElements(By.xpath("//td[@class='titleColumn']/a")).get(highestUserRating).getText());
    }
}
