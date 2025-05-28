package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import pages.AuthModal;

public class T05_CreateExistingAccount extends BaseTest {

    @Test
    @Description("Este test verifica que un usuario no pueda crear una cuenta existente")
    public void createExistingAccount() throws InterruptedException {
        AuthModal authModal = new AuthModal(driver);
        authModal.openRegisterForm();
        authModal.register(TEST_USER, TEST_PASS);
    }
}
