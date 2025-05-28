package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.HomePage;
import pages.PlaceOrderModal;
import pages.ProductPage;

public class T01_PurchasePhoneWithoutSession extends BaseTest {

    @Test
    @Description("Este test verifica que un usuario pueda comprar un teléfono sin iniciar sesión")
    public void purchasePhoneWithoutSession() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        PlaceOrderModal placeOrderModal = new PlaceOrderModal(driver);

        homePage.goToCategory("Phones");
        homePage.selectProduct("Samsung galaxy s6");
        productPage.addToCart();
        homePage.goToCart();
        cartPage.clickPlaceOrder();

        placeOrderModal.fillForm("Nelson", "Guatemala", "Guatemala", "262626262626", "12", "2028");
        placeOrderModal.confirmPurchase();
        placeOrderModal.closeConfirmationModal();
    }
}
