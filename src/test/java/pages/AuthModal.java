package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthModal {

    private static final By SIGN_UP_BUTTON = By.id("signin2");
    private static final By SIGN_UP_USERNAME = By.id("sign-username");
    private static final By SIGN_UP_PASSWORD = By.id("sign-password");
    private static final By SIGN_UP_CONFIRM_BUTTON = By.xpath("//button[text()='Sign up']");
    private static final By LOGIN_BUTTON = By.id("login2");
    private static final By LOGIN_USERNAME = By.id("loginusername");
    private static final By LOGIN_PASSWORD = By.id("loginpassword");
    private static final By LOGIN_CONFIRM_BUTTON = By.xpath("//button[text()='Log in']");
    private WebDriver driver;

    public AuthModal(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Abrir Formulario De Registro")
    public void openRegisterForm() throws InterruptedException {
        driver.findElement(SIGN_UP_BUTTON).click();
        Thread.sleep(1000);
    }

    @Step("Registrarse En La Página")
    public void register(String usuario, String password) throws InterruptedException {
        driver.findElement(SIGN_UP_USERNAME).sendKeys(usuario);
        driver.findElement(SIGN_UP_PASSWORD).sendKeys(password);
        driver.findElement(SIGN_UP_CONFIRM_BUTTON).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
    }

    @Step("Abrir Formulario de Login")
    public void openLoginForm() throws InterruptedException {
        driver.findElement(LOGIN_BUTTON).click();
        Thread.sleep(1000);
    }

    @Step("Iniciar Sesión En La Página")
    public void login(String usuario, String password) throws InterruptedException {
        driver.findElement(LOGIN_USERNAME).sendKeys(usuario);
        driver.findElement(LOGIN_PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_CONFIRM_BUTTON).click();
        Thread.sleep(1000);
    }
}
