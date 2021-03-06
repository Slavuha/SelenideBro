import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement singIn = $("a.login");
    // can not find needed xpath
    final SelenideElement WHOMENBUTTON = $x("//li/a[@title=\"Dresses\"]");
    By womenCategory = By.cssSelector("a[title*='Women']");
    By casualDressesCategory = By.cssSelector("a[title='Women'] + ul a[title='Casual Dresses']");
    By summerDressesCategory = By.cssSelector("a[title='Women'] + ul a[title='Summer Dresses']");

    public MainPage() {

    }

    public void openSite(String url) {
        Selenide.open(url);
    }

    public void clickOnSingInButton() {
        singIn.click();
    }



    public MainPage navigateToSummerDresses() {
        WebDriver driver = new WebDriver() {
            @Override
            public void get(String s) {

            }

            @Override
            public String getCurrentUrl() {
                return null;
            }

            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public List<WebElement> findElements(By by) {
                return null;
            }

            @Override
            public WebElement findElement(By by) {
                return null;
            }

            @Override
            public String getPageSource() {
                return null;
            }

            @Override
            public void close() {

            }

            @Override
            public void quit() {

            }

            @Override
            public Set<String> getWindowHandles() {
                return null;
            }

            @Override
            public String getWindowHandle() {
                return null;
            }

            @Override
            public TargetLocator switchTo() {
                return null;
            }

            @Override
            public Navigation navigate() {
                return null;
            }

            @Override
            public Options manage() {
                return null;
            }
        };
        Actions actions = new Actions(driver);




    WebElement womenLink = driver.findElement(womenCategory);

        WebElement summerDressesLink = driver.findElement(summerDressesCategory);
        actions
                .moveToElement(womenLink)
                .moveToElement(summerDressesLink)
                .click()
                .perform();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.pollingEvery(Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(30));
        wait.ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.elementToBeClickable(womenCategory));

        return new MainPage();
    }


}
