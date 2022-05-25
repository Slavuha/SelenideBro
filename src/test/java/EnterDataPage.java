import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class EnterDataPage {
    private final SelenideElement name = $x("//*[@name=\"customer_firstname\"]");
    private final SelenideElement lastName = $x("//*[@name=\"customer_lastname\"]");
    private final SelenideElement pasword = $x("//*[@name=\"passwd\"]");
    private final SelenideElement radioButton = $x("//*[@id=\"id_gender1\"]");
    private final SelenideElement addres = $x("//*[@name=\"address1\"]");
    private final SelenideElement city = $x("//*[@name=\"city\"]");
    private final SelenideElement cityClick = $x("//*[@name=\"id_state\"]//*[@value=\"1\"]");
    private final SelenideElement mobile = $x("//*[@id=\"phone_mobile\"]");
    private final SelenideElement zip = $x("//*[@class=\"form-control uniform-input text\"]");
    private final SelenideElement registerButtonFinal = $x("//*[text()=\"Register\"]");
    private final SelenideElement contactUs = $x("//*[text()=\"Register\"]");
    private final SelenideElement phone = $x("//* [@name=\"phone\"]");
    Faker faker = new Faker();

    public void enterFakeData() {
        //$(name).shouldBe(visible, Duration.ofSeconds(30));
  //  name.shouldBe(visible, Duration.ofSeconds(33).getSeconds(33));
   // name.should(appear);
        name.setValue(faker.name().firstName());
    lastName.setValue(faker.name().lastName());
    pasword.setValue(faker.internet().password());
    radioButton.click();
    addres.setValue(faker.address().streetAddress());
    city.setValue(faker.address().city());
    cityClick.click();
    mobile.setValue(faker.phoneNumber().phoneNumber());
    zip.setValue(faker.address().zipCode());
    phone.setValue(faker.phoneNumber().phoneNumber());
    registerButtonFinal.click();
}

}
