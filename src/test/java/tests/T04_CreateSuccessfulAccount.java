package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import pages.AuthModal;

import java.util.UUID;

public class T04_CreateSuccessfulAccount extends BaseTest {

    @Test
    @Description("Este test verifica que un usuario pueda crear una cuenta de manera exitosa")
    public void createSuccessfulAccount() throws InterruptedException {
        String username = "testuser_" + UUID.randomUUID().toString().substring(0, 8);
        String password = "Test@" + System.currentTimeMillis() % 1000000;

        AuthModal authModal = new AuthModal(driver);
        authModal.openRegisterForm();
        authModal.register(username, password);

        authModal.openLoginForm();
        authModal.login(username, password);

    }
}
