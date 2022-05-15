import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

abstract public class BaseTest {
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1366*768";
        Configuration.headless = true;
    }

    @Before
    public void init(){
        setUp();
    }

    @After
    public void close(){

        Selenide.closeWebDriver();
    }
}

