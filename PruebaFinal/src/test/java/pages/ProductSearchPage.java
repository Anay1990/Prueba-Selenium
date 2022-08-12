package pages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPage {
    private static WebDriver driver;
    public ProductSearchPage(WebDriver driver) {
      ProductSearchPage.driver = driver;
      PageFactory.initElements(driver,this);
    }
    @Step("Haciendo click en el producto")
    public ProductPage clickProduct(String product){
        WebElement productLink = driver.findElement(new By.ByLinkText(product));
        productLink.click();
        return new ProductPage(driver);
    }
}
