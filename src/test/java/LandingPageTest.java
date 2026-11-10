import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPageTest {
    @Test
    void landingPageLoads() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);

            driver.get("https://auto-test-site.vercel.app/elements.html");
            ElementsPage page = new ElementsPage(driver);
            Assertions.assertEquals("Elements & Forms", page.getHeadingText());


            driver.quit();
        }


    }

