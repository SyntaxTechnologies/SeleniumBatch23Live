package liveClass02;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementCommands {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        WebElement juiceRadioBtn=driver.findElement(By.xpath("//input[@value='Juice']"));
        juiceRadioBtn.click();


        List<WebElement> allRb = driver.findElements(By.xpath("//input[@name='working_enviroment']"));

        for(WebElement rb:allRb){
            String option = rb.getAttribute("value");
            rb.getDomAttribute("value");
            if(option.equals("hybrid")){
                rb.click();
            }
        }


//        
        WebElement springRb = driver.findElement(By.xpath("//input[@value='spring']"));
        WebElement enableRbButton = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));

        if(!springRb.isEnabled()){
            enableRbButton.click();
        }

        if(springRb.isEnabled()){
            springRb.click();
        }

        WebElement winterRb = driver.findElement(By.xpath("//input[@value='winter']"));
        WebElement showButton=driver.findElement(By.xpath("//button[@id='showRadioButtons']"));

        boolean stateOfwinterRb = winterRb.isDisplayed();
        System.out.println("the winter radio button is displayed "+stateOfwinterRb);
        if(!stateOfwinterRb){
            showButton.click();
        }
//        verify that it is displayed and available for selection
        System.out.println("the winter button is displayed: "+ winterRb.isDisplayed());


    }
}
