package part0.com.w3school.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HtmlTutorialPage {

    private WebDriver driver;

    @FindBy(css = "h1.ws-grey")
    private WebElement pageTitle;

    @FindBy(linkText = "Try it Yourself »")
    private WebElement tryItButton;

    public HtmlTutorialPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getPageTitle() {
        return pageTitle;
    }

    public void clickTryIt() {
        tryItButton.click();
    }
}