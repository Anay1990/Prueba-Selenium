package scripts;

import dataProviders.dataProvideFinalProyect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AdministrarUsuario;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class ClasePrincipal {

    @Parameters(value = {"firstName", "lastName", "emailAddress", "password", "confirmPassword"})
    @Test
    public void crearUsuarioConXML(String firstName, String lastName, String emailAddress, String password, String confirmPassword) throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        AdministrarUsuario admin = new AdministrarUsuario(driver);
        driver.get(admin.getLink());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        admin.eventoClickXPath("//header[@id='header']/div/div[2]/a[3]/span[2]");
        admin.setearValores(0, "Register");
        admin.setearValores(1, firstName);
        admin.setearValores(2, lastName);
        admin.setearValores(3, emailAddress);
        admin.setearValores(4, password);
        admin.setearValores(5, confirmPassword);
        admin.eventoClickXPath("//form[@id='form-validate']/div[2]/button/span/span");
    }

    @Parameters(value = {"emailAddress", "password"})
    @Test
    public void iniciarSesionConXML(String emailAddress, String password) throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        AdministrarUsuario admin = new AdministrarUsuario(driver);
        driver.get(admin.getLink());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        admin.eventoClickXPath("//header[@id='header']/div/div[2]/a[3]/span[2]");
        admin.setearValores(0, "Log In");
        admin.setearValores(6, emailAddress);
        admin.setearValores(7, password);
        admin.eventoClickId("send2");
    }

    @Parameters(value = {"emailAddress", "password"})
    @Test
    public void MostrarVIP(String emailAddress, String password) throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        AdministrarUsuario admin = new AdministrarUsuario(driver);
        driver.get(admin.getLink());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        admin.eventoClickXPath("//header[@id='header']/div/div[2]/a[3]/span[2]");
        admin.setearValores(0, "Log In");
        admin.setearValores(6, emailAddress);
        admin.setearValores(7, password);
        admin.eventoClickId("send2");
        admin.setearValores(0, "VIP");
    }

    @Parameters(value = {"emailAddress", "password"})
    @Test
    public void MyWichList(String emailAddress, String password) throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        AdministrarUsuario admin = new AdministrarUsuario(driver);
        driver.get(admin.getLink());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        admin.eventoClickXPath("//header[@id='header']/div/div[2]/a[3]/span[2]");
        admin.setearValores(0, "Log In");
        admin.setearValores(6, emailAddress);
        admin.setearValores(7, password);
        admin.eventoClickId("send2");
        admin.eventoClickXPath("//html[@id='top']/body/div/div[2]/div[2]/div/div/div/div[2]/ul/li[8]/a");

    }

    @Parameters(value = {"emailAddress", "password"})
    @Test
    public void cerrarSesion(String emailAddress, String password) throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        AdministrarUsuario admin = new AdministrarUsuario(driver);
        driver.get(admin.getLink());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        admin.eventoClickXPath("//header[@id='header']/div/div[2]/a[3]/span[2]");
        admin.setearValores(0, "Log In");
        admin.setearValores(6, emailAddress);
        admin.setearValores(7, password);
        admin.eventoClickId("send2");
        admin.eventoClickXPath("//header[@id='header']/div/div[2]/a[3]/span[2]");
        admin.setearValores(0, "Log Out");
     }
}
