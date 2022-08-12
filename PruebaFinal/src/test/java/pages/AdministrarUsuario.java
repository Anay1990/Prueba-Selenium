package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministrarUsuario {
    private static WebDriver driver;
    public AdministrarUsuario(WebDriver driver) {
        AdministrarUsuario.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "email_address")
    private WebElement emailAddress;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "pass")
    private WebElement pass;
    @FindBy(id = "confirmation")
    private WebElement confirmPassword;
    @Step("Introduciendo valor")
    public void setearValores(int campo, String valor) {
        switch (campo) {
            case 0:
                driver.findElement(new By.ByLinkText(valor)).click();
                break;
            case 1:
                driver.findElement(new By.ById("password")).click();
                firstName.sendKeys(valor);
                break;
            case 2:
                driver.findElement(new By.ById("lastname")).click();
                lastName.sendKeys(valor);
                break;
            case 3:
                driver.findElement(new By.ById("email_address")).click();
                emailAddress.sendKeys(valor);
                break;
            case 4:
                driver.findElement(new By.ById("password")).click();
                password.sendKeys(valor);
                break;
            case 5:
                driver.findElement(new By.ById("confirmation")).click();
                confirmPassword.sendKeys(valor);
                break;
            case 6:
                driver.findElement(new By.ById("email")).click();
                email.sendKeys(valor);
                break;
            case 7:
                driver.findElement(new By.ById("pass")).click();
                pass.sendKeys(valor);
                break;

        }
    }
    @Step("Accediendo a la página Magneto")
    public String getLink(){
        return "http://magento-demo.lexiconn.com ";
    }
    @Step("Click")
    public void eventoClickXPath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    @Step("Enviar")
    public void eventoClickId(String id){
        driver.findElement(new By.ById(id)).click();
    }
}
