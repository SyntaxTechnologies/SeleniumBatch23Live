package LiveClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoTestingExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //enter the username
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        //enter the password wrong
        WebElement pass = driver.findElement(By.id("txtPassword"));
        pass.sendKeys("safdsf");
        //clikc on login
        WebElement loginBtn = driver.findElement(By.name("Submit"));
        loginBtn.click();

        Thread.sleep(4000);
         userName = driver.findElement(By.id("txtUsername"));
         userName.sendKeys("Admin");
         pass = driver.findElement(By.id("txtPassword"));
         pass.sendKeys("Hum@nhrm123");
         loginBtn = driver.findElement(By.name("Submit"));
         loginBtn.click();
    }
}
