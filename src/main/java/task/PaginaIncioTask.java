package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.PaginaInicioUI.NOMBRE_CATEGORIA;

/**
Created by AnhellSteve on 5/10/2023
**/
public class PaginaIncioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NOMBRE_CATEGORIA)
        );
    }
    public static Performable paginaIncioTask() {
        return instrumented(PaginaIncioTask.class);
    }
}
