package part2.com.saucedemo.base;

import part2.com.saucedemo.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basepage;
    private String url = "https://wwww.saucedemo.com";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
//        basepage = new basePage
    }
}
