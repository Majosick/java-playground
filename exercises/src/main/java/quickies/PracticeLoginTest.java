package quickies;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


//comment
public class PracticeLoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://example.com");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement usernameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtUsername")));

            WebElement passwordInput = driver.findElement(By.id("txtPassword"));

            WebElement loginButton = driver.findElement(By.id("btnLogin"));

            usernameInput.sendKeys("username");

            passwordInput.sendKeys("password");

            loginButton.click();

            WebElement welcomeMessage = driver.findElement(By.id("wlcmMsg"));

            if (welcomeMessage.getText().contains("Welcome")) {

                System.out.println("Login Successful");

            } else {

                System.out.println("Login Failed");

            }

        } catch (Exception e) {

            System.err.println("An error occurred: " + e.getMessage());

        } finally {

            driver.quit();

        }

    }

}