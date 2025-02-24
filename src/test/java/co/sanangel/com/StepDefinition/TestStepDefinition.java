package co.sanangel.com.StepDefinition;

import co.sanangel.com.questions.ValidarProductoQuestion;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import co.sanangel.com.task.PaginaCantidadProductoTask;
import co.sanangel.com.task.PaginaIncioTask;
import co.sanangel.com.task.PaginaProductosTask;

public class TestStepDefinition {
    @Managed(driver="chrome")
    private WebDriver browser;
    private Actor user = Actor.named("user");

    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(browser));
    }

    @Dado("que el usuario abra la url en el navegador")
    public void abrirUrl() {
        user.wasAbleTo(
                Open.url("https://sanangel.com.co/")
        );
    }
    @Cuando("el usuario seleccione una categoria")
    public void elegirCategoria() {
        user.attemptsTo(
                PaginaIncioTask.paginaIncioTask()
        );
    }
    @Cuando("el usuario seleccione un producto sus cantidades y lo agregue al carrito")
    public void elegirProducto() {
        user.attemptsTo(
                PaginaProductosTask.paginaProductosTask(),
                PaginaCantidadProductoTask.paginaCantidadProductoTask()
        );
    }

    @Entonces("podra ver boton para realizar el pedido")
    public void verPedido() {
        ValidarProductoQuestion.validarProductoQuestion();
    }
}
