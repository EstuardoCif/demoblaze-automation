package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderModal {
    private static final By NAME_INPUT = By.id("name");
    private static final By COUNTRY_INPUT = By.id("country");
    private static final By CITY_INPUT = By.id("city");
    private static final By CARD_INPUT = By.id("card");
    private static final By MONTH_INPUT = By.id("month");
    private static final By YEAR_INPUT = By.id("year");
    private static final By PURCHASE_BUTTON = By.xpath("//button[text()='Purchase']");
    private static final By OK_BUTTON = By.xpath("//button[text()='OK']");
    private WebDriver driver;

    public PlaceOrderModal(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Llenar El Formulario De Compra")
    public void fillForm(String nombre, String pais, String ciudad, String tarjeta, String mes, String anio) throws InterruptedException {
        driver.findElement(NAME_INPUT).sendKeys(nombre);
        driver.findElement(COUNTRY_INPUT).sendKeys(pais);
        driver.findElement(CITY_INPUT).sendKeys(ciudad);
        driver.findElement(CARD_INPUT).sendKeys(tarjeta);
        driver.findElement(MONTH_INPUT).sendKeys(mes);
        driver.findElement(YEAR_INPUT).sendKeys(anio);
        Thread.sleep(1000);
    }

    @Step("Click En Confirmar Compra")
    public void confirmPurchase() throws InterruptedException {
        driver.findElement(PURCHASE_BUTTON).click();
        Thread.sleep(1000);
    }

    @Step("Cerrar Modal De Aceptación")
    public void closeConfirmationModal() throws InterruptedException {
        driver.findElement(OK_BUTTON).click();
        Thread.sleep(1000);
    }
}
