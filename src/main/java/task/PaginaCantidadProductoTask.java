package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.PaginaCantidadProductoUI.*;

/**
 * Created by AnhellSteve on 7/10/2023
 **/
public class PaginaCantidadProductoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("2").into(INPUT_CANTIDAD),
                Click.on(BTN_AGREGAR_CARRITO),
                PaginaIncioTask.paginaIncioTask(),
                PaginaProductosTask.paginaProductosTask(),
                Enter.theValue("5").into(INPUT_CANTIDAD),
                Click.on(BTN_AGREGAR_CARRITO)
        );
    }
    public static Performable paginaCantidadProductoTask(){
        return instrumented(PaginaCantidadProductoTask.class);
    }
}
