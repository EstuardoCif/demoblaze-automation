package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static final By CART_LINK = By.id("cartur");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Ir a la categoría {categoria}")
    public void goToCategory(String categoria) throws InterruptedException {
        driver.findElement(By.linkText(categoria)).click();
        Thread.sleep(1000);
    }

    @Step("Seleccionar el producto {producto}")
    public void selectProduct(String nombreProducto) throws InterruptedException {
        driver.findElement(By.linkText(nombreProducto)).click();
        Thread.sleep(1000);
    }

    @Step("Ir al carrito")
    public void goToCart() throws InterruptedException {
        driver.findElement(CART_LINK).click();
        Thread.sleep(1000);
    }
}
