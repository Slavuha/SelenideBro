import org.junit.Test;

public class TestWebBro extends BaseTest {
   private final static String baseUrl = "http://automationpractice.com/";

   @Test
           public void testBro() {

      MainPage mainPage = new MainPage();
      mainPage.openSite(baseUrl);
      mainPage.clickOnSingInButton();


   }

}
