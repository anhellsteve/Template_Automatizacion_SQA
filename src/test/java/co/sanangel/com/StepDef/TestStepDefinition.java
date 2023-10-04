package co.sanangel.com.StepDef;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class TestStepDefinition {

    @Managed(driver="chrome")
    private WebDriver browser;
    private Actor user = Actor.named("user");

    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(browser));
    }

    @Dado("que el usuario abra la url en el navegador")
    public void queElUsuarioAbraLaUrlEnElNavegador() {
        user.wasAbleTo(
                Open.url("https://sanangel.com.co/")
        );
    }
    @Cuando("el usuario seleccione una categoria")
    public void elUsuarioSeleccioneUnaCategoria() {

    }
    @Cuando("el usuario seleccione un producto sus cantidades y lo agregue al carrito")
    public void elUsuarioSeleccioneUnProductoSusCantidadesYLoAgregueAlCarrito() {

    }
}
