package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;

public class T08_PurchaseMonitorWithSession extends BaseTest {

    @Test
    @Description("Este test verifica que un usuario pueda comprar un monitor con la sesión iniciada")
    public void purchaseMonitorWithSession() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        PlaceOrderModal placeOrderModal = new PlaceOrderModal(driver);
        AuthModal authModal = new AuthModal(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        authModal.openLoginForm();
        authModal.login(TEST_USER, TEST_PASS);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("nameofuser"), TEST_USER));

        homePage.goToCategory("Monitors");
        homePage.selectProduct("Apple monitor 24");
        productPage.addToCart();
        homePage.goToCart();
        cartPage.clickPlaceOrder();

        placeOrderModal.fillForm("Nelson", "Guatemala", "Guatemala", "262626262626", "12", "2028");
        placeOrderModal.confirmPurchase();
        placeOrderModal.closeConfirmationModal();
    }
}
