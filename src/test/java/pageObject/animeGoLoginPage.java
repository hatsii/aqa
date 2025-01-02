package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class animeGoLoginPage {
    private static final SelenideElement userLoginInput = $(By.id("username"));
    private static final SelenideElement userPasswordInput = $(By.id("password"));
    private static final SelenideElement submitButton = $(By.id("_submit"));
    private static final SelenideElement errorsMessage = $(By.xpath("//div[text()=\"Недействительные аутентификационные данные.\"]"));

    public void authOperation(String login, String password){
        setUserLogin(login);
        setUserPassword(password);
        clickButton();
    }

    public void setUserLogin (String login){
        userLoginInput.shouldBe(visible).setValue(login);
    }
    public void setUserPassword (String password){
       userPasswordInput.shouldBe(visible).setValue(password);
    }
    public void clickButton(){
        submitButton.shouldBe(visible).click();
    }

    public void checkErrorMessage(){
        errorsMessage.shouldBe(visible);
    }

}
