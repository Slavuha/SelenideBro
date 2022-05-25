
import com.codeborne.selenide.impl.Waiter;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Wait;

public class TestWebBro extends BaseTest {
   private final static String baseUrl = "http://automationpractice.com/";

     @Test
           public void testBro() throws InterruptedException {

      MainPage mainPage = new MainPage();
      mainPage.openSite(baseUrl);
      mainPage.clickOnSingInButton();
      AutorizathionPage autorizathionPage = new AutorizathionPage();
      autorizathionPage.enterEmail();
      autorizathionPage.clickOnRegisteryButtun();
      autorizathionPage.waitOnPage();


      EnterDataPage enterDataPage = new EnterDataPage();
      enterDataPage.enterFakeData();
     //хотел что б после теста был вейт, но что то не заработало как обычно
        autorizathionPage.waitOnPage();

   }
   // Почем 2 тест не находит а запускает с кнопки пуска возле него
   @Test
   public void vtoroiTestNaDobavlenieTovaroVKorziny(){
             MainPage mainPage = new MainPage();
             mainPage.openSite(baseUrl);
             mainPage.navigateToSummerDresses();

   }

}
