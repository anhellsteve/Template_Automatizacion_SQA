package co.sanangel.com.ui;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by AnhellSteve on 6/10/2023
 **/
public class PaginaProductosUI {
    public static final Target LI_PRODUCTOS = Target.the("Lista de Productos")
            .locatedBy("//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']");

}
