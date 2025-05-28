package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AuthModal;

import java.time.Duration;

public class T06_LoginSuccessful extends BaseTest {

    @Test
    @Description("Este test verifica que un usuario pueda iniciar sesión de manera exitosa")
    public void loginSuccessful() throws InterruptedException {
        AuthModal authModal = new AuthModal(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        authModal.openLoginForm();
        authModal.login(TEST_USER, TEST_PASS);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("nameofuser"), TEST_USER));
    }
}
