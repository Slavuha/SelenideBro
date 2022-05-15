import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
private final SelenideElement singIn = $x("a.login");

public void clickOnSingInButton(){
    singIn.click();
}
public void openSite(String url){
    Selenide.open(url);
}
}
