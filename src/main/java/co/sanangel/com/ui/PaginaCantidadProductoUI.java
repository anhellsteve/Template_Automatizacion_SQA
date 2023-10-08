package co.sanangel.com.ui;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by AnhellSteve on 7/10/2023
 **/
public class PaginaCantidadProductoUI {
    public static final Target INPUT_CANTIDAD = Target.the("Ingresar cantidad de productos")
            .locatedBy("//input[@class='input-text qty text']");
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Añadir al carrito")
            .locatedBy("//button[@class='single_add_to_cart_button button alt']");
}
