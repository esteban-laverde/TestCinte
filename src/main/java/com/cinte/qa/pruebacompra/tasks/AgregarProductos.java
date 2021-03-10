package com.cinte.qa.pruebacompra.tasks;

import com.cinte.qa.pruebacompra.interactions.Esperar;
import com.cinte.qa.pruebacompra.interactions.Swipe;
import com.cinte.qa.pruebacompra.pages.ProductosPage;
import com.sun.el.parser.AstGreaterThanEqual;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.core.Serenity.takeScreenshot;

public class AgregarProductos implements Task {


    @Override
    @Step("{0} Agrega producto al carrito")

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Swipe.vertical(300));
        actor.attemptsTo(Click.on(ProductosPage.GALAXYA10S));
        actor.attemptsTo(Swipe.vertical(300));
        takeScreenshot();
        actor.attemptsTo(Click.on(ProductosPage.BOTON_AGREGAR_CARRITO));
        actor.attemptsTo(Esperar.por(2000));
        takeScreenshot();
    }

    public static AgregarProductos alCarro(){
        return Tasks.instrumented(AgregarProductos.class );

    }
}
