package abstracta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class WebDriveTest2 {
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://opencart.abstracta.us/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logo")));

        WebElement shoppingCart = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title=\"Shopping Cart\"]")));
        shoppingCart.click();

        if (wait.until(ExpectedConditions.textToBe(By.cssSelector("#content p"), "Your shopping cart have the product!"))) {
            System.out.println("El carrito tiene el/los producto/s");
        }

    }
}