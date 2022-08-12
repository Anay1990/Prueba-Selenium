package dataProviders;
import io.qameta.allure.Step;
import org.testng.annotations.DataProvider;

public class dataProvideFinalProyect {

    @Step("Iniciar sesión")
    @DataProvider(name = "usuario")
    public static Object[][] accesWeb() {
        return new Object[][]{
                {"fernan.araujo.quintana@gmail.com", "Anay90111329711"},
                {"anay.araujo.quintana@gmail.com", "Anay90111329711"},

        };
    }

    @Step("Crear usuario")
    @DataProvider(name = "crear_usuario")
    public static Object[][] createAccount() {
        return new Object[][]{
                {"Pepe3", "Perez", "pepe3@gmail.com", "Pepe123", "Pepe123"},
                {"Pablo3", "Perez", "pablo3@gmail.com", "Pablo123", "Pablo123"},
        };
    }
}
