package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//En esta página tenemos un método para hacer click en el
// producto q se buscóy devuelve la pagina del producto

public class ProductPage {
    private static WebDriver driver;

    ProductPage(WebDriver driver) {
        ProductPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "li h2")
    private WebElement price;

    @FindBy(css = "div.btn-group button.dropdown-toggle")
    private WebElement currencySelected;

    @Step("Obteniendo precio del producto")
    public String getPrice() {
        return price.getText();
    }

    @Step("Accediendo a la página Magneto")
    public static String getLink(){
        return "http://magento-demo.lexiconn.com ";
    }

    }
