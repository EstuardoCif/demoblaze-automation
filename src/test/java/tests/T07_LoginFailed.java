package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import pages.AuthModal;

public class T07_LoginFailed extends BaseTest {

    @Test
    @Description("Este test verifica que un usuario no pueda comprar iniciar sesión")
    public void loginFailed() throws InterruptedException {
        AuthModal authModal = new AuthModal(driver);
        authModal.openLoginForm();
        authModal.login(TEST_USER, "password");
        driver.switchTo().alert().accept();
    }
}
