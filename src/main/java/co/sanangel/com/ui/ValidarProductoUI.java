package co.sanangel.com.ui;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by AnhellSteve on 8/10/2023
 **/
public class ValidarProductoUI {
    public static final Target BTN_REALIZAR_PEDIDO = Target.the("Visualiza el boton de realizar pedidos")
            .locatedBy("//button[@id='place_order']");
}
