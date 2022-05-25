import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Enabled;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AutorizathionPage {

    private final SelenideElement fieldEmail = $x("//input[@name=\"email_create\"]");
    private final SelenideElement registeryButton = $x("//i [@class=\"icon-user left\"]");
    private final SelenideElement name = $x("//*[@name=\"customer_firstname\"]");
    Faker faker = new Faker();

    public void enterEmail(){
        fieldEmail.setValue(faker.internet().emailAddress());
    }

    public void clickOnRegisteryButtun(){
        registeryButton.click();
    }


    public AutorizathionPage waitOnPage() {
        WebDriver driver= new WebDriver() {
      // Я не понял чего оно переопределило все эти методы со старта, но решил их не трогать пусть работает
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
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.pollingEvery(Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(30));
        wait.ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.elementToBeClickable(name));
        return this;}




}
