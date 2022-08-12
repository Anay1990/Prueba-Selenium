package scripts;

import dataProviders.dataProvideFinalProyect;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AdministrarUsuario;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class ClaseSecundariaDataProvide {
    @Test(dataProvider = "crear_usuario", dataProviderClass = dataProvideFinalProyect.class)
    public void createUserConDataProvider(String firstName,String lastName, String emailAddress, String password, String confirmPassword) throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.get("http://magento-demo.lexiconn.com");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        AdministrarUsuario admin = new AdministrarUsuario(driver);
        admin.eventoClickXPath("//header[@id='header']/div/div[2]/a[3]/span[2]");
        admin.setearValores(0, "Register");
        admin.setearValores(1, firstName);
        admin.setearValores(2, lastName);
        admin.setearValores(3, emailAddress);
        admin.setearValores(4, password);
        admin.setearValores(5, confirmPassword);
        admin.eventoClickXPath("//form[@id='form-validate']/div[2]/button/span/span");


    }
}
