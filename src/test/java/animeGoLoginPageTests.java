import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.animeGoLoginPage;

public class animeGoLoginPageTests extends baseTest{
    @Test

    public void mistakeLoginOperation(){
        animeGoLoginPage animeGoLoginPage = new animeGoLoginPage();
        Selenide.open("/login");
        animeGoLoginPage.authOperation("test@mail.ru", "123456");
        animeGoLoginPage.checkErrorMessage();
    }

}
