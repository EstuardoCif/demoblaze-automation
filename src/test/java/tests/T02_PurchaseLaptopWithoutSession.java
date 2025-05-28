package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.HomePage;
import pages.PlaceOrderModal;
import pages.ProductPage;

public class T02_PurchaseLaptopWithoutSession extends BaseTest {

    @Test
    @Description("Este test verifica que un usuario pueda comprar una laptop sin iniciar sesión")
    public void purchaseLaptoptWithoutSession() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        PlaceOrderModal placeOrderModal = new PlaceOrderModal(driver);

        homePage.goToCategory("Laptops");
        homePage.selectProduct("Sony vaio i5");
        productPage.addToCart();
        homePage.goToCart();
        cartPage.clickPlaceOrder();

        placeOrderModal.fillForm("Nelson", "Guatemala", "Guatemala", "262626262626", "12", "2028");
        placeOrderModal.confirmPurchase();
        placeOrderModal.closeConfirmationModal();
    }
}
