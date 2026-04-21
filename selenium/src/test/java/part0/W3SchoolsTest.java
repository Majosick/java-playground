package part0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import part0.com.w3school.pages.HtmlTutorialPage;
import part0.com.w3school.pages.W3SchoolsHomePage;

import java.time.Duration;
import java.util.ArrayList;

// Test
public class W3SchoolsTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void shouldOpenHtmlTutorial() {
        driver.get("https://www.w3schools.com");

        W3SchoolsHomePage homePage = new W3SchoolsHomePage(driver);
        homePage.clickLearnHtml();

        HtmlTutorialPage tutorialPage = new HtmlTutorialPage(driver);

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(tutorialPage.getPageTitle()));

        // Weryfikacja tytułu
        Assert.assertEquals(tutorialPage.getPageTitle(), "HTML Tutorial");

        // Klik Try it
        tutorialPage.clickTryIt();

        // Weryfikacja nowej zakładki
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        Assert.assertEquals(tabs.size(), 2);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}