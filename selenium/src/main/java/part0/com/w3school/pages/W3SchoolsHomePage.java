package part0.com.w3school.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// PageObject
public class W3SchoolsHomePage {

    private WebDriver driver;

    @FindBy(linkText = "Learn HTML")
    private WebElement learnHtmlButton;

    public W3SchoolsHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLearnHtml() {
        learnHtmlButton.click();
    }
}
