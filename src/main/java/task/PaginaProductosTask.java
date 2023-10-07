package task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.List;
import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.PaginaProductosUI.*;

/**
 * Created by AnhellSteve on 6/10/2023
 **/
public class PaginaProductosTask implements Task {
    private List<WebElementFacade> listaProductos;
    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new Random();
        listaProductos = LI_PRODUCTOS.resolveAllFor(actor);
        int productoElegido = random.nextInt(listaProductos.size());
        listaProductos.get(productoElegido).click();
    }
    public static Performable paginaProductosTask(){
        return instrumented(PaginaProductosTask.class);
    }
}
