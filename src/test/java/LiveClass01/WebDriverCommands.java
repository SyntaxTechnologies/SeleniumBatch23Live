package LiveClass01;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {
//        goto facebook.com
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");
//        maximize the window
        driver.manage().window().maximize();
//        get the title
        String titleOftheWebPage = driver.getTitle();

        System.out.println("the title of the webPage is "+titleOftheWebPage);

         String webPageUrl=driver.getCurrentUrl();
         System.out.println("the url is "+webPageUrl);

         driver.navigate().to("https://www.google.com");

         //for visualziation
        Thread.sleep(2000);

//         go back to facebook.com
        driver.navigate().back();



        driver.quit();















    }
}
