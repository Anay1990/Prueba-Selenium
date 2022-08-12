package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class HomePage {
    private static WebDriver driver;
//Inicializar el navegador
    public HomePage(WebDriver driver){
        HomePage.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //Buscar la barra de "búsqueda" y la función "Buscar"
    @FindBy(name = "search")
    private WebElement searchBar;

    public ProductSearchPage search(String product){
        searchBar.sendKeys(product);
        searchBar.sendKeys(Keys.ENTER);
        return new ProductSearchPage(driver);

    }
  //Introducir texto
    public ProductSearchPage setValue(String name) {
        searchBar.sendKeys(name);
        return new ProductSearchPage(driver);
    }
}
