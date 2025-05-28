package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private static final By ADD_TO_CART_BUTTON = By.xpath("//a[text()='Add to cart']");
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Agregar producto al carrito")
    public void addToCart() throws InterruptedException {
        driver.findElement(ADD_TO_CART_BUTTON).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
    }
}
