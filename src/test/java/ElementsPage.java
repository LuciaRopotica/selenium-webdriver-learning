import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {

    private WebDriver driver;
    private By heading = By.tagName("h1");

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }
}