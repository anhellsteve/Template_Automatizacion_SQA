package co.sanangel.com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.sanangel.com.ui.ValidarProductoUI.BTN_REALIZAR_PEDIDO;

/**
 * Created by AnhellSteve on 8/10/2023
 **/
public class ValidarProductoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_REALIZAR_PEDIDO.resolveFor(actor).isVisible();
    }
    public static Question validarProductoQuestion() {
        return new ValidarProductoQuestion();
    }
}
