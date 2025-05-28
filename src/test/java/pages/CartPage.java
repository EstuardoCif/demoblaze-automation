package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private static final By PLACE_ORDER_BUTTON = By.xpath("//button[text()='Place Order']");
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click en Place Order")
    public void clickPlaceOrder() throws InterruptedException {
        driver.findElement(PLACE_ORDER_BUTTON).click();
        Thread.sleep(1000);
    }
}
