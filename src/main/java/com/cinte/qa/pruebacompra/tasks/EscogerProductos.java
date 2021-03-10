package com.cinte.qa.pruebacompra.tasks;

import com.cinte.qa.pruebacompra.pages.ProductosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.core.Serenity.takeScreenshot;

public class EscogerProductos implements Task {


    @Override
    @Step("{0} Selecciona Categoria de los productos que desea comprar")
    public <T extends Actor> void performAs(T actor) {

        if (ProductosPage.POLITICA_COOKIES.resolveFor(actor).isPresent()){
            actor.attemptsTo(Click.on(ProductosPage.POLITICA_COOKIES));
            takeScreenshot();
        }
        takeScreenshot();
        actor.attemptsTo(Click.on(ProductosPage.MENU_TELEVISORES));


       }

    public static EscogerProductos aComprar(){
        return Tasks.instrumented(EscogerProductos.class );
    }
}
