package com.cinte.qa.pruebacompra.tasks;

import com.cinte.qa.pruebacompra.interactions.Esperar;
import com.cinte.qa.pruebacompra.interactions.Swipe;
import com.cinte.qa.pruebacompra.interactions.WaitElement;
import com.cinte.qa.pruebacompra.pages.ProductosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.core.Serenity.takeScreenshot;

public class FinalizarCompra implements Task {


    String correo = "micorreo@gmail.com";




    @Override
    @Step("{0} Finaliza la compra de los productos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElement.untilAppears(ProductosPage.TERMINOS_CONDICIONES));
        takeScreenshot();
        actor.attemptsTo(Click.on(ProductosPage.TERMINOS_CONDICIONES));
        takeScreenshot();
        actor.attemptsTo(Click.on(ProductosPage.BOTON_FINALIZAR_COMPRA));
        takeScreenshot();
        actor.attemptsTo(WaitElement.untilAppears(ProductosPage.EMAIL));
        actor.attemptsTo(Enter.theValue(correo).into(ProductosPage.EMAIL));
        takeScreenshot();
        actor.attemptsTo(Click.on(ProductosPage.BOTON_CONTINUAR));
        takeScreenshot();
        actor.attemptsTo(JavaScriptClick.on(ProductosPage.CONTINUAR_CON_LA_COMPRA));
        //actor.attemptsTo(Click.on(ProductosPage.CONTINUAR_CON_LA_COMPRA));
        takeScreenshot();
        actor.attemptsTo(Swipe.vertical(300));
        actor.attemptsTo(Click.on(ProductosPage.DIA_ENTREGA));
        takeScreenshot();
        actor.attemptsTo(Click.on(ProductosPage.BOTON_IR_METODO_DE_PAGO));
        actor.attemptsTo(WaitElement.untilAppears(ProductosPage.PAGO_EN_EFECTIVO));
        actor.attemptsTo(Click.on(ProductosPage.PAGO_EN_EFECTIVO));
        takeScreenshot();
        actor.attemptsTo(WaitElement.untilBeEnabled(ProductosPage.COMPRAR_AHORA));
        actor.attemptsTo(Esperar.por(3000));
        actor.attemptsTo(Click.on(ProductosPage.COMPRAR_AHORA));
        takeScreenshot();
        actor.attemptsTo(Esperar.por(3000));











        actor.attemptsTo(Esperar.por(2000));
        takeScreenshot();

    }

    public static FinalizarCompra delProducto(){

        return Tasks.instrumented(FinalizarCompra.class);
    }
}
