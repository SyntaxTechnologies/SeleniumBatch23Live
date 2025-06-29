package liveClas03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");
        driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
//        decalre the isntance of Select class
        Select sel=new Select(dropDown);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByVisibleText("Banana");
        Thread.sleep(2000);
        sel.selectByValue("Apple");

        //multiselect dropdown
        WebElement multiSelectDD = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));

        Select selDD=new Select(multiSelectDD);
        selDD.selectByValue("Cooking");
        selDD.selectByIndex(4);
        Thread.sleep(2000);
        selDD.deselectByIndex(4);

//      how can we check if the dropdown is multiple select or not
        System.out.println("the dropdown is mutli select "+ selDD.isMultiple());



    }
}
