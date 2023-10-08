package co.sanangel.com.ui;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by AnhellSteve on 5/10/2023
 **/
public class PaginaInicioUI {
    public static final Target NOMBRE_CATEGORIA =Target.the("elegir categoria")
            .locatedBy("//*[@id=\"sticky-wrapper\"]/header/div[2]/nav[1]/ul/li[2]/a");

}
