package abstracta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.ProductSearchPage;

import static org.testng.Assert.assertEquals;


public class OpenCartTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationError = new StringBuffer();

    public OpenCartTest() {
        System.out.println("Hola desde el constructor");
           }

    @Test
    public void test() throws Exception {  //  @Parameters({"productParam","priceParam"});
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://opencart.abstracta.us/");
        HomePage homePage = new HomePage(driver);
        ProductSearchPage productSearchPage = homePage.search("MacBook");
        ProductPage productPage = productSearchPage.clickProduct("MacBook");
        assertEquals(productPage.getPrice(), "$602.00");
    }

}


