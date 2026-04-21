package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {

    private WebDriver driver;

    @Test
    public void runTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com");
        driver.switchTo().frame("fast-cmp-iframe");
        driver.findElement(By.cssSelector("span>button.fast-cmp-button-primary")).click();
        driver.quit();
    }

}
