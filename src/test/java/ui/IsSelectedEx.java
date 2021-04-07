package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IsSelectedEx {
    WebDriver driver;

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
        driver.manage().window().maximize();
        for(WebElement element:driver.findElements(By.name("webform"))){

            element.click();
            System.out.println(element.isSelected());
            System.out.println("Element name is"+element.getText());
            System.out.println("Element cssValue  is"+element.getCssValue("checked"));
        }

        driver.quit();
    }
}

