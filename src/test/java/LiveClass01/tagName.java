package LiveClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {
        //goto ebay .com
        //get all the links and print those links on the screen

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.ebay.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
      int count =1;
      for (WebElement link :allLinks){

          String actualLink=link.getAttribute("href");

          System.out.println(count+" "+actualLink);
          count=count+1;

      }


    }
}
